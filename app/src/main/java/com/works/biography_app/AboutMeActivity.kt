package com.works.biography_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import com.bumptech.glide.Glide

class AboutMeActivity : AppCompatActivity() {
    lateinit var imgAboutMe: ImageView
    lateinit var imgBtnBackwardsAboutMe: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)

        imgAboutMe = findViewById<ImageView>(R.id.imgAboutMe)
        imgBtnBackwardsAboutMe = findViewById(R.id.imgBtnBackwardsAboutMe)

        val imgAboutMeUrl = "https://i.ibb.co/C0Y0h3K/1664555992828.jpg"
        Glide.with(this).load(imgAboutMeUrl).into(imgAboutMe)

        imgBtnBackwardsAboutMe.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}