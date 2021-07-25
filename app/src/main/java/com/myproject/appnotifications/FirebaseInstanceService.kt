package com.myproject.appnotifications

import android.util.Log
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService

class FirebaseInstanceService : FirebaseMessagingService() {

    override fun onNewToken(p0: String) {
        FirebaseMessaging.getInstance().token.addOnCompleteListener {
            if (it.isComplete) {
                Log.i("**newTokenService", it.result.toString())
            }
        }
    }
}