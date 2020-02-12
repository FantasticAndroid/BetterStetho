package com.android.betterstetho.volley

import com.android.betterstetho.CoreApp
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.better.stetho.VolleyUtil

class ApiClient(private val coreApp: CoreApp) {

    fun addRequestInQueue(request: StringRequest) {
        val httpStack = VolleyUtil.getHttpTask()
        val queue = Volley.newRequestQueue(coreApp, httpStack)
        queue.add(request)
    }
}