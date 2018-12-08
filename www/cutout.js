/*global cordova, module*/

var Cutout = function() {};

Cutout.prototype.get = function(success, fail) {
  cordova.exec(success, fail, 'Cutout', 'get', []);
};

if (!window.plugins) {
  window.plugins = {};
}
if (!window.plugins.cutout) {
  window.plugins.cutout = new Cutout();
}

if (module.exports) {
  module.exports = Cutout;
}
