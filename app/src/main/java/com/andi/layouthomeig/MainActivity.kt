package com.andi.layouthomeig

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            this.supportActionBar?.hide()
        } catch (e: NullPointerException){}

        val typeface = Typeface.createFromAsset(assets, "billabong.ttf")

        tvInstagram.text = "Instagram"
        tvInstagram.typeface = typeface

        Glide.with(this)
            .load(R.drawable.foto_satu)
            .circleCrop()
            .into(ivProfile)

        Glide.with(this)
            .load(R.drawable.foto_empat)
            .circleCrop()
            .into(ivProfilSatu)

        Glide.with(this)
            .load(R.drawable.foto_satu)
            .circleCrop()
            .into(ivAccount)

        Glide.with(this)
            .load(R.drawable.foto_empat)
            .centerCrop()
            .into(ivFotoSatu)

        Glide.with(this)
            .load(R.drawable.foto_dua)
            .circleCrop()
            .into(ivProfilDua)

        Glide.with(this)
            .load(R.drawable.foto_satu)
            .circleCrop()
            .into(ivAccountDua)

        Glide.with(this)
            .load(R.drawable.foto_dua)
            .centerCrop()
            .into(ivFotoDua)

        Glide.with(this)
            .load(R.drawable.foto_tiga)
            .circleCrop()
            .into(ivProfilTiga)

        Glide.with(this)
            .load(R.drawable.foto_satu)
            .circleCrop()
            .into(ivAccountTiga)

        Glide.with(this)
            .load(R.drawable.foto_tiga)
            .centerCrop()
            .into(ivFotoTiga)

        Glide.with(this)
            .load(R.drawable.foto_tujuh)
            .circleCrop()
            .into(ivStorySatu)

        Glide.with(this)
            .load(R.drawable.foto_lapan)
            .circleCrop()
            .into(ivStoryDua)

        Glide.with(this)
            .load(R.drawable.foto_lima)
            .circleCrop()
            .into(ivStoryTiga)

        Glide.with(this)
            .load(R.drawable.foto_enam)
            .circleCrop()
            .into(ivStoryEmpat)

        Glide.with(this)
            .load(R.drawable.foto_empat)
            .circleCrop()
            .into(ivStoryLima)

        Glide.with(this)
            .load(R.drawable.foto_tiga)
            .circleCrop()
            .into(ivStoryEnam)



    }
}