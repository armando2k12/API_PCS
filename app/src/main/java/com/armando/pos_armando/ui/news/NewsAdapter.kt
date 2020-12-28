package com.armando.pos_armando.ui.news

import android.content.Context
import android.content.Intent
import androidx.databinding.ViewDataBinding
import com.armando.pos_armando.R
import com.armando.pos_armando.data.model.News
import com.armando.pos_armando.databinding.ItemNewsBinding
import com.armando.pos_armando.ui.base.BaseAdapter
import com.bumptech.glide.Glide

class NewsAdapter (val context: Context):BaseAdapter<News>(R.layout.item_news){
    override fun onBind(binding: ViewDataBinding?, data: News) {
        val mBinding = binding as ItemNewsBinding
        Glide.with(context).load(data.thumb).into(mBinding.itemPoster)
    }

    override fun onClick(binding: ViewDataBinding?, data: News) {
        val intent = Intent(context,NewsActivity::class.java)
        intent.putExtra(NewsActivity.OPEN_NEWS, data)
        context.startActivity(intent)
    }
}