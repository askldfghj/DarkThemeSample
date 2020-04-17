package com.askldfghj.darkthemesample.ui.setting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.askldfghj.darkthemesample.R
import com.askldfghj.darkthemesample.databinding.SettingFragmentBinding
import com.askldfghj.darkthemesample.ext.bindingAndInflate

class SettingFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return bindingAndInflate<SettingFragmentBinding>(R.layout.setting_fragment, container) {
        }
    }

    companion object {
        fun newInstance() = SettingFragment().also {
            it.arguments = Bundle()
        }
    }
}