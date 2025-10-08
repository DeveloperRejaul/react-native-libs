package com.libs

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule

import android.graphics.Color
import android.os.Build
import android.view.View

@ReactModule(name = LibsModule.NAME)
class LibsModule(reactContext: ReactApplicationContext) :
  NativeLibsSpec(reactContext) {

  override fun getName(): String {
    return NAME
  }
override fun setStatusBarColor(colorHex: String, darkIcons: Boolean) {
    val activity = currentActivity ?: return
    activity.runOnUiThread {
        try {
            val window = activity.window
            window.statusBarColor = Color.parseColor(colorHex)

            var flags = window.decorView.systemUiVisibility

            // Set dark/light status bar icons
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) { // M = 23+
                flags = if (darkIcons) {
                    flags or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
                } else {
                    flags and View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR.inv()
                }
            }

            window.decorView.systemUiVisibility = flags
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}



  override fun setNavigationBarColor(colorHex: String,darkIcons:Boolean) {
      val activity = currentActivity ?: return
      activity.runOnUiThread {
        try {
          val window = activity.window
          window.navigationBarColor = Color.parseColor(colorHex)

          var flags = window.decorView.systemUiVisibility

          if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                flags = if (darkIcons) {
                    flags or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
                } else {
                    flags and View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR.inv()
                }
            }

            window.decorView.systemUiVisibility = flags
        } catch (e: Exception) {
          e.printStackTrace()
        }
      }
  }


  companion object {
    const val NAME = "Libs"
  }
}
