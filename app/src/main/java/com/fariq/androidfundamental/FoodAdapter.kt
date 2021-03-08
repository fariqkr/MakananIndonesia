package com.fariq.androidfundamental

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.text.NumberFormat
import java.util.*
import kotlin.collections.ArrayList

class FoodAdapter(private val list: ArrayList<Food>) : RecyclerView.Adapter<FoodAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback
    private lateinit var onItemFavoriteClickCallback: OnItemFavoriteClickCallBack

    fun setOnItemFavoriteClickCallback(onItemFavoriteClickCallBack : OnItemFavoriteClickCallBack) {
        this.onItemFavoriteClickCallback = onItemFavoriteClickCallBack
    }
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item, viewGroup, false)
        return ListViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = list[position]

        val localeID = Locale("in", "ID")
        val formatRupiah: NumberFormat = NumberFormat.getCurrencyInstance(localeID)


        Glide.with(holder.itemView.context)
                .load(data.image)
                .apply(RequestOptions().override(100, 100))
                .into(holder.imgPhoto)

        holder.tvName.text = data.name
        holder.tvKkal.text = data.kkal.toString() + " Kkal"
        holder.tvPrice.text = formatRupiah.format(data.price)

        holder.btnFavorite.setOnClickListener{
            onItemFavoriteClickCallback.onItemFavoriteClicked(list[holder.adapterPosition])
        }

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(list[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.image_item)
        var tvName: TextView = itemView.findViewById(R.id.name_item)
        var tvKkal : TextView = itemView.findViewById(R.id.kkal_item)
        var tvPrice: TextView = itemView.findViewById(R.id.price_item)
        var btnFavorite : ImageButton = itemView.findViewById(R.id.btn_favorite)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Food)
    }
    
    interface OnItemFavoriteClickCallBack {
        fun onItemFavoriteClicked(data : Food)
    }
}