(function() {
  "use strict";

  $(document).ready(function() {
    init();
  });

  function init() {
    // bind the change event to their respective handlers...
    $("#hsRoomCount").on("change", changeHsRoomCount);

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
    hsRoomCount.children("option").each(
            function() {
              // This will make sure the first row shows when 00 is
              // selected, but stay hidden if not...
              if ((this.index === selectedIndex)
                      || ((this.index > 0) && (this.index < selectedIndex))) {
                $("#hardSurfaceRoomTable #hsRoom" + this.value).show();
                $("#hsVisible" + this.index).val("Y");
              } else {
                $("#hsVisible" + this.index).val("");
              }
            });
  }

})();