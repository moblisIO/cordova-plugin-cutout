# Cordova Android Cutout Plugin

Detect cutout (aka notch) on Android devices.
Returns true if cutout/notch is detected on Android device.  
Note: Requires SDK target API 28+ (Pie).

## Note

Android Studio project structure must be set to Compile Sdk Version API 28 (Pie)+.

## Using

Create a new Cordova Project & Android Platform

    $ cordova create testApp 
    $ cd testApp
    $ cordova platform add android
    
Install the plugin
    $ cordova plugin add https://github.com/moblisIO/androidcutout.git    

Edit `www/js/index.js` and add the following code inside `onDeviceReady`

```
var success = function(hasCutout) {
    if (hasCutout){
        alert('has cutout');
    }else{
        alert('no cutout')
    }
}

var failure = function(e) {
    alert("Error calling Cutout Plugin");
}

cutout.hasCutout(success, failure);

```

Install on Android platform

    cordova platform add android
    
Run the code

    cordova run android

    or

    cordova emulate android
