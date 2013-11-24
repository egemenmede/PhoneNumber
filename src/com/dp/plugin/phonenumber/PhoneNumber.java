package com.dp.plugin.phonenumber;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.Log;

public class PhoneNumber extends CordovaPlugin { 
	public static final String NATIVE_ACTION_STRING="phoneNumber"; 
	public static final String SUCCESS_PARAMETER="pn";
	private static final String LOG_TAG = "PhoneNumber";
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) { 
		Log.d(LOG_TAG, "Selam! PhoneNumber Plugininin 'PhoneNumber.java' dosyasinin ierisindesin!"); 
        try {
        	if (NATIVE_ACTION_STRING.equals(action)) { 
        		if (SUCCESS_PARAMETER.equals(args.getString(0))) { 
        			Log.d(LOG_TAG, "Islem basarili, Tebrikler!");
        			callbackContext.success(getTelephoneNumber());
                    return true;
        		}
            }else{
            	callbackContext.error("Telefon Numarasi alinirken bir hata olustu!");
            	return false;
            }
        } catch(Exception e) {
        	Log.d(LOG_TAG,"Hata Mesaji: " + e.getMessage());
            callbackContext.error(e.getMessage());
            return false;
        }
		return false;
        
	}
	
	public String getTelephoneNumber(){
		TelephonyManager tm = (TelephonyManager) this.cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE);
		String number = tm.getLine1Number();
		return number;
	}
}
