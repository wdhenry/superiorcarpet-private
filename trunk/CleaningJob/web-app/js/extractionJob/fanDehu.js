(function() {
  "use strict";

  $(document).ready(function() {
    init();
  });

  function init() {
    // bind the change event to their respective handlers...
    $("#fanCount").on("change", changeFanCount);
    $("#dehuCount").on("change", changeDehuCount);

    // invoke the change handlers for some of the controls above in order
    // to initialize the table rows based on the current selectedIndex...
    changeFanCount(undefined);
    changeDehuCount(undefined);
  }

  function changeFanCount(event) {
    var fanCount = $("#fanCount");

    // First, hide all the rows
    $("#fansTable tbody tr").hide();

    // Next, show the rows based on the selected index of the roomCount...
    var selectedIndex = fanCount[0].selectedIndex;
    fanCount.children("option").each(function() {
      // This will make sure the first row shows when 00 is
      // selected, but stay hidden if not...
      if ((this.index === selectedIndex) || ((this.index > 0) && (this.index < selectedIndex))) {
        $("#fansTable #fan" + this.value).show();
        $("#fanVisible" + this.value).val("Y");
      } else {
        $("#fanVisible" + this.value).val("");
      }
    });
  }

  function changeDehuCount(event) {
    var dehuCount = $("#dehuCount");

    // First, hide all the rows
    $("#dehusTable tbody tr").hide();

    // Next, show the rows based on the selected index of the roomCount...
    var selectedIndex = dehuCount[0].selectedIndex;
    dehuCount.children("option").each(function() {
      // This will make sure the first row shows when 00 is
      // selected, but stay hidden if not...
      if ((this.index === selectedIndex) || ((this.index > 0) && (this.index < selectedIndex))) {
        $("#dehusTable #dehu" + this.value).show();
        $("#dehuVisible" + this.value).val("Y");
      } else {
        $("#dehuVisible" + this.value).val("");
      }
    });
  }

})();