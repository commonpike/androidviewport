package nl.kw.cordova.androidviewport;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;

import android.os.Build;

import android.util.Log;



public class AndroidViewport extends CordovaPlugin {
    //private CordovaWebView webView;
    private static final String LOG_TAG = "AndroidViewport";
    @Override
    public void initialize(final CordovaInterface cordova, CordovaWebView webView) {
        Log.d(LOG_TAG, "honor viewport");
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        super.initialize(cordova, webView); 
        
    }
    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        // this plugin has no api. just include it.
        return false;  // Returning false results in a "MethodNotFound" error.
    }
}
