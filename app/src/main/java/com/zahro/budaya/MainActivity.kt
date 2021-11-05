package com.zahro.budaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zahro.budaya.activity.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainButton()
    }

    private fun mainButton(){
        sulawesi.setOnClickListener {
            startActivity(Intent(this,SulawesiActivity::class.java))

        }
        // kegunaan intent adalah untuk bertransisi/berpindah dari activity satu ke activity lain
        kalimantan.setOnClickListener {
            startActivity(Intent(this,KalimantanActivity::class.java))
        }
        jawa.setOnClickListener {
            startActivity(Intent(this,JawaActivity::class.java))
        }
        papua.setOnClickListener {
            startActivity(Intent(this,PapuaActivity::class.java))
        }
        sumatera.setOnClickListener {
            startActivity(Intent(this,SumateraActivity::class.java))
        }
    }
}