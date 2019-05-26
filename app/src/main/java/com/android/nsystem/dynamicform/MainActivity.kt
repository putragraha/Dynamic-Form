package com.android.nsystem.dynamicform

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.android.nsystem.dynamicform.entity.FormObject
import com.android.nsystem.dynamicform.ui.MainActivityUI
import com.android.nsystem.dynamicform.webservice.FORM_COMPONENT_URL
import com.google.gson.GsonBuilder
import okhttp3.*
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.toast
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFormView()
    }

    private fun initFormView() {
        val request = Request.Builder().url(FORM_COMPONENT_URL).build()
        val client = OkHttpClient()
        client.newCall(request).enqueue(object: Callback {
            override fun onFailure(call: Call, e: IOException) {
                toast(e.localizedMessage)
            }

            override fun onResponse(call: Call, response: Response) {
                val body = response.body()?.string()
                val gson = GsonBuilder().create()
                val formObject = gson.fromJson(body, FormObject::class.java)

                runOnUiThread {
                    MainActivityUI(formObject.questions).setContentView(this@MainActivity)
                }
            }

        })
    }

}
