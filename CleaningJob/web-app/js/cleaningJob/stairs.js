(function() {
  "use strict";

  var StairCleaningRate;

  $(document).ready(function() {
    init();
  });

  function init() {
    // bind the change event to their respective handlers...
    $("#stairCount").on("change", changeStairCount);
    $("#stairCount1").on("change", changeStairCountInput);
    $("#stairCount2").on("change", changeStairCountInput);
    $("#stairCount3").on("change", changeStairCountInput);

    // prefetch rate for calculations...
    StairCleaningRate = RateService.getRateByName("StairCleaning");

    // invoke the change handlers for some of the controls above in order
    // to initialize the table rows based on the current selectedIndex...
    changeStairCount(undefined);
  }

  function changeStairCount(event) {
    var stairCount = $("#stairCount");

    // First, hide all the rows
    $("#stairTable tbody tr[id^='stair']").hide();

    // Next, show the rows based on the selected index of the roomCount...
    var selectedIndex = stairCount[0].selectedIndex;
    stairCount.children("option").each(function() {
      // This will make sure the first row shows when 00 is
      // selected, but stay hidden if not...
      if ((this.index === selectedIndex) || ((this.index > 0) && (this.index < selectedIndex))) {
        $("#stairTable #stair" + this.value).show();
        $("#stairVisible" + this.index).val("Y");
      } else {
        $("#stairVisible" + this.index).val("");
      }
    });
  }

  function changeStairCountInput(event) {
    var suffix = getControlNameSuffix(event.currentTarget.name);
    calculateStairCharge(suffix);
  }

  function calculateStairCharge(suffix) {

    // only perform the calculation if the square footage is provided...
    var stairCount = $("#stairCount" + suffix);
    if (isNotEmpty(stairCount.val())) {

      // convert the input values into numerics...
      var stairCountNum = parseFloat(stairCount.val());
      var stairChargeNum = parseFloat(StairCleaningRate.rateCharge) || 0;

      // calculate the room charge...
      var stairChargeTotal = (stairChargeNum * stairCountNum);

      $("#stairCharge" + suffix).val(stairChargeTotal.toFixed(2));

    } else {
      $("#stairCharge" + suffix).val("");
    }
  }

})();