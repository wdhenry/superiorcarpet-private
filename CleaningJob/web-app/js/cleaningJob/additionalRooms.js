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
    $("input[id^='preVacCharge']").on("change", changePreVacCharge);
    $("input[id^='protectorCheck']").on("change", changeProtectorCheck);
    $("input[id^='protectorCharge']").on("change", changeProtectorCharge);
    $("input[id^='moveFurnitureCharge']").on("change", changeMoveFurnitureCharge);

    // prefetch rates for calculations...
    CarpetCleaningRate = RateService.getRateByName("CarpetCleaning");
    CarpetPreVacRate = RateService.getRateByName("CarpetPreVac");
    CarpetProtectorRate = RateService.getRateByName("CarpetProtector");

    // invoke the change handlers for some of the controls above in order
    // to initialize the table rows based on the current selectedIndex...
    changeRoomCount(undefined);
  }

  function changeRoomCount(event) {
    var roomCountElement = $("#roomCount")[0];

    // First, hide all the rows
    $("#additionalRoomTable tbody tr[id^='room']").hide();

    // Next, show the rows based on the selected index of the roomCount...
    var selectedIndex = roomCountElement.selectedIndex;
    $("#roomCount > option").each(function() {
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

  function changeMoveFurnitureCharge(event) {
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
      var moveFurnitureCharge = $("#moveFurnitureCharge" + suffix);

      // convert the input values into numerics...
      var squareFootageNum = parseFloat(squareFootage.val());
      var cleaningRateChargeNum = parseFloat(CarpetCleaningRate.rateCharge) || 0;
      var preVacChargeNum = parseFloat(preVacCharge.val()) || 0;
      var protectorChargeNum = parseFloat(protectorCharge.val()) || 0;
      var moveFurnitureChargeNum = parseFloat(moveFurnitureCharge.val()) || 0;

      // calculate the room charge...
      var cleaningCharge = (cleaningRateChargeNum * squareFootageNum) //
              + (preVacChargeNum * squareFootageNum) //
              + (protectorChargeNum * squareFootageNum) //
              + (moveFurnitureChargeNum);

      $("#roomCharge" + suffix).val(cleaningCharge.toFixed(2));

    } else {
      $("#roomCharge" + suffix).val("");
    }
  }

})();