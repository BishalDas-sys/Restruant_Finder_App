package com.rifdahalf.aplikasirestoran.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.rifdahalf.aplikasirestoran.R
import com.rifdahalf.aplikasirestoran.model.ModelMainHorizontal
import kotlinx.android.synthetic.main.list_item_main_horizontal.view.*

class MainAdapterHorizontal (

    private val mContext: Context, private val items: List<ModelMainHorizontal>)
    : RecyclerView.Adapter<MainAdapterHorizontal.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_main_horizontal, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val data = items[position]

        Glide.with(mContext)
            .load(data.imageUrl)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(holder.imgThumb)

        Glide.with(mContext)
            .load(data.imageUrl)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(holder.imgCollection)

        holder.tvTitle.text = data.title
    }

    override fun getItemCount(): Int {
        return items.size
    }

    //Class Holder
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgThumb: ImageView
        var imgCollection: ImageView
        var tvTitle: TextView

        init {
            imgThumb = itemView.imgThumb
            imgCollection = itemView.imgCollection
            tvTitle = itemView.tvTitle
        }
    }
}