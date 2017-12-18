package com.example.monkey.customedittextkotlinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonActivityMain.setOnClickListener {
            val customDialog = CustomDialog.createDialog()
            customDialog.show(supportFragmentManager, "")
        }
    }
}
