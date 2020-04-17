package com.debug.util

import android.util.Log

inline fun debugLog(block: () -> String? = { null }) {
    val message = block() ?: ""
    when (val origin = Throwable().stackTrace.firstOrNull()) {
        null -> {
            Log.d("UnknownClass", message)
        }
        else -> {
            val className = origin.className?.split(".")?.lastOrNull()
            Log.d(className, message)
        }
    }
}
