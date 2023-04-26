package com.works.biography_app.services

import android.widget.ArrayAdapter
import com.works.biography_app.models.Gallery

class GalleryService
{
    fun GalleryResult() : List<Gallery>
    {
        var list = mutableListOf<Gallery>()
        val g1 = Gallery("Ecole 42 Havuz dönemi","26/07/2022","https://i.ibb.co/v1RWKv5/Whats-App-Image-2023-02-18-at-22-42-37.jpg")
        val g2 = Gallery("Rahmi M. Koç Müzesi (Taksiyarhis Kilisesi)","18/07/2022","https://i.ibb.co/9NX18k2/Whats-App-Image-2023-04-26-at-17-58-08.jpg")
        val g3 = Gallery("Ailemizin köpeği TOKYO","20/02/2023","https://i.ibb.co/N7Mdfb2/Whats-App-Image-2023-04-26-at-17-54-23.jpg")
        val g4 = Gallery("Kedim OSCAR","14/04/2022","https://i.ibb.co/7R7MRXR/Whats-App-Image-2023-04-26-at-17-54-34.jpg")
        val g5 = Gallery("Ayvalık hatırası","16/07/2022","https://i.ibb.co/thMwjD9/Whats-App-Image-2023-04-26-at-17-57-24.jpg")
        val g6 = Gallery("Ecole 42 bekçisi Moulinette","25/07/2022","https://i.ibb.co/NTjcMr4/Whats-App-Image-2023-04-26-at-17-55-46.jpg")
        val g7 = Gallery("Ecole 42 Ağustos Havuz Ekibi","5/08/2022","https://i.ibb.co/yPj8vZw/Whats-App-Image-2023-04-26-at-17-56-49.jpg")

        list.add(g1)
        list.add(g2)
        list.add(g3)
        list.add(g4)
        list.add(g5)
        list.add(g6)
        list.add(g7)

        return list
    }
}