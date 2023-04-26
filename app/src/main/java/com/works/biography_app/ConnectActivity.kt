package com.works.biography_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ConnectActivity : AppCompatActivity() {
    lateinit var imgBtnBackwards : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connect)

        imgBtnBackwards = findViewById(R.id.imgBtnBackwardsConnect)

        imgBtnBackwards.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish() // Geri butonu koydum  diye her intent sonrası öncekini kapatıyorum
        }
    }
}