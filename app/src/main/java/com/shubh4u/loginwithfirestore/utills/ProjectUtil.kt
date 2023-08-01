package com.shubh4u.loginwithfirestore.utills

import android.app.Dialog
import android.app.ProgressDialog
import android.content.Context

public  class ProjectUtil {
    private var mProgressDialog: ProgressDialog? = null

    public fun showProgressDialog(context: Context?, isCancelable: Boolean, message: String?): Dialog? {
        mProgressDialog = ProgressDialog(context)
        mProgressDialog!!.setProgressStyle(ProgressDialog.STYLE_SPINNER)
        mProgressDialog!!.setMessage(message)
        mProgressDialog!!.show()
        mProgressDialog!!.setCancelable(isCancelable)
        return mProgressDialog
    }

    fun pauseProgressDialog() {
        try {
            if (mProgressDialog != null) {
                mProgressDialog!!.cancel()
                mProgressDialog!!.dismiss()
                mProgressDialog = null
            }
        } catch (ex: IllegalArgumentException) {
            ex.printStackTrace()
        }
    }

}