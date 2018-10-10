package br.com.danielcastro.componentesaplicacao1

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

class MyFirebaseInstanceIdService : FirebaseInstanceIdService() {


    override fun onTokenRefresh() {
        super.onTokenRefresh()

        val token = FirebaseInstanceId.getInstance().token
        Log.i("TOKEN", token)


    }
}