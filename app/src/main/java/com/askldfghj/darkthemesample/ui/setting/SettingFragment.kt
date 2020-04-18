package com.askldfghj.darkthemesample.ui.setting

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_YES
import androidx.fragment.app.Fragment
import com.askldfghj.darkthemesample.R
import com.askldfghj.darkthemesample.databinding.SettingFragmentBinding
import com.askldfghj.darkthemesample.ext.bindingAndInflate
import com.debug.util.debugLog

class SettingFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        debugLog { "onCreateView" }
        return bindingAndInflate<SettingFragmentBinding>(R.layout.setting_fragment, container) { binding ->
            val mode = context?.getSharedPreferences("pref", Context.MODE_PRIVATE)?.getInt("mode",
                MODE_NIGHT_FOLLOW_SYSTEM
            )

            when (mode) {
                MODE_NIGHT_FOLLOW_SYSTEM -> {
                    binding.systemBtn.isChecked = true
                }
                MODE_NIGHT_NO -> {
                    binding.lightThemeBtn.isChecked = true
                }
                MODE_NIGHT_YES -> {
                    binding.darkThemeBtn.isChecked = true
                }
            }

            binding.themeSelectGroup.setOnCheckedChangeListener { radioGroup, i ->
                val view = radioGroup.findViewById<View>(i)
                setCurrentTheme(radioGroup.indexOfChild(view))
            }
        }
    }

    override fun onAttach(context: Context) {
        debugLog { "onAttach" }
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        debugLog { "onCreate" }
        super.onCreate(savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        debugLog { "onActivityCreated" }
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        debugLog { "onStart" }
        super.onStart()
    }

    override fun onResume() {
        debugLog { "onResume" }
        super.onResume()
    }

    override fun onPause() {
        debugLog { "onPause" }
        super.onPause()
    }

    override fun onStop() {
        debugLog { "onStop" }
        super.onStop()
    }

    override fun onDestroyView() {
        debugLog { "onDestroyView" }
        super.onDestroyView()
    }

    override fun onDestroy() {
        debugLog { "onDestroy" }
        super.onDestroy()
    }

    override fun onDetach() {
        debugLog { "onDetach" }
        super.onDetach()
    }

    companion object {
        fun newInstance() = SettingFragment().also {
            it.arguments = Bundle()
        }
    }

    private fun setCurrentTheme(index: Int) {
        val mode = when (index) {
            0 -> {
                saveModeInPref(MODE_NIGHT_FOLLOW_SYSTEM)
                MODE_NIGHT_FOLLOW_SYSTEM
            }
            1 -> {
                saveModeInPref(MODE_NIGHT_NO)
                MODE_NIGHT_NO
            }
            2 -> {
                saveModeInPref(MODE_NIGHT_YES)
                MODE_NIGHT_YES
            }
            else -> {
                context?.getSharedPreferences("pref", Context.MODE_PRIVATE)?.getInt("mode",
                    MODE_NIGHT_FOLLOW_SYSTEM
                ) ?: MODE_NIGHT_FOLLOW_SYSTEM
            }
        }
        AppCompatDelegate.setDefaultNightMode(mode)
    }

    private fun saveModeInPref(mode: Int) {
        context?.getSharedPreferences("pref", Context.MODE_PRIVATE)?.edit()?.putInt("mode", mode)?.apply()
    }
}
