package io.cordova.moblis.plugin.cutout;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;

public class Cutout extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("hasCutout")) {            

            final Activity activity = this.cordova.getActivity();
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.P) {
                android.view.DisplayCutout displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout();
                if (displayCutout != null) {
                    callbackContext.success(1);
                    return true;
                } else {
                    callbackContext.success(0);
                    return true;
                }
            }
            callbackContext.success(0);

            return true;

        } else {
            
            return false;

        }
    }
}
