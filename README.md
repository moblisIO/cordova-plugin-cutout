# Cordova Android Notch Plugin

Detect cutout (aka notch) on Android devices.
Returns true if cutout/notch is detected on Android device.  Requires SDK target API 28+ (Pie).

## Using

Create a new Cordova Project

    $ cordova create testApp com.example.testApp testApp
    
Install the plugin

    $ cd hello
    $ cordova plugin add https://github.com/moblisIO/cordova-plugin-androidnotch.git
    

Edit `www/js/index.js` and add the following code inside `onDeviceReady`

```js
    var success = function(message) {
        alert(message);
    }

    var failure = function() {
        alert("Error calling Android Notch Plugin");
    }

    windows.plugin.android.notch(success, failure);
```

Install on Android platform

    cordova platform add android
    
Run the code

    cordova run android

    or

    cordova emulate android
