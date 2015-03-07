(function() {
  "use strict";

  $(document).ready(function() {
    init();
  });

  function init() {
    // bind the change event to their respective handlers...
    $("#stairCount").on("change", changeStairCount);

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
    stairCount.children("option").each(
            function() {
              // This will make sure the first row shows when 00 is
              // selected, but stay hidden if not...
              if ((this.index === selectedIndex)
                      || ((this.index > 0) && (this.index < selectedIndex))) {
                $("#stairTable #stair" + this.value).show();
                $("#stairVisible" + this.index).val("Y");
              } else {
                $("#stairVisible" + this.index).val("");
              }
            });
  }

})();