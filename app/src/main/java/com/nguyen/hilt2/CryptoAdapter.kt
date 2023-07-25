package com.nguyen.hilt2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nguyen.hilt2.databinding.ItemCurrencyBinding

class CryptoAdapter(private val crypto: List<CryptoCurrency>): RecyclerView.Adapter<CryptoAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: ItemCurrencyBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: CryptoCurrency) {
            binding.apply {
                Glide.with(itemView).load(item.imageUrl).dontAnimate().into(image)
                // Glide.with(itemView).load(item.imageUrl).into(image)
                currency.text = item.name
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemCurrencyBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = crypto.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(crypto[position])
    }
}