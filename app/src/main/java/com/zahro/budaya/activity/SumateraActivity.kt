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
                "Sumatera Image",
                "Test Image Description"
            ),
            Image(
                R.drawable.greet1,
                "Sumatera Image",
                "Test Image Description"
            ),
            Image(
                R.drawable.greet1,
                "Sumatera Image",
                "Test Image Description"
            ),
            Image(
                R.drawable.greet1,
                "Sumatera Image",
                "Test Image Description"
            ),
            Image(
                R.drawable.greet1,
                "Sumatera Image",
                "Test Image Description"
            ),
            Image(
                R.drawable.greet1,
                "Sumatera Image",
                "Test Image Description"
            ),
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