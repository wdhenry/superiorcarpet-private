"use strict";

var UpholsteryNameService = {
  getByUpholsteryName: function(upholsteryName) {
    var result = null;
    $.ajax({
      type: 'POST',
      url: '/CleaningJob/upholsteryName/findByUpholsteryName.json',
      data: {
        upholsteryName: upholsteryName
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
