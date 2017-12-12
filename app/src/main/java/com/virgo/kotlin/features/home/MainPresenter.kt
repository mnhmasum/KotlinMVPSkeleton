package com.virgo.kotlin.features.home

import com.virgo.kotlin.common.BasePresenter

/**
 * Created by nazmul on 11/17/17.
 */
class MainPresenter(mainActivity: MainActivity) : BasePresenter {
    private var mainView: MainView? = mainActivity
    override fun onPausePresenter() {
        mainView?.showMessage("Starting....")
    }

    fun setPresenter(mainView: MainView) {
        this.mainView = mainView
    }

    fun getData(): String {
        mainView?.showMessage("Hello kotlin")
        return "HI There"
    }
}