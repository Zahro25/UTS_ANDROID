package com.zahro.budaya.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zahro.budaya.R
import com.zahro.budaya.activity.detail.DetailPapuaActivity
import com.zahro.budaya.activity.detail.DetailSulawesiActivity
import com.zahro.budaya.adapter.ImageAdapter
import com.zahro.budaya.model.Image

class SulawesiActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sulawesi)
        val imageList = listOf(
            Image(
                R.drawable.greet1,
                "Rumah Adat Suku Bugis",
                "Rumah adat Sulawesi Selatan ini cukup menarik. karena rumah yang dibuat suku Bugis ini tidak memakai satupun paku, digantikan oleh besi atau kayu.Rumah ini dibangun berdasarkan status sosial. Ada rumah saoraja yang digunakan untuk kalangan bangsawan, dan rumah bola digunakan rakyat biasa.Rumah adat suku bugis dibangun berdasarkan status sosial\n" +
                        "\n"
            ),
            Image(
                R.drawable.greet1,
                "Rumah Adat Suku Makasar\n",
                "Rumah adat ini berbeda dengan suku lainnya, rumah ini juga dikenal dengan sebutan Balla. Rumah ini bentuknya panggung dan tingginya sekitar 3 meter. Rumah ini disangga dengan 5 penyangga ke arah belakang dan 5 penyangga ke arah samping dengan kayu.Atap rumah ini berbentuk pelana dengan sudut lancip menghadap ke bawah. Atapnya  biasa terbuat dari nipah, rumbia, bambu, ijuk, atau pun alang-alang.da yang menarik pada bagian puncak atap yang berbatasan dengan dinding yaitu ada bentuk segitiga yang dinamakan timbaksela yang menandakan derajat kebangsawanan mereka."
            ),
            Image(
                R.drawable.greet1,
                "Baju Tutu",
                "Baju tutu ini adalah pakaian adat sulawesi selatan yang berasal dari suku bugis khusus untuk kaum pria, pakaian ini bentuknya seperti jas dengan dipadukan bawahan nya mengenakan celana atau paroci atau juga ada yang memakai kain sarung lipa garusuk dan menggunakan tutup kepala kopiah atau songkok."
            ),
            Image(
                R.drawable.greet1,
                "Tari Pakkuru Sumange",
                "Tarian ini merupakan khas Soppeng, tarian ini untuk menyambut tamu yang menggambarkan salam sejahtera bagi tamu yang datang dan tuan rumah."
            ),
            Image(
                R.drawable.greet1,
                "Tari Gandrang Bulo",
                "Tarian ini dinyatakan sebagai salah satu simbol penting bagi masyarakat Makassar. Tarian ini ditampilkan ketika ada pesta rakyat.n"
            ),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_sulawesi)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this,imageList){
            val intent = Intent(this, DetailSulawesiActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)
        }
    }
}