package com.fariq.androidfundamental

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail.*
import java.text.NumberFormat
import java.util.*

class DetailActivity : AppCompatActivity() {
    var data = Food()

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val localeID = Locale("in", "ID")
        val formatRupiah: NumberFormat = NumberFormat.getCurrencyInstance(localeID)

        data = intent.getParcelableExtra<Food>("food")!!
        name_detail.text = data.name
        kkal_detail.text = data.kkal.toString() + " Kkal"
        price_detail.text = formatRupiah.format(data.price)
        desc_detail.text = data.desc


        Glide.with(applicationContext)
            .load(data.image)
            .apply(RequestOptions().override(100, 100))
            .into(image_detail)

        val actionbar = supportActionBar
        actionbar!!.title = "Detail Makanan"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}