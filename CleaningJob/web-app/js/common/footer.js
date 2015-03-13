(function() {
  "use strict";

  $(document).ready(function() {
    init();
  });

  function init() {
    $("select.sorted-asc").each(function(index, element) {
      $(element).sortOptions(true);
    });
  }

})();