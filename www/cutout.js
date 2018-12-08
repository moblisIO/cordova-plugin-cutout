module.exports = {
    hasCutout: function (successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Cutout", "hasCutout", []);
    }
};

