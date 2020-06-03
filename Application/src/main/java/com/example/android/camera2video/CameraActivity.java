package com.example.android.camera2video;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.WindowManager;

import static android.content.ContentValues.TAG;

public class CameraActivity extends Activity {

    public static final String TAG = "Camera2";
    public Camera2VideoFragment mCamera2VideoFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
        localLayoutParams.screenBrightness = 0.8F;
        getWindow().setAttributes(localLayoutParams);

        mCamera2VideoFragment = Camera2VideoFragment.newInstance();
        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, mCamera2VideoFragment)
                    .commit();
        }
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.i(TAG, "onKeyLongPress = " + KeyEvent.KEYCODE_VOLUME_UP );
        return super.onKeyLongPress(keyCode, event);
    }

    private int currentZoomLevel = 1;

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {

        if(keyCode == 1001){
//            mCamera2VideoFragment.setZoom(0.1F);

            if (currentZoomLevel == 9)
            {
                currentZoomLevel -= 1;
                mCamera2VideoFragment.setZoom(0.8F);
                return true;
            }
            if (currentZoomLevel == 8)
            {
                currentZoomLevel -= 1;
                mCamera2VideoFragment.setZoom(0.7F);
                return true;
            }
            if (currentZoomLevel == 7)
            {
                currentZoomLevel -= 1;
                mCamera2VideoFragment.setZoom(0.6F);
                return true;
            }
            if (currentZoomLevel == 6)
            {
                currentZoomLevel -= 1;
                mCamera2VideoFragment.setZoom(0.5F);
                return true;
            }
            if (currentZoomLevel == 5)
            {
                currentZoomLevel -= 1;
                mCamera2VideoFragment.setZoom(0.4F);
                return true;
            }
            if (currentZoomLevel == 4)
            {
                currentZoomLevel -= 1;
                mCamera2VideoFragment.setZoom(0.3F);
                return true;
            }
            if (currentZoomLevel == 3)
            {
                currentZoomLevel -= 1;
                mCamera2VideoFragment.setZoom(0.2F);
                return true;
            }
            if (currentZoomLevel == 2)
            {
                currentZoomLevel -= 1;
                mCamera2VideoFragment.setZoom(0.1F);
                return true;
            }

            Log.i(TAG, "currentZoomLevel = " + currentZoomLevel );
            return true;

        }
        if (keyCode == KeyEvent.KEYCODE_BACK){
//            mCamera2VideoFragment.setZoom(1.0F);

            if (currentZoomLevel == 0)
            {
                currentZoomLevel += 1;
                mCamera2VideoFragment.setZoom(0.1F);
                return true;
            }
            if (currentZoomLevel == 1)
            {
                currentZoomLevel += 1;
                mCamera2VideoFragment.setZoom(0.2F);
                return true;
            }
            if (this.currentZoomLevel == 2)
            {
                currentZoomLevel += 1;
                mCamera2VideoFragment.setZoom(0.3F);
                return true;
            }
            if (currentZoomLevel == 3)
            {
                currentZoomLevel += 1;
                mCamera2VideoFragment.setZoom(0.4F);
                return true;
            }
            if (currentZoomLevel == 4)
            {
                currentZoomLevel += 1;
                mCamera2VideoFragment.setZoom(0.5F);
                return true;
            }
            if (currentZoomLevel == 5)
            {
                currentZoomLevel += 1;
                mCamera2VideoFragment.setZoom(0.6F);
                return true;
            }
            if (currentZoomLevel == 6)
            {
                currentZoomLevel += 1;
                mCamera2VideoFragment.setZoom(0.7F);
                return true;
            }
            if (currentZoomLevel == 7)
            {
                currentZoomLevel += 1;
                mCamera2VideoFragment.setZoom(0.8F);
                return true;
            }
            if (currentZoomLevel == 8)
            {
                currentZoomLevel += 1;
                mCamera2VideoFragment.setZoom(0.9F);
                return true;
            }
            Log.i(TAG, "currentZoomLevel = " + currentZoomLevel);

            return true;
        }
        return super.onKeyUp(keyCode, event);
    }
}
