package com.zahro.budaya.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zahro.budaya.R
import com.zahro.budaya.activity.detail.DetailJawaActivity
import com.zahro.budaya.activity.detail.DetailKalimantanActivity
import com.zahro.budaya.adapter.ImageAdapter
import com.zahro.budaya.model.Image

class KalimantanActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalimantan)
        val imageList = listOf(
            Image(
                R.drawable.greet1,
                "Tari Gandut",
                "Tarian tradisional Kalimantan Selatan yang pertama adalah Tari Gandut atau Bagandut. Tari ini juga disebut hampir mirip dengan Tari Ronggeng dari Sumatera dan Tari Tayub dari Jawa.Tarian khas Kalimantan Selatan ini, awalnya populer hanya di lingkungan istana. Namun, akhirnya tarian ini pun juga mulai populer di kalangan masyarakat biasa, sekitar 1860-an."
            ),
            Image(
                R.drawable.greet1,
                "Gamelan Banjar",
                "Alat musik tradisional khas Kalimantan Selatan yang pertama adalah Gamelan Banjar. Ada dua jenis gamelan yang ada di dalam masyarakat Suku Banjar, yakni versi keraton dan versi kerakyatan.Gamelan Banjar sendiri sudah ada sejak abad ke-14. Adapun kesenian ini pertama kali diperkenalkan oleh Pangeran Suryanata ke Kalimantan Selatan."
            ),
            Image(
                R.drawable.greet1,
                "Robo Robo",
                "Satu tradisi yang begitu terkenal dari Kalimantan Barat adalah tradisi Robo-robo. Tradisi yang diadakan setiap Rabu terakhir pada bulan Sapar (Hijriah) ini merupakan simbol keberkahan. Menurut cerita yang beredar di masyarakat, tradisi ini merupakan napak tilas kedatangan Pangeran Mas Surya Negara dari Kerajaan Mataram (Martapura) ke Kerajaan Menpawah di Pontianak. Rabo-rabo sendiri dimaksudkan sebagai peringatan serangakaian kejadian penting bermula Haulan pada hari Senin malam Selasa akhir Syafar guna untuk menenang wafatnya Opu Daeng Manambun."
            ),
            Image(
                R.drawable.greet1,
                "Rumah Panjang",
                "Salah satu kebudayaan Kalimantan Barat yang akan langsung terlihat ketika Anda berkunjung ke wilayah ini adalah rumah adatnya. Dimana bentuk dari rumah adat Kalimantan Barat ini disebut dengan Istana Kesultanan Pontianak yang berbentuk rumah panggung. Berbeda dengan rumah panggung lain yang umumnya pada bagian kolong rumah akan dimanfaatkan sebagai kandang hewan ternak, pada rumah adat Kalimantan Barat ini bagian kolong tidak akan dipergunakan sebab jenis tanahnya adalah rawa."
            ),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_kalimantan)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this,imageList){
            val intent = Intent(this, DetailKalimantanActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)
        }
    }
}