package com.virgo.kotlin.features.home

import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.virgo.kotlin.ClassA
import com.virgo.kotlin.ClassA.Companion.x
import com.virgo.kotlin.R
import com.virgo.kotlin.common.ActivityPresenter

class MainActivity : ActivityPresenter<MainPresenter>(), MainView {
    override fun bindPresenter(): MainPresenter {
        return MainPresenter(this);
    }

    override fun getLayoutResourceId(): Int {
        return R.layout.activity_main
    }

    fun ClassA.isTrue() = x == 2

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)
    }

    override fun showMessage(msg: String) {
        Toast.makeText(applicationContext, "Some message showing here", Toast.LENGTH_LONG).show()
    }
}
