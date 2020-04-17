package com.askldfghj.darkthemesample.ui.setting

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.askldfghj.darkthemesample.R
import com.askldfghj.darkthemesample.databinding.SettingFragmentBinding
import com.askldfghj.darkthemesample.ext.bindingAndInflate
import com.debug.util.debugLog

class SettingFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        debugLog { "onCreateView" }
        return bindingAndInflate<SettingFragmentBinding>(R.layout.setting_fragment, container) {
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
}
