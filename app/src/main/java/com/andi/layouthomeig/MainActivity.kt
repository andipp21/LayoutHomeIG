package com.andi.layouthomeig

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Glide.with(this)
            .load(R.drawable.foto_tiga)
            .circleCrop()
            .into(ivStorySatu)

        Glide.with(this)
            .load(R.drawable.foto_tiga)
            .circleCrop()
            .into(ivStoryDua)

        Glide.with(this)
            .load(R.drawable.foto_tiga)
            .circleCrop()
            .into(ivStoryTiga)

        Glide.with(this)
            .load(R.drawable.foto_tiga)
            .circleCrop()
            .into(ivStoryEmpat)

        Glide.with(this)
            .load(R.drawable.foto_tiga)
            .circleCrop()
            .into(ivStoryLima)

        Glide.with(this)
            .load(R.drawable.foto_tiga)
            .circleCrop()
            .into(ivStoryEnam)

        Glide.with(this)
            .load(R.drawable.foto_dua)
            .centerCrop()
            .into(ivFotoSatu)

        Glide.with(this)
            .load(R.drawable.foto_dua)
            .centerCrop()
            .into(ivFotoDua)

    }
}