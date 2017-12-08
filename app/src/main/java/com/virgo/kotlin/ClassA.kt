package com.virgo.kotlin

import android.util.Log

/**
 * Created by nazmul on 11/13/17.
 */
class ClassA : BaseView() {
    fun getData() {
        Log.d("ClassA", "called method getData()")
    }

    fun ClassA.isTrue(): Boolean {
        return x == 2;
    }

    companion object {
        private val TAG = "BaseView"
        public val x: Int = 10;
    }
}