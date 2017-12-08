package com.virgo.kotlin

import android.util.Log

/**
 * Created by nazmul on 11/13/17.
 */

open class BaseView {
    init {
        Log.d(TAG, "BaseView: Init")
    }

    companion object {
        private val TAG = "BaseView"
    }
}
