package com.example.accesibility;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class TestingService extends AccessibilityService {
    String TAG = "ServiceInfo";
    @Override
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }
    @Override
    public void onCreate(){
    }
    @Override
    protected void onServiceConnected() {
        Log.i(TAG,"Service Connected");
        AccessibilityNodeInfo info =(AccessibilityNodeInfo) getRootInActiveWindow();
        if(info!= null){
            Log.i(TAG," I got window");

        }
        else{
            Log.i(TAG,"I don't got window");
        }
    }
    @Override
    public void onInterrupt() {

    }
}
