package com.sbw.wish.payment.ui.main

import androidx.lifecycle.ViewModel
import androidx.core.content.ContextCompat.startActivity
import android.content.Intent
import android.view.View
import com.sbw.wish.payment.PaymentActivity
import com.sbw.wish.payment.PaymentErrorCode
import org.json.JSONObject


class MainViewModel : ViewModel() {
    fun payNow(view: View) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        val context = view.getContext()
//        val intent = Intent(context, ProductDetailActivity::class.java)
//        intent.putExtra("productId", productId)
//        context.startActivity(intent)

//        val intent = Intent(context, PaymentActivity::class.java)
//        intent.putExtra("redirectionUrl", "http://192.168.0.105:4200/")
//        intent.putExtra("activityCodeResult", PaymentErrorCode.WEBVIEW_ACTIVITY_CODE_RESULT)
//        context.startActivityForResult(intent, PaymentErrorCode.WEBVIEW_ACTIVITY_CODE_RESULT)
    }
    // TODO: Implement the ViewModel
}
