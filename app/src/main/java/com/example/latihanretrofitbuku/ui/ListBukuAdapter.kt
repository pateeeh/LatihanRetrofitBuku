package com.example.latihanretrofitbuku.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.latihanretrofitbuku.data.response.BukuItem
import com.example.latihanretrofitbuku.databinding.ItemBukuBinding


class ListBukuAdapter: ListAdapter<BukuItem, ListBukuAdapter.ViewHolder>(DIFF_CALLBACK) {
    class ViewHolder (private val binding: ItemBukuBinding): RecyclerView.ViewHolder(binding.root){
        fun bind (dataItem : BukuItem){
            Glide.with(binding.root.context)
                .load(dataItem.coverImage)
                .into(binding.imgCoverBook)
            binding.tvAuthor.text = dataItem.author
            binding.tvTitle.text = dataItem.title

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListBukuAdapter.ViewHolder {
        val binding = ItemBukuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListBukuAdapter.ViewHolder, position: Int) {
        val bukuItem = getItem(position)
        holder.bind(bukuItem)
    }

    companion object{
         val DIFF_CALLBACK = object : DiffUtil.ItemCallback<BukuItem>() {
            override fun areContentsTheSame(oldItem: BukuItem, newItem: BukuItem): Boolean {
                return oldItem == newItem
            }

            override fun areItemsTheSame(oldItem: BukuItem, newItem: BukuItem): Boolean {
                return oldItem == newItem
            }

        }
    }
}