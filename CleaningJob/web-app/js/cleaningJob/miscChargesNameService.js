"use strict";

var MiscChargeNameService = {
  getByMiscChargesName: function(miscChargeName) {
    var result = null;
    $.ajax({
      type: 'POST',
      url: '/CleaningJob/miscChargesName/findByMiscChargesName.json',
      data: {
        miscChargeName: miscChargeName
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
