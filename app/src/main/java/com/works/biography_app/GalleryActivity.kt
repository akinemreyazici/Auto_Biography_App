package com.works.biography_app

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListView
import androidx.appcompat.app.AlertDialog
import com.works.biography_app.adapter.GalleryCustomAdapter
import com.works.biography_app.services.GalleryService

class GalleryActivity : AppCompatActivity() {
    lateinit var galleryListView : ListView

    val galleryService = GalleryService()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        galleryListView = findViewById(R.id.galleryListView)
        val customAdapter = GalleryCustomAdapter(this,galleryService.GalleryResult())
        galleryListView.adapter = customAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_2,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.leave -> alertDialog()

            R.id.homepage -> {
                var intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun alertDialog()
    {
        var alert = AlertDialog.Builder(this)
        alert.setMessage("Uygulamayı kapatmak istediğinizden emin misiniz?")
        alert.setCancelable(false)
        alert.setPositiveButton("Evet", DialogInterface.OnClickListener { dialogInterface, i ->
            finishAffinity() // Tüm uygulamaları ve etkinlikleri kapatan kod
        })

        alert.setNegativeButton("Hayır", DialogInterface.OnClickListener { dialogInterface, i ->  })

        alert.show()
    }
}