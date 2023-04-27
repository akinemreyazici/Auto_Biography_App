package com.works.biography_app

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView
import androidx.appcompat.app.AlertDialog

class WebViewActivity : AppCompatActivity() {
    lateinit var webViewGithub: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        webViewGithub = findViewById(R.id.webViewGithub)

        val url = "https://github.com/aknemreyzc"

        webViewGithub.loadUrl(url)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_2, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.leave -> alertDialog()

            R.id.homepage -> {
                var intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun alertDialog() {
        var alert = AlertDialog.Builder(this)
        alert.setMessage("Uygulamayı kapatmak istediğinizden emin misiniz?")
        alert.setCancelable(false)
        alert.setPositiveButton("Evet", DialogInterface.OnClickListener { dialogInterface, i ->
            finishAffinity() // Tüm uygulamaları ve etkinlikleri kapatan kod
        })

        alert.setNegativeButton("Hayır", DialogInterface.OnClickListener { dialogInterface, i -> })

        alert.show()
    }
}