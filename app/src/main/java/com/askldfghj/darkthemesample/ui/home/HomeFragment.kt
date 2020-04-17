package com.askldfghj.darkthemesample.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.askldfghj.darkthemesample.R
import com.askldfghj.darkthemesample.databinding.HomeFragmentBinding
import com.askldfghj.darkthemesample.ext.bindingAndInflate

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return bindingAndInflate<HomeFragmentBinding>(R.layout.home_fragment, container) {
        }
    }

    companion object {
        fun newInstance() = HomeFragment().also {
            it.arguments = Bundle()
        }
    }
}
