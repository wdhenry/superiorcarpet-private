"use strict";

var RateService = {
  getRateByName: function(rateName) {
    var result = null;
    $.ajax({
      type: 'POST',
      url: '/CleaningJob/rates/findByRateName.json',
      data: {
        rateName: rateName
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
