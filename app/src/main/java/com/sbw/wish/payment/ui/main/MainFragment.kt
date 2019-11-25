package com.sbw.wish.payment.ui.main

import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.sbw.wish.payment.PaymentActivity
import com.sbw.wish.payment.PaymentErrorCode
import com.sbw.wish.payment.R

class MainFragment : Fragment(), View.OnClickListener {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var btn_pay: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_pay = view.findViewById(R.id.btn_pay)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onStart() {
        super.onStart()
        btn_pay?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_pay -> {
                val intent = Intent(this?.activity, PaymentActivity::class.java)
                intent.putExtra("redirectionUrl", "http://192.168.0.105:4200/")
                intent.putExtra("activityCodeResult", PaymentErrorCode.WEBVIEW_ACTIVITY_CODE_RESULT)
                this.startActivityForResult(intent, PaymentErrorCode.WEBVIEW_ACTIVITY_CODE_RESULT)
            }//viewModel.payNow()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

    }

}
