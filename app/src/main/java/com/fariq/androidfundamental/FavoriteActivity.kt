package com.fariq.androidfundamental

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_favorite.*
import kotlinx.android.synthetic.main.activity_main.*

class FavoriteActivity : AppCompatActivity() {

    var list = ArrayList<Food>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        val actionbar = supportActionBar
        actionbar!!.title = "Favorite"
        actionbar.setDisplayHomeAsUpEnabled(true)

        var data = intent.getParcelableArrayListExtra<Food>("fav_list")
        if (data != null){
            data.forEach { food ->
                if (!list.contains(food)) list.add(food)
            }
        }

        rv_favorite.setHasFixedSize(true)
        rv_favorite.layoutManager = LinearLayoutManager(this)
        val adapter = FoodAdapter(list)
        rv_favorite.adapter = adapter

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}