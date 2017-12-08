package com.virgo.kotlin.features

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.virgo.kotlin.ClassA
import com.virgo.kotlin.ClassA.Companion.x
import com.virgo.kotlin.R
import com.virgo.kotlin.common.ActivityPresenter
import com.virgo.kotlin.common.BasePresenter

class MainActivity : ActivityPresenter<MainPresenter>(), MainView {
    override fun bindPresenter(): MainPresenter {
        return MainPresenter(this);
    }

    override fun getLayoutResourceId(): Int {
        return R.layout.activity_main
    }

    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        mainPresenter = MainPresenter(this);
        mainPresenter?.setPresenter(this);

        val fab = findViewById<View>(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action " + mainPresenter!!.getData(), Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val mainView: ClassA = ClassA()
        mainView.getData();

        val number = mainView.isTrue()

    }*/

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
