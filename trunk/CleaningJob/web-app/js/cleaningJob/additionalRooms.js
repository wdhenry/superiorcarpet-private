(function(undefined) {
  "use strict";

  var CarpetCleaningRate;
  var CarpetPreVacRate;
  var CarpetProtectorRate;

  $(document).ready(function() {
    init();
  });

  function init() {
    // bind the change event to their respective handlers...
    $("#roomCount").on("change", changeRoomCount);
    $("input[id^='squareFootage']").on("change", changeSquareFootage);
    $("input[id^='preVacCheck']").on("change", changePreVacCheck);
    $("input[id^='protectorCheck']").on("change", changeProtectorCheck);

    // prefetch rates for calculations...
    CarpetCleaningRate = RateService.getRateByName("CarpetCleaning");
    CarpetPreVacRate = RateService.getRateByName("CarpetPreVac");
    CarpetProtectorRate = RateService.getRateByName("CarpetProtector");

    // invoke the change handlers for some of the controls above in order
    // to initialize the table rows based on the current selectedIndex...
    changeRoomCount(undefined);
  }

  function changeRoomCount(event) {
    var roomCount = $("#roomCount");

    // First, hide all the rows
    $("#additionalRoomTable tbody tr").hide();

    // Next, show the rows based on the selected index of the roomCount...
    var selectedIndex = roomCount[0].selectedIndex;
    roomCount.children("option").each(function() {
      // This will make sure the first row shows when 00 is
      // selected, but stay hidden if not...
      if ((this.index === selectedIndex) || ((this.index > 0) && (this.index < selectedIndex))) {
        $("#additionalRoomTable #room" + this.value).show();
        $("#visible0" + this.value).val("Y");
      } else {
        $("#visible0" + this.value).val("");
      }
    });
  }

  function changeSquareFootage(event) {

    var suffix = getControlNameSuffix(event.currentTarget.name);
    var squareFootage = $("#squareFootage" + suffix);
    var roomCharge = $("#roomCharge" + suffix)

    if (isNotEmpty(squareFootage.val())) {

      var squareFootageNum = parseFloat(squareFootage.val());
      var rateChargeNum = parseFloat(CarpetCleaningRate.rateCharge) || 0;
      var roomChargeTotal = (rateChargeNum * squareFootageNum);

      roomCharge.val(roomChargeTotal.toFixed(2)).change();

    } else {
      roomCharge.val("").change();
    }

    changePreVacCheck(event);
    changeProtectorCheck(event);
  }

  function changePreVacCheck(event) {

    var suffix = getControlNameSuffix(event.currentTarget.name);
    var preVacCheck = $("#preVacCheck" + suffix);
    var preVacCharge = $("#preVacCharge" + suffix);

    // set the rate charge accordingly...
    if (preVacCheck.is(':checked') === true) {
      calculatePreVacCharge(suffix);
    } else {
      preVacCharge.val("").change();
    }
  }

  function calculatePreVacCharge(suffix) {
    var squareFootage = $("#squareFootage" + suffix);
    var preVacCharge = $("#preVacCharge" + suffix);

    if (isNotEmpty(squareFootage.val())) {

      var squareFootageNum = parseFloat(squareFootage.val());
      var rateChargeNum = parseFloat(CarpetPreVacRate.rateCharge);
      var preVacChargeTotal = (rateChargeNum * squareFootageNum);

      preVacCharge.val(preVacChargeTotal.toFixed(2)).change();

    } else {
      preVacCharge.val("").change();
    }
  }

  function changeProtectorCheck(event) {

    var suffix = getControlNameSuffix(event.currentTarget.name);
    var protectorCheck = $("#protectorCheck" + suffix);
    var protectorCharge = $("#protectorCharge" + suffix);

    // set the rate charge accordingly...
    if (protectorCheck.is(':checked') === true) {
      calculateProtectorCharge(suffix);
    } else {
      protectorCharge.val("").change();
    }
  }

  function calculateProtectorCharge(suffix) {
    var squareFootage = $("#squareFootage" + suffix);
    var protectorCharge = $("#protectorCharge" + suffix);

    if (isNotEmpty(squareFootage.val())) {

      var squareFootageNum = parseFloat(squareFootage.val());
      var rateChargeNum = parseFloat(CarpetProtectorRate.rateCharge);
      var protectorChargeTotal = (rateChargeNum * squareFootageNum);

      protectorCharge.val(protectorChargeTotal.toFixed(2)).change();

    } else {
      protectorCharge.val("").change();
    }
  }

})();