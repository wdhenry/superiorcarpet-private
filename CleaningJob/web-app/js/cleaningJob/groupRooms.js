(function(undefined) {
  "use strict";

  $(document).ready(function() {
    init();
  });

  function init() {
    // bind the change event to their respective handlers...
    $("#groupName").on("change", changeGroupName);

    // invoke the change handlers for some of the controls above in order
    // to initialize the table rows based on the current selectedIndex...
    changeGroupName(undefined);
  }

  function changeGroupName(event) {
    var groupName = $("#groupName");

    // First, hide all the rows
    $("#groupRoomTable tbody tr[id^='room']").hide();

    // Next, show the rows based on the selected index of the groupName...
    var selectedIndex = groupName[0].selectedIndex;
    groupName.children("option").each(function() {
      // This will make sure the first row shows when 00 is
      // selected, but stay hidden if not...
      if ((this.index === selectedIndex) || ((this.index > 0) && (this.index < selectedIndex))) {
        $("#groupRoomTable #room" + this.index).show();
      }
    });

    // Load the rate only when the user updated it (event is defined)...
    if (event) {
      if (selectedIndex > 0) {
        var roomGroup = RoomGroupService.getByGroupName(groupName.val());
        
        if (isNotEmpty(roomGroup)) {
          $("#groupRate").val(roomGroup.groupCharge.toFixed(2));
        }
      } else {
        $("#groupRate").val("");
      }
    }
  }

})();