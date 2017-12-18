package com.example.monkey.customedittextkotlinsample

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View

/**
 * Created by monkey on 2017/12/18.
 */
class CustomDialog: DialogFragment(){
    private val TAG = "CustomDialo"

    companion object {
        fun createDialog(): DialogFragment{
            val customDialog = CustomDialog()
            return customDialog
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(context)
        builder.setMessage("カスタムダイアログ")
                .setPositiveButton("はい") { dialog, which -> mOnPositiveClick()}
                //.create()

        return builder.create()
    }

    private fun mOnPositiveClick() {
        Log.d(TAG, "hoge")
    }
}