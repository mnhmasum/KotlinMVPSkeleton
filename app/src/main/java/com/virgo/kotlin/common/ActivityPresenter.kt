package com.virgo.kotlin.common

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

/**
 * Created by nazmul on 11/21/17.
 */
abstract class ActivityPresenter<T : BasePresenter> : BaseActivity() {
    var presenter: T? = null
    abstract fun bindPresenter(): T
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = bindPresenter()
        presenter?.onPausePresenter()
        Log.d("ActivityPresenter", "called");
    }

    override fun onPause() {
        super.onPause()
    }
}