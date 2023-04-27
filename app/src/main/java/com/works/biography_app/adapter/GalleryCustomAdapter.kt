package com.works.biography_app.adapter

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.works.biography_app.R
import com.works.biography_app.models.Gallery
import com.bumptech.glide.Glide

class GalleryCustomAdapter(private val context: Activity, private val list: List<Gallery>) :
    ArrayAdapter<Gallery>(context, R.layout.custom_gallery_layout, list) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val RootView = context.layoutInflater.inflate(R.layout.custom_gallery_layout, null, true)

        val r_caption = RootView.findViewById<TextView>(R.id.r_caption)
        val r_date = RootView.findViewById<TextView>(R.id.r_date)
        val r_image = RootView.findViewById<ImageView>(R.id.r_image)

        val gallery = list.get(position)
        r_caption.text = gallery.caption
        r_date.text = gallery.date
        Glide.with(context).load(gallery.image).into(r_image)

        return RootView
    }
}