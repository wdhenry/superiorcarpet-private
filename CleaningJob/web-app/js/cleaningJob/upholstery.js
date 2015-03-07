(function(undefined) {
  "use strict";

  $(document).ready(function() {
    init();
  });

  function init() {
    // bind the change event to their respective handlers...
    $("#upholsteryCount").on("change", changeUpholsteryCount);

    // invoke the change handlers for some of the controls above in order
    // to initialize the table rows based on the current selectedIndex...
    changeUpholsteryCount(undefined);
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

})();