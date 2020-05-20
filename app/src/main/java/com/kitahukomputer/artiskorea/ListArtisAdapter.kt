package com.kitahukomputer.artiskorea

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListArtisAdapter(val listArtis: ArrayList<Artis>) : RecyclerView.Adapter<ListArtisAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_artis, viewGroup, false)
        return ListViewHolder(view)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val artis = listArtis[position]
        Glide.with(holder.itemView.context)
            .load(artis.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = artis.name

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listArtis[holder.adapterPosition]) }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Artis)
    }

    override fun getItemCount(): Int {
        return listArtis.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}