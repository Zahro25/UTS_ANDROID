package com.zahro.budaya.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zahro.budaya.R
import com.zahro.budaya.activity.detail.DetailKalimantanActivity
import com.zahro.budaya.activity.detail.DetailPapuaActivity
import com.zahro.budaya.adapter.ImageAdapter
import com.zahro.budaya.model.Image

class PapuaActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_papua)
        val imageList = listOf(
            Image(
                R.drawable.greet1,
                "Tradisi Iki Palek",
                "Apakah kamu pernah membayangkan jika jarimu dengan sengaja dipotong? Di Papua, terdapat sebuah tradisi yang dapat dikatakan ekstrem yang biasa disebut Iki Palek atau tradisi memotong jari. Tradisi ini dilakukan oleh para anggota Suku Dani.Meskipun bagi kebanyakan orang terdengar menyeramkan, tradisi ini mempunyai makna dan filosofi yang dalam bagi para anggota Suku Dani. Tradisi ini dilakukan untuk menunjukkan rasa setia dan rasa kehilangan yang mendalam terhadap anggota keluarga yang baru saja meninggal."
            ),
            Image(
                R.drawable.greet1,
                "Tradisi Mumi Papua",
                "Jika berbicara tentang mumi, pastinya daerah pertama yang kita ingat adalah Mesir. Namun, siapa sangka jika beberapa suku di Papua juga mempunyai tradisi mengawetkan jenazah. Tradisi ini dilakukan oleh beberapa suku seperti Suku Moni, Suku Yali, Suku Mee, dan Suku Dani.Memang, tidak semua anggota suku di setiap wilayah menerapkan tradisi ini karena tradisi ini hanya dilestarikan di beberapa daerah tertentu. Salah satu hal yang menarik dari tradisi ini ialah jenazah yang dijadikan mumi bukanlah orang sembarangan, melainkan seseorang yang sangat berjasa bagi suku mereka. "
            ),
            Image(
                R.drawable.greet1,
                "Tradisi Ararem",
                "Suku Biak di Papua mempunyai sebuah tradisi yang menarik untuk mengantar mas kawin atau Ararem dari calon suami kepada keluarga calon istri. Dalam tradisi ini, keluarga laki-laki yang ditemani iringan Tarian Wor akan membawa peralatan rumah tangga, piring adat, dan makanan ke rumah keluarga calon istri. Tradisi ini masih dapat kamu temukan hingga saat ini. "
            ),
            Image(
                R.drawable.greet1,
                "Tifa Darah",
                "Seperti yang kita ketahui bahwa tifa merupakan salah satu alat musik tradisional masyarakat Papua. Kulit alat musik ini cukup menarik karena terbuat dari kulit biawak. Namun, apakah kamu tahu bahan yang dilakukan untuk menempelkan kulit ke ujung gendang kayu?.Untuk menempelkan kulit ke ujung gendang kayu, Suku Kamora memakai darah mereka sendiri yang berasal dari kucuran darah di bagian paha. Mereka biasanya menggunakan silet untuk membuat luka di paha mereka."
            ),
            Image(
                R.drawable.greet1,
                "Tradisi Barapen",
                "Masyarakat di beberapa wilayah Wamena mempunyai tradisi yang cukup unik yang biasa disebut Barapen atau bakar batu. Barapen ialah sebuah tradisi masak bersama dengan seluruh warga kampung dengan menggunakan batu yang dibakar hingga membara sebagai alat masak utama.Tradisi ini biasanya dipimpin oleh kepala suku yang menggunakan pakaian adat dan berkeliling untuk mengundang para anggota kampungnya. Kemudian, setelah berkumpul, para warga kampung berburu hewan di hutan atau sekitar kampung mereka untuk dijadikan bahan makanan utama. Lalu, beberapa masyarakat menerima hewan tersebut untuk dimasak dan sebagian lainnya manata baru untuk disiapkan menjadi bara dan melakukan tarian khas mereka."
            ),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_papua)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this,imageList){
            val intent = Intent(this, DetailPapuaActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)
        }
    }
}