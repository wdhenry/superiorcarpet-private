(function() {
  "use strict";

  var SurfaceCleaningRate;
  var SurfaceEtchedRate;
  var SurfaceSealedWaxedRate;

  $(document).ready(function() {
    init();
  });

  function init() {
    // bind the change event to their respective handlers...
    $("#hsRoomCount").on("change", changeHsRoomCount);
    $("input[id^='hsSquareFootage']").on("change", changeHsSquareFootage);
    $("input[id^='hsEtchedCheck']").on("change", changeHsEtchedCheck);
    $("input[id^='hsEtchedCharge']").on("change", changeHsEtchedCharge);
    $("input[id^='hsSealedWaxedCheck']").on("change", changeHsSealedWaxedCheck);
    $("input[id^='hsSealedWaxedCharge']").on("change", changeHsSealedWaxedCharge);

    // prefetch rates for calculations...
    SurfaceCleaningRate = RateService.getRateByName("SurfaceCleaning");
    SurfaceEtchedRate = RateService.getRateByName("SurfaceEtched");
    SurfaceSealedWaxedRate = RateService.getRateByName("SurfaceSealedWaxed");

    // invoke the change handlers for some of the controls above in order
    // to initialize the table rows based on the current selectedIndex...
    changeHsRoomCount(undefined);
  }

  function changeHsRoomCount(event) {
    var hsRoomCount = $("#hsRoomCount");

    // First, hide all the rows
    $("#hardSurfaceRoomTable tbody tr[id^='hsRoom']").hide();

    // Next, show the rows based on the selected index of the roomCount...
    var selectedIndex = hsRoomCount[0].selectedIndex;
    hsRoomCount.children("option").each(function() {
      // This will make sure the first row shows when 00 is
      // selected, but stay hidden if not...
      if ((this.index === selectedIndex) || ((this.index > 0) && (this.index < selectedIndex))) {
        $("#hardSurfaceRoomTable #hsRoom" + this.value).show();
        $("#hsVisible" + this.index).val("Y");
      } else {
        $("#hsVisible" + this.index).val("");
      }
    });
  }

  function changeHsSquareFootage(event) {
    var suffix = getControlNameSuffix(event.currentTarget.name);
    calculateHardSurfaceCleaningCharge(suffix);
  }

  function changeHsEtchedCheck(event) {

    // get the hsEtchedCheck element that was changed...
    var hsEtchedCheck = $(event.currentTarget);
    var suffix = getControlNameSuffix(hsEtchedCheck[0].name);

    // get the hsEtchedCharge element...
    var hsEtchedCharge = $("#hsEtchedCharge" + suffix);

    // set the rate charge accordingly...
    if (hsEtchedCheck.is(':checked') === true) {
      hsEtchedCharge.val(SurfaceEtchedRate.rateCharge.toFixed(2)).change();
    } else {
      hsEtchedCharge.val("").change();
    }
  }

  function changeHsEtchedCharge(event) {
    var suffix = getControlNameSuffix(event.currentTarget.name);
    calculateHardSurfaceCleaningCharge(suffix);
  }

  function changeHsSealedWaxedCheck(event) {

    // get the preVacCheck element that was changed...
    var hsSealedWaxedCheck = $(event.currentTarget);
    var suffix = getControlNameSuffix(hsSealedWaxedCheck[0].name);

    // get the preVacCharge element...
    var hsSealedWaxedCharge = $("#hsSealedWaxedCharge" + suffix);

    // set the rate charge accordingly...
    if (hsSealedWaxedCheck.is(':checked') === true) {
      hsSealedWaxedCharge.val(SurfaceSealedWaxedRate.rateCharge.toFixed(2)).change();
    } else {
      hsSealedWaxedCharge.val("").change();
    }
  }

  function changeHsSealedWaxedCharge(event) {
    var suffix = getControlNameSuffix(event.currentTarget.name);
    calculateHardSurfaceCleaningCharge(suffix);
  }

  function calculateHardSurfaceCleaningCharge(suffix) {

    // only perform the calculation if the square footage is provided...
    var hsSquareFootage = $("#hsSquareFootage" + suffix);
    if (isNotEmpty(hsSquareFootage.val())) {

      // get the field inputs...
      var hsEtchedCharge = $("#hsEtchedCharge" + suffix);
      var hsSealedWaxedCharge = $("#hsSealedWaxedCharge" + suffix);

      // convert the input values into numerics...
      var hsSquareFootageNum = parseFloat(hsSquareFootage.val());
      var surfaceCleaningRateNum = parseFloat(SurfaceCleaningRate.rateCharge) || 0;
      var hsEtchedChargeNum = parseFloat(hsEtchedCharge.val()) || 0;
      var hsSealedWaxedChargeNum = parseFloat(hsSealedWaxedCharge.val()) || 0;

      // calculate the room charge...
      var cleaningCharge = (surfaceCleaningRateNum * hsSquareFootageNum) //
              + (hsEtchedChargeNum * hsSquareFootageNum) //
              + (hsSealedWaxedChargeNum * hsSquareFootageNum);

      $("#hsRoomCharge" + suffix).val(cleaningCharge.toFixed(2));

    } else {
      $("#hsRoomCharge" + suffix).val("");
    }

  }

})();