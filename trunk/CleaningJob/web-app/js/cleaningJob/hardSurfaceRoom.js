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
    $("input[id^='hsSealedWaxedCheck']").on("change", changeHsSealedWaxedCheck);

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
    $("#hardSurfaceRoomTable tbody tr").hide();

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
    var squareFootage = $("#hsSquareFootage" + suffix);
    var roomCharge = $("#hsRoomCharge" + suffix)

    if (isNotEmpty(squareFootage.val())) {

      var squareFootageNum = parseFloat(squareFootage.val());
      var rateChargeNum = parseFloat(SurfaceCleaningRate.rateCharge) || 0;
      var roomChargeTotal = (rateChargeNum * squareFootageNum);

      roomCharge.val(roomChargeTotal.toFixed(2)).change();

    } else {
      roomCharge.val("").change();
    }

    changeHsEtchedCheck(event);
    changeHsSealedWaxedCheck(event);
  }

  function changeHsEtchedCheck(event) {

    var suffix = getControlNameSuffix(event.currentTarget.name);
    var hsEtchedCheck = $("#hsEtchedCheck" + suffix);
    var hsEtchedCharge = $("#hsEtchedCharge" + suffix);

    // set the rate charge accordingly...
    if (hsEtchedCheck.is(':checked') === true) {
      calculateHsEtchedCharge(suffix);
    } else {
      hsEtchedCharge.val("").change();
    }
  }

  function calculateHsEtchedCharge(suffix) {
    var squareFootage = $("#hsSquareFootage" + suffix);
    var hsEtchedCharge = $("#hsEtchedCharge" + suffix);

    if (isNotEmpty(squareFootage.val())) {

      var squareFootageNum = parseFloat(squareFootage.val());
      var rateChargeNum = parseFloat(SurfaceEtchedRate.rateCharge);
      var hsEtchedChargeTotal = (rateChargeNum * squareFootageNum);

      hsEtchedCharge.val(hsEtchedChargeTotal.toFixed(2)).change();

    } else {
      hsEtchedCharge.val("").change();
    }
  }

  function changeHsSealedWaxedCheck(event) {

    var suffix = getControlNameSuffix(event.currentTarget.name);
    var hsSealedWaxedCheck = $("#hsSealedWaxedCheck" + suffix);
    var hsSealedWaxedCharge = $("#hsSealedWaxedCharge" + suffix);

    // set the rate charge accordingly...
    if (hsSealedWaxedCheck.is(':checked') === true) {
      calculateHsSealedWaxedCharge(suffix);
    } else {
      hsSealedWaxedCharge.val("").change();
    }
  }

  function calculateHsSealedWaxedCharge(suffix) {
    var squareFootage = $("#hsSquareFootage" + suffix);
    var hsSealedWaxedCharge = $("#hsSealedWaxedCharge" + suffix);

    if (isNotEmpty(squareFootage.val())) {

      var squareFootageNum = parseFloat(squareFootage.val());
      var rateChargeNum = parseFloat(SurfaceSealedWaxedRate.rateCharge);
      var hsSealedWaxedChargeTotal = (rateChargeNum * squareFootageNum);

      hsSealedWaxedCharge.val(hsSealedWaxedChargeTotal.toFixed(2)).change();

    } else {
      hsSealedWaxedCharge.val("").change();
    }
  }

})();