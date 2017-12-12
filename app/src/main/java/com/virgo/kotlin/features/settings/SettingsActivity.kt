package com.virgo.kotlin.features.home.settings

import android.widget.Toast
import com.virgo.kotlin.R
import com.virgo.kotlin.common.ActivityPresenter
import com.virgo.kotlin.features.settings.SettingsPresenter
import com.virgo.kotlin.features.settings.SettingsView

/**
 * Created by nazmul on 12/11/17.
 */
class SettingsActivity : ActivityPresenter<SettingsPresenter>(), SettingsView {
    override fun getLayoutResourceId(): Int {
        return R.layout.activity_settings
    }

    override fun bindPresenter(): SettingsPresenter {
        return SettingsPresenter(this);
    }

    override fun showMessage(msg: String) {
        Toast.makeText(this@SettingsActivity, msg, Toast.LENGTH_SHORT).show();
    }

}