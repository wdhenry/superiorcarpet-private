"use strict";

var RoomGroupService = {
  getByGroupName: function(groupName) {
    var result = null;
    $.ajax({
      type: 'POST',
      url: '/CleaningJob/roomGroup/findByGroupName.json',
      data: {
        groupName: groupName
      },
      async: false,
      success: function(data, textStatus) {
        result = data;
      },
      error: function(XMLHttpRequest, textStatus, errorThrown) {
        if (errorThrown !== "Not Found") {
          console.error(errorThrown);
        }
      }
    });
    return result;
  }
};
