package com.works.biography_app

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btnHomePage : Button
    lateinit var btnAboutMe : Button
    lateinit var btnGallery : Button
    lateinit var btnConnect : Button
    lateinit var btnGithub : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHomePage = findViewById(R.id.btnHomePage)
        btnAboutMe = findViewById(R.id.btnAboutMe)
        btnGallery = findViewById(R.id.btnGallery)
        btnConnect = findViewById(R.id.btnConnect)
        btnGithub = findViewById(R.id.btnGithub)

        btnHomePage.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnAboutMe.setOnClickListener {
            var intent = Intent(this,AboutMeActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnGallery.setOnClickListener {
            var intent = Intent(this,GalleryActivity::class.java)
            startActivity(intent)
            // finish() // Bunuda tekrar kapatmıyorum hem buton koymadığımdan hemde arkaplanda kalsın yüklü şekilde görseller diye
        }

        btnConnect.setOnClickListener {
            var intent = Intent(this,ConnectActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnGithub.setOnClickListener {
            var intent = Intent(this,WebViewActivity::class.java)
            startActivity(intent)
            //finish() // Diğerlerinde geriye dönme butonu koyduğumdan finishledim fakat bunda koymadım o yüzden arkaplanda açık kalıyor.
        }

        // 3 noktalı menü yapılacak uygumaladan çıkacak,çıkmadan önce alertbox ile emin misin sorusu sorulacak
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.leave -> alertDialog()
        }
        return super.onOptionsItemSelected(item)
    }

    fun alertDialog()
    {
        var alert = AlertDialog.Builder(this)
        alert.setMessage("Uygulamayı kapatmak istediğinizden emin misiniz?")
        alert.setCancelable(false)
        alert.setPositiveButton("Evet",DialogInterface.OnClickListener { dialogInterface, i ->
            finishAffinity() // Tüm uygulamaları ve etkinlikleri kapatan kod
        })

        alert.setNegativeButton("Hayır",DialogInterface.OnClickListener { dialogInterface, i ->  })

        alert.show()
    }

    // Bu alertDiolog ve options menuyu tek bir classda yazıp o classı çağırabilmeyi sorucam mentörüme
}