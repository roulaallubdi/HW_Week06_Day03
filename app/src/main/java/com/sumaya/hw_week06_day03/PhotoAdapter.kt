package com.sumaya.hw_week06_day03

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

private class PhotoAdapter(private val galleryItems: List<GalleryItem>)
    : RecyclerView.Adapter<PhotoHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PhotoHolder {
        val textView = TextView(parent.context)
        return PhotoHolder(textView)
    }

    override fun getItemCount(): Int = galleryItems.size
    override fun onBindViewHolder(holder: PhotoHolder, position: Int) {
        val galleryItem = galleryItems[position]
        holder.bindTitle(galleryItem.title)
    }
}
