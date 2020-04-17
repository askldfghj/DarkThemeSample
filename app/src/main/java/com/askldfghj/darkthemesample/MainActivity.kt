package com.askldfghj.darkthemesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import androidx.databinding.DataBindingUtil
import com.askldfghj.darkthemesample.databinding.ActivityMainBinding
import com.debug.util.debugLog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        debugLog { "onCreate" }
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main).also {

        }
    }

    override fun onContentChanged() {
        debugLog { "onContentChanged" }
        super.onContentChanged()
    }

    override fun onStart() {
        debugLog { "onStart" }
        super.onStart()
    }

    override fun onRestart() {
        debugLog { "onRestart" }
        super.onRestart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        debugLog { "onRestoreInstanceState" }
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        debugLog { "onPostCreate" }
        super.onPostCreate(savedInstanceState, persistentState)
    }

    override fun onResume() {
        debugLog { "onResume" }
        super.onResume()
    }

    override fun onPostResume() {
        debugLog { "onPostResume" }
        super.onPostResume()
    }

    override fun onAttachedToWindow() {
        debugLog { "onAttachedToWindow" }
        super.onAttachedToWindow()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        debugLog { "onCreateOptionsMenu" }
        return super.onCreateOptionsMenu(menu)
    }

    override fun onPause() {
        debugLog { "onPause" }
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        debugLog { "onSaveInstanceState" }
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onStop() {
        debugLog { "onStop" }
        super.onStop()
    }

    override fun onDestroy() {
        debugLog { "onDestroy" }
        super.onDestroy()
    }
}
