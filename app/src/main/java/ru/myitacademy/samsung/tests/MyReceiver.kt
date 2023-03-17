package ru.myitacademy.samsung.tests

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.Gravity
import android.widget.Toast

class MyReceiver: BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent) {
       Toast.makeText(p0,p1.getStringExtra("hot_news"),Toast.LENGTH_SHORT).show()
    }
}
