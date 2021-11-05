package com.zahro.budaya.activity.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.zahro.budaya.R
import com.zahro.budaya.activity.JawaActivity
import com.zahro.budaya.activity.KalimantanActivity
import com.zahro.budaya.model.Image

class DetailKalimantanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kalimantan)
        val image = intent.getParcelableExtra<Image>(KalimantanActivity.INTENT_PARCELABLE)

        val imgSrc = findViewById<ImageView>(R.id._imageDetail)
        val imgTitle = findViewById<TextView>(R.id._imageTitle)
        val imgDesc = findViewById<TextView>(R.id._imageDesc)

        if (image != null) {
            imgSrc.setImageResource(image.imageSrc)
        }
        if (image != null) {
            imgTitle.text = image.imageTitle
        }
        if (image != null) {
            imgDesc.text = image.imageDesc
        }
    }
}