package com.zahro.budaya.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zahro.budaya.R
import com.zahro.budaya.activity.detail.DetailJawaActivity
import com.zahro.budaya.adapter.ImageAdapter
import com.zahro.budaya.model.Image

class JawaActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jawa)
        val imageList = listOf(
            Image(
                R.drawable.greet1,
                "Reog Ponorogo",
                "Tari Reog Ponorogo yang berasal dari Ponorogo, Jawa Timur ini yang paling terkenal dengan unsur magisnya. Tari Reog yang sering dipentaskan dalam acara adat hingga pergelaran acara hiburan ini dikenal dengan kepiawaian penari yang mampu membawakan topeng tarian yang beratnya mencapai 50-70 kilogram. Dengan berat mencapai angka tersebut, penari masih bisa bergerak tanpa terlihat berat sehingga banyak yang menduga menggunakan unsur gaib."
            ),
            Image(
                R.drawable.greet1,
                "Kuda Lumping",
                "Kuda Lumping adalah kesenian tradisional yang berkembang di Indonesia (Jawa) sejak zaman kerajaan Hindu. Di masa kerajaan, tarian merupakan unsur penting dalam setiap upacara yang berhubungan dengan spiritualitas dan sebagai cara berkomunikasi dengan para leluhur. Makanya, Kuda Lumping merupakan salah satu bentuk kesenian Jawa kuno yang didalamnya mengandung kekuatan magis.\n" +
                        "\n"
            ),
            Image(
                R.drawable.greet1,
                "Tari Ronggeng",
                "Tari yang berasal dari Jawa Barat ini terkenal memiliki unsur mistis dalam tariannya. Sebab digunakan untuk membalas dendam, sehingga berhubungan dengan kematian.Salah satu cerita lokal mengenai awal mula Tari Ronggeng berkisah tentang seorang putri yang ditinggal mati oleh pujaan hatinya. Sang wanita ini pun terus menangis berhari-hari meratapi kematian kekasihnya sampai menimbulkan bau yang sangat menyengat."
            ),
            Image(
                R.drawable.greet1,
                "Kesenian Debus",
                "Kesenian ini di kenal muncul sejak abad ke-16, yang saat itu menjadi ajang memompa semangat juang rakyat Banten. Dalam kesenian Debus, seseorang yang akan membawakan acara ini umumnya mengucapkan kalimat, \"Sa elmu sa guru ulah sok nga ganggu\" artinya satu ilmu satu guru dimohon jangan mengganggu."
            ),
            Image(
                R.drawable.greet1,
                "Tari Sintren",
                "Tarian yang yang berasal dari pesisir utara Jawa ini terkenal dengan unsur magisnya. Seseorang yang membawakan tarian ini haruslah menjaga kesuciannya dengan melakukan puasa. Konon, tujuannya adalah untuk mempermudah proses masuknya roh kedalam tubuh wanita yang membawakan."
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_jawa)
        recyclerView.layoutManager =LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this,imageList){
            val intent = Intent(this, DetailJawaActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)
        }
    }
}