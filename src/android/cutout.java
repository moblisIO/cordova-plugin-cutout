package io.moblis.cordova.plugin.android;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.WindowInsets;

public class cutout extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("cutout")) {

            alertOneButton("it worked!!");

            //String name = data.getString(0);
            //String message = "Hello, " + name;
            //callbackContext.success(message);

            return true;

        } else {
            
            return false;

        }
    }

    public void alertOneButton(String str) {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("One Button")
                .setMessage(str)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).show();
    }
}
