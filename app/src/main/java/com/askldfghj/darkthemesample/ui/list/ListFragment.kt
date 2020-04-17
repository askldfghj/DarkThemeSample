package com.askldfghj.darkthemesample.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.askldfghj.darkthemesample.R
import com.askldfghj.darkthemesample.databinding.ListFragmentBinding
import com.askldfghj.darkthemesample.ext.bindingAndInflate

class ListFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return bindingAndInflate<ListFragmentBinding>(R.layout.list_fragment, container) {
        }
    }

    companion object {
        fun newInstance() = ListFragment().also {
            it.arguments = Bundle()
        }
    }
}
