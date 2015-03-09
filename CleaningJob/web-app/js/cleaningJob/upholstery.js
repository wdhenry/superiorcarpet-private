(function(undefined) {
  "use strict";

  $(document).ready(function() {
    init();
  });

  function init() {
    // bind the change event to their respective handlers...
    $("#upholsteryCount").on("change", changeUpholsteryCount);
    $("select[id^='upholsteryName']").on("change", changeUpholsteryName);
    $("input[id^='upholsteryCount']").on("change", changeUpholsteryCountInput);

    // invoke the change handlers for some of the controls above in order
    // to initialize the table rows based on the current selectedIndex...
    changeUpholsteryCount(undefined);
  }

  function changeUpholsteryCount(event) {
    var upholsteryCount = $("#upholsteryCount");

    // First, hide all the rows
    $("#upholsteryTable tbody tr").hide();

    // Next, show the rows based on the selected index of the roomCount...
    var selectedIndex = upholsteryCount[0].selectedIndex;
    upholsteryCount.children("option").each(function() {
      // This will make sure the first row shows when 00 is
      // selected, but stay hidden if not...
      if ((this.index === selectedIndex) || ((this.index > 0) && (this.index < selectedIndex))) {
        $("#upholsteryTable #upholstery" + this.index).show();
        $("#uVisible" + this.index).val("Y");
      } else {
        $("#uVisible" + this.index).val("");
      }
    });
  }

  function changeUpholsteryName(event) {

    var suffix = getControlNameSuffix(event.currentTarget.name);
    var upholsteryName = $("#upholsteryName" + suffix);
    var upholsteryCharge = $("#upholsteryCharge" + suffix);

    if (upholsteryName[0].selectedIndex > 0) {
      calculateUpholsteryCharge(suffix);
    } else {
      upholsteryCharge.val("").change();
    }
  }

  function changeUpholsteryCountInput(event) {
    var suffix = getControlNameSuffix(event.currentTarget.name);
    calculateUpholsteryCharge(suffix);
  }

  function calculateUpholsteryCharge(suffix) {

    var upholsteryName = $("#upholsteryName" + suffix);
    var upholsteryNameData = UpholsteryNameService.getByUpholsteryName(upholsteryName.val());
    var upholsteryCount = $("#upholsteryCount" + suffix);
    var upholsteryCharge = $("#upholsteryCharge" + suffix);

    if (isNotEmpty(upholsteryCount.val()) && isNotEmpty(upholsteryNameData)) {

      var upholsteryCountNum = parseInt(upholsteryCount.val(), 10);
      var upholsteryChargeNum = parseFloat(upholsteryNameData.upholsteryCharge);
      var upholsteryChargeTotal = (upholsteryCountNum * upholsteryChargeNum);

      upholsteryCharge.val(upholsteryChargeTotal.toFixed(2)).change();

    } else {
      upholsteryCharge.val("");
    }

  }

})();