(/**
 * @param undefined
 */
function(undefined) {
  "use strict";

  var CarpetCleaningRate;
  var CarpetPreVacRate;
  var CarpetProtectorRate;

  $(document).ready(function() {
    init();
  });

  function init() {
    // bind the change event to their respective handlers...
    $("#groupName").on("change", changeGroupName);
    $("#roomCount").on("change", changeRoomCount);
    $("#upholsteryCount").on("change", changeUpholsteryCount);
    $("input[id^='squareFootage']").on("change", changeSquareFootage);
    $("input[id^='preVacCheck']").on("change", changePreVacCheck);
    $("input[id^='preVacCharge']").on("change", changePreVacCharge);
    $("input[id^='protectorCheck']").on("change", changeProtectorCheck);
    $("input[id^='protectorCharge']").on("change", changeProtectorCharge);

    // prefetch rates for calculations...
    CarpetCleaningRate = getRateByName("CarpetCleaning");
    CarpetPreVacRate = getRateByName("CarpetPreVac");
    CarpetProtectorRate = getRateByName("CarpetProtector");

    // invoke the change handlers for some of the controls above in order
    // to initialize the table rows based on the current selectedIndex...
    changeGroupName(undefined);
    changeRoomCount(undefined);
    changeUpholsteryCount(undefined);
  }

  function changeGroupName(event) {
    var groupNameElement = $("#groupName")[0];

    // First, hide all the rows
    $("#groupRoomTable tbody tr[id^='room']").hide();

    // Next, show the rows based on the selected index of the groupName...
    var selectedIndex = groupNameElement.selectedIndex;
    switch (selectedIndex) {
    case 5:
      $("#groupRoomTable #room5").show();
    case 4:
      $("#groupRoomTable #room4").show();
    case 3:
      $("#groupRoomTable #room3").show();
    case 2:
      $("#groupRoomTable #room2").show();
    case 1:
      $("#groupRoomTable #room1").show();
      break;
    default:
      $("#groupRoomTable #room0").show();
    }

    // Load the rate only when the user updated it (event is defined)...
    if (event) {
      if (selectedIndex > 0) {
        $.ajax({
          type: 'POST',
          url: '/CleaningJob/roomGroup/show/' + selectedIndex + '.json',
          success: function(data, textStatus) {
            $("#groupRate").val(data.groupCharge);
          },
          error: function(XMLHttpRequest, textStatus, errorThrown) {
            console.error(errorThrown);
          }
        });
      } else {
        $("#groupRate").val("");
      }
    }
  }

  function changeRoomCount(event) {
    var roomCountElement = $("#roomCount")[0];

    // First, hide all the rows
    $("#additionalRoomTable tbody tr[id^='room']").hide();

    // Next, show the rows based on the selected index of the roomCount...
    var selectedIndex = roomCountElement.selectedIndex;
    $("#roomCount > option").each(
            function() {
              // This will make sure the first row shows when 00 is
              // selected, but stay hidden if not...
              if ((this.index === selectedIndex)
                      || ((this.index > 0) && (this.index < selectedIndex))) {
                $("#additionalRoomTable #room" + this.value).show();
                $("#visible0" + this.value).val("Y");
              } else {
                $("#visible0" + this.value).val("");
              }
            });

  }

  function changeUpholsteryCount(event) {
    var upholsteryCountElement = $("#upholsteryCount")[0];

    // First, hide all the rows
    $("#upholsteryTable tbody tr[id^='upholstery']").hide();

    // Next, show the rows based on the selected index of the roomCount...
    var selectedIndex = upholsteryCountElement.selectedIndex;
    $("#upholsteryCount > option").each(
            function() {
              // This will make sure the first row shows when 00 is
              // selected, but stay hidden if not...
              if ((this.index === selectedIndex)
                      || ((this.index > 0) && (this.index < selectedIndex))) {
                $("#upholsteryTable #upholstery" + this.index).show();
                $("#uVisible" + this.index).val("Y");
              } else {
                $("#uVisible" + this.index).val("");
              }
            });
  }

  function changeSquareFootage(event) {
    var suffix = getControlNameSuffix(event.currentTarget.name);
    calculateAdditionalRoomCleaningCharge(suffix);
  }

  function changePreVacCheck(event) {

    // get the preVacCheck element that was changed...
    var preVacCheck = $(event.currentTarget);
    var suffix = getControlNameSuffix(preVacCheck[0].name);

    // get the preVacCharge element...
    var preVacCharge = $("#preVacCharge" + suffix);

    // set the rate charge accordingly...
    if (preVacCheck.is(':checked') === true) {
      preVacCharge.val(CarpetPreVacRate.rateCharge.toFixed(2)).change();
    } else {
      preVacCharge.val("").change();
    }
  }

  function changePreVacCharge(event) {
    var suffix = getControlNameSuffix(event.currentTarget.name);
    calculateAdditionalRoomCleaningCharge(suffix);
  }

  function changeProtectorCheck(event) {

    // get the preVacCheck element that was changed...
    var protectorCheck = $(event.currentTarget);
    var suffix = getControlNameSuffix(protectorCheck[0].name);

    // get the preVacCharge element...
    var protectorCharge = $("#protectorCharge" + suffix);

    // set the rate charge accordingly...
    if (protectorCheck.is(':checked') === true) {
      protectorCharge.val(CarpetProtectorRate.rateCharge.toFixed(2)).change();
    } else {
      protectorCharge.val("").change();
    }
  }

  function changeProtectorCharge(event) {
    var suffix = getControlNameSuffix(event.currentTarget.name);
    calculateAdditionalRoomCleaningCharge(suffix);
  }

  function calculateAdditionalRoomCleaningCharge(suffix) {

    // only perform the calculation if the square footage is provided...
    var squareFootage = $("#squareFootage" + suffix);
    if (isNotEmpty(squareFootage.val())) {

      // get the field inputs...
      var preVacCharge = $("#preVacCharge" + suffix);
      var protectorCharge = $("#protectorCharge" + suffix);

      // convert the input values into numerics...
      var squareFootageNum = parseFloat(squareFootage.val());
      var preVacChargeNum = parseFloat(preVacCharge.val()) || 0;
      var protectorChargeNum = parseFloat(protectorCharge.val()) || 0;
      var cleaningRateChargeNum = parseFloat(CarpetCleaningRate.rateCharge) || 0;

      // calculate the room charge...
      var cleaningCharge = (cleaningRateChargeNum * squareFootageNum)
              + (preVacChargeNum * squareFootageNum)
              + (protectorChargeNum * squareFootageNum);

      var roomCharge = $("#roomCharge" + suffix);
      roomCharge.val(cleaningCharge.toFixed(2)).change();
    }
  }

  function isEmpty(value) {
    return (value === undefined) || (value === null) || (value === "");
  }

  function isNotEmpty(value) {
    return !isEmpty(value);
  }

  function getControlNameSuffix(controlName) {
    // replace all leading non-digits characters with an empty string...
    var suffix = controlName.replace(/^\D+/g, '');
    return suffix;
  }

  function getRateByName(rateName) {
    var result = "";
    $.ajax({
      type: 'POST',
      url: '/CleaningJob/rates/findByRateName.json',
      data: {
        rateName: rateName
      },
      async: false,
      success: function(data, textStatus) {
        result = data;
      },
      error: function(XMLHttpRequest, textStatus, errorThrown) {
        console.error(errorThrown);
      }
    });
    return result;
  }

})();