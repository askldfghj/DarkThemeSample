package com.askldfghj.darkthemesample.ext

import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

typealias DefineDataBinding<T> = (binding: T) -> Unit

fun <T : ViewDataBinding> Fragment.bindingAndInflate(
    @LayoutRes layoutId: Int,
    container: ViewGroup?,
    block: DefineDataBinding<T> = {}
): View {
    return DataBindingUtil.inflate<T>(layoutInflater, layoutId, container, false)
        .also { binding ->
            binding.lifecycleOwner = viewLifecycleOwner
        }
        .also(block)
        .root
}
