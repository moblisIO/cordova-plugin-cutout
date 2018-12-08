/*global cordova, module*/

module.exports = {
    cutout: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "AndroidCutout", "cutout", []);
    }
};
