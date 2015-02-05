(function(){
	"use strict";
	
	$(document).ready(function(){
		init();
	});
	
	function init() {
		//bind the change event to the changeGroupName function
		$("#groupName").on("change", changeGroupName);
		
		// invoke to initialize the table rows based on the current selected index
		changeGroupName();
	}
	
	function changeGroupName(){
		// First, hide all the rows
		$("#groupRoomTable tbody tr[id^='room']").hide();
		
		// Next, show the rows based on the selected index of the groupName...
		var selectedIndex = $("#groupName")[0].selectedIndex;
		switch(selectedIndex) {
			case 5: $("#groupRoomTable #room5").show();
			case 4: $("#groupRoomTable #room4").show();
			case 3: $("#groupRoomTable #room3").show();
			case 2: $("#groupRoomTable #room2").show();
			case 1: $("#groupRoomTable #room1").show(); 
					break;
			default: $("#groupRoomTable #room0").show();
		}
	}
})();