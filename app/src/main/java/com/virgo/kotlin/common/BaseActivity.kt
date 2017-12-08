package com.virgo.kotlin.common

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.virgo.kotlin.R

/**
 * Created by nazmul on 11/21/17.
 */
abstract class BaseActivity : AppCompatActivity() {
    protected abstract fun getLayoutResourceId(): Int
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(getLayoutResourceId())
    }
}