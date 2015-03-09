(function() {
  "use strict";

  $(document).ready(function() {
    init();
  });

  function init() {
    // bind the change event to their respective handlers...
    $("#miscCount").on("change", changeMiscCount);
    $("select[id^='miscChargesName']").on("change", changeMiscChargesName);

    // invoke the change handlers for some of the controls above in order
    // to initialize the table rows based on the current selectedIndex...
    changeMiscCount(undefined);
  }

  function changeMiscCount(event) {
    var miscCount = $("#miscCount");

    // First, hide all the rows
    $("#miscellaneousChargeTable tbody tr[id^='misc']").hide();

    // Next, show the rows based on the selected index of the roomCount...
    var selectedIndex = miscCount[0].selectedIndex;
    miscCount.children("option").each(function() {
      // This will make sure the first row shows when 00 is
      // selected, but stay hidden if not...
      if ((this.index === selectedIndex) || ((this.index > 0) && (this.index < selectedIndex))) {
        $("#miscellaneousChargeTable #misc" + this.value).show();
        $("#miscVisible" + this.index).val("Y");
      } else {
        $("#miscVisible" + this.index).val("");
      }
    });
  }

  function changeMiscChargesName(event) {

    var miscChargesName = $(event.currentTarget);
    var suffix = getControlNameSuffix(event.currentTarget.name);
    var miscCharge = $("#miscCharge" + suffix);
    var miscChargesNameRate = MiscChargeNameService.getByMiscChargesName(miscChargesName.val());
    if (isNotEmpty(miscChargesNameRate)) {
      miscCharge.val(miscChargesNameRate.miscChargeRate.toFixed(2)).change();
    } else {
      miscCharge.val("").change();
    }
  }

})();