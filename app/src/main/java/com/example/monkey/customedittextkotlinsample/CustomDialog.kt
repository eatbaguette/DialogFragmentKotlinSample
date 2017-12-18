package com.example.monkey.customedittextkotlinsample

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import android.widget.EditText

/**
 * Created by monkey on 2017/12/18.
 */
class CustomDialog : DialogFragment() {
    private lateinit var customDialog: Dialog

    private val TAG = "CustomDialog"

    companion object {
        fun createDialog(): DialogFragment {
            val customDialog = CustomDialog()
            return customDialog
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val editText = EditText(context)

        val builder = AlertDialog.Builder(context)
        builder.setMessage("カスタムダイアログ")
                .setPositiveButton("はい") { dialog, which -> mOnPositiveClick() }
                .setView(editText)

        this.customDialog = builder.create()

        this.customDialog.setOnShowListener(object : DialogInterface.OnShowListener {
            override fun onShow(p0: DialogInterface?) {
                Log.d(TAG, "onShow")
            }
        })

        return this.customDialog
    }

    private fun mOnPositiveClick() {
        Log.d(TAG, "positive button Clicked")
    }
}