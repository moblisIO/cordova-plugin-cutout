module.exports = {
    get: function (successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Cutout", "get", []);
    }
};
