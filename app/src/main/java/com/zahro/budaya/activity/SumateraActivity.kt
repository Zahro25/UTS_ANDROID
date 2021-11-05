package com.zahro.budaya.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zahro.budaya.R
import com.zahro.budaya.activity.detail.DetailPapuaActivity
import com.zahro.budaya.activity.detail.DetailSumateraActivity
import com.zahro.budaya.adapter.ImageAdapter
import com.zahro.budaya.model.Image

class SumateraActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sumatera)
        val imageList = listOf(
            Image(
                R.drawable.greet1,
                "Pacu Jawi",
                "Dalam kunjungannya ke Sumatera Barat, Gordon Ramsay juga diajak melihat langsung budaya Pacu Jawi yang khas di Kabupaten Tanah Datar. Tak tanggung-tanggung, Ramsay bahkan juga dipaksa ikut memainkan Pacu Jawi.\n" +
                        "\n" +
                        "Bagi masyarakat minang di Kabupaten Tanah Datar, waktu usai panen menjadi momen untuk bersyukur dan berterima kasih atas hasil bumi yang melimpah. Ungkapan terima kasih itu pun dituangkan lewat tradisi Pacu Jawi atau balap sapi.\n" +
                        "\n" +
                        "Baca artikel detikTravel, \"3 Budaya Sumatra Barat yang Diperkenalkan ke Gordon Ramsay\" selengkapnya https://travel.detik.com/domestic-destination/d-5080269/3-budaya-sumatra-barat-yang-diperkenalkan-ke-gordon-ramsay.\n" +
                        "\n" +
                        "Download Apps Detikcom Sekarang https://apps.detik.com/detik/"
            ),
            Image(
                R.drawable.greet1,
                "Rendang",
                "Rendang menjadi fokus penjelajahan Gordon Ramsay di Sumatera Barat. Ia ditantang William Wongso untuk membuat sajian rendang terbaik yang akan disuguhkan pada gubernur Sumatera Barat.\n" +
                        "\n" +
                        "Baca artikel detikTravel, \"3 Budaya Sumatra Barat yang Diperkenalkan ke Gordon Ramsay\" selengkapnya https://travel.detik.com/domestic-destination/d-5080269/3-budaya-sumatra-barat-yang-diperkenalkan-ke-gordon-ramsay.\n" +
                        "\n" +
                        "Download Apps Detikcom Sekarang https://apps.detik.com/detik/"
            ),
            Image(
                R.drawable.greet1,
                "Makan Bajamba",
                "Orang Sumatera Barat terbiasa makan beramai-ramai dengan aneka lauk dan santapan. Tradisi makan besar itu pun dikenal dengan istilah makan Bajamba. Tradisi makan besar ini pun juga diikuti oleh Ramsay"
            ),
            Image(
                R.drawable.greet1,
                "Sumatera Image",
                "Test Image Description"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_sumatera)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this,imageList){
            val intent = Intent(this, DetailSumateraActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)
        }
    }
}