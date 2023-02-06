package com.tclado.androidkeyboardadjust;

import android.app.Activity;
import android.view.WindowManager;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.bridge.Callback;

@ReactModule(name = RnAndroidKeyboardAdjustModule.NAME)
public class RnAndroidKeyboardAdjustModule extends ReactContextBaseJavaModule {
  public static final String NAME = "RnAndroidKeyboardAdjust";

  public RnAndroidKeyboardAdjustModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }


  @ReactMethod
    public void setAdjustNothing() {

        final Activity activity = getCurrentActivity();

        if (activity == null) {
            return;
        }

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING);
            }
        });
    }

    @ReactMethod
    public void setAdjustPan() {
        final Activity activity = getCurrentActivity();

        if (activity == null) {
            return;
        }

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
            }
        });
    }

    @ReactMethod
    public void setAdjustResize() {
        final Activity activity = getCurrentActivity();

        if (activity == null) {
            return;
        }

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
            }
        });
    }

    @ReactMethod
    public void setAdjustUnspecified() {
        final Activity activity = getCurrentActivity();

        if (activity == null) {
            return;
        }

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_UNSPECIFIED);
            }
        });
    }

    @ReactMethod
    public void setAlwaysHidden() {
        final Activity activity = getCurrentActivity();

        if (activity == null) {
            return;
        }

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
            }
        });
    }

    @ReactMethod
    public void setAlwaysVisible() {
        final Activity activity = getCurrentActivity();

        if (activity == null) {
            return;
        }

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
            }
        });
    }

    @ReactMethod
    public void setVisible() {
        final Activity activity = getCurrentActivity();

        if (activity == null) {
            return;
        }

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
            }
        });
    }

    @ReactMethod
    public void setHidden() {
        final Activity activity = getCurrentActivity();

        if (activity == null) {
            return;
        }

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
            }
        });
    }

    @ReactMethod
    public void setUnchanged() {
        final Activity activity = getCurrentActivity();

        if (activity == null) {
            return;
        }

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_UNCHANGED);
            }
        });
    }

   @ReactMethod
   public void getSoftInputMode(Callback callback) {
     final Activity activity = getCurrentActivity();

     if (activity == null) {
       return;
     }

     activity.runOnUiThread(new Runnable() {
       @Override
       public void run() {
         int softInputMode = activity.getWindow().getAttributes().softInputMode;
         callback.invoke(softInputMode);
       }
     });
   }

  @ReactMethod
  public void setSoftInputMode(int softInputMode) {
    final Activity activity = getCurrentActivity();

    if (activity == null) {
      return;
    }

    activity.runOnUiThread(new Runnable() {
      @Override
      public void run() {
        activity.getWindow().setSoftInputMode(softInputMode);
      }
    });
  }
}
