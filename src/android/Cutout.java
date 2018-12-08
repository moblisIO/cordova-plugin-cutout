package io.moblis.cordova.plugins;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Cutout extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("get")) {

            //String name = data.getString(0);
            String message = "Hello";
            callbackContext.success(message);
            return true;

        } else {            
            return false;
        }
    }   
    
    
    //public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
    //    if (action.equals("get")) {
    //        String result = Locale.getDefault().getCountry();
    //        callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, result));
    //        return true;
    //    }
    //    callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR));
    //    return false;
    //}
}
