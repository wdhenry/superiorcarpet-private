"use strict";

function isEmpty(value) {
  return (value === undefined) || (value === null) || (value === "");
}

function isNotEmpty(value) {
  return !isEmpty(value);
}

function getControlNameSuffix(controlName) {
  // replace all leading non-digits characters with an empty string...
  var suffix = controlName.replace(/^\D+/g, '');
  return suffix;
}