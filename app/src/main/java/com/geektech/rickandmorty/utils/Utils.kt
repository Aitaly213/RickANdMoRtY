package com.geektech.rickandmorty.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide


class Utils {

    companion object {

        fun ImageView.loadImage(context: Context, url: String) {
            Glide.with(context)
                .load(url)
                .into(this)
        }

    }
}