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
}
