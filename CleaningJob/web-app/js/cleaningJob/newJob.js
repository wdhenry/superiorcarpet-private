(function(undefined) {
	"use strict";

	$(document).ready(function() {
		init();
	});

	function init() {
		// bind the change event to their respective handlers...
		$("#groupName").on("change", changeGroupName);
		$("#roomCount").on("change", changeRoomCount);
		$("#upholsteryCount").on("change", changeUpholsteryCount);

		// invoke to initialize the table rows based on the current selectedIndex
		changeGroupName(undefined);
		changeRoomCount(undefined);
		changeUpholsteryCount(undefined);
	}

	function changeGroupName(event) {
		var groupNameElement = $("#groupName")[0];

		// First, hide all the rows
		$("#groupRoomTable tbody tr[id^='room']").hide();

		// Next, show the rows based on the selected index of the groupName...
		var selectedIndex = groupNameElement.selectedIndex;
		switch (selectedIndex) {
			case 5: $("#groupRoomTable #room5").show();
			case 4: $("#groupRoomTable #room4").show();
			case 3: $("#groupRoomTable #room3").show();
			case 2: $("#groupRoomTable #room2").show();
			case 1: $("#groupRoomTable #room1").show();
				break;
			default: $("#groupRoomTable #room0").show();
		}

		// Load the rate only when the user updated it (event is defined)...
		if (event) {
			if (selectedIndex > 0) {
				jQuery.ajax({
					type : 'POST',
					url : '/CleaningJob/roomGroup/show/' + selectedIndex + '.json',
					success : function(data, textStatus) {
						$("#groupRate").val(data.groupCharge);
					},
					error : function(XMLHttpRequest, textStatus, errorThrown) {
						console.error(errorThrown);
					}
				});
			} else {
				$("#groupRate").val("");
			}
		}
	}

	function changeRoomCount(event) {
		var roomCountElement = $("#roomCount")[0];

		// First, hide all the rows
		$("#additionalRoomTable tbody tr[id^='room']").hide();

		// Next, show the rows based on the selected index of the roomCount...
		var selectedIndex = roomCountElement.selectedIndex;
		$("#roomCount > option").each(function() {
			// This will make sure the first row shows when 00 is selected, but stay hidden if not...
		    if ( (this.index === selectedIndex) || (this.index > 0 && this.index < selectedIndex) ) {
		    	$("#additionalRoomTable #room" + this.value).show();
		    	$("#visible0" + this.value).val("Y");
		    } else {
		    	$("#visible0" + this.value).val("");
		    }
		});
		
	}

	function changeUpholsteryCount(event) {
		var upholsteryCountElement = $("#upholsteryCount")[0];

		// First, hide all the rows
		$("#upholsteryTable tbody tr[id^='upholstery']").hide();

		// Next, show the rows based on the selected index of the roomCount...
		var selectedIndex = upholsteryCountElement.selectedIndex;
		$("#upholsteryCount > option").each(function() {
			// This will make sure the first row shows when 00 is selected, but stay hidden if not...
		    if ( (this.index === selectedIndex) || (this.index > 0 && this.index < selectedIndex) ) {
		    	$("#upholsteryTable #upholstery" + this.index).show();
		    	$("#uVisible" + this.index).val("Y");
		    } else {
		    	$("#uVisible" + this.index).val("");
		    }
		});
		
	}

})();