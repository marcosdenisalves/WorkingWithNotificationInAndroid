package com.myproject.appnotifications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {

    lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend = findViewById(R.id.button_send_notification)
        btnSend.setOnClickListener {
            this.showNotification(
                "1",
                "Look your notification my friend",
                "your received a notification made by a future android developer"
            )
        }
        FirebaseMessaging.getInstance().token.addOnCompleteListener {
            if (it.isComplete) {
                Log.i("**newToken", it.result.toString())
            }
        }
    }
}