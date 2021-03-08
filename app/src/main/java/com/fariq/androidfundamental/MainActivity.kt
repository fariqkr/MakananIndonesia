package com.fariq.androidfundamental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnCreateContextMenuListener {

    private var list = ArrayList<Food>()
    private var favoriteList = ArrayList<Food>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getActionBar()?.setDisplayHomeAsUpEnabled(true)

        rv_data.setHasFixedSize(true)
        list.addAll(FoodData.listData)
        rv_data.layoutManager = LinearLayoutManager(this)
        val adapter = FoodAdapter(list)
        rv_data.adapter = adapter


        adapter.setOnItemClickCallback(object : FoodAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Food) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("food", data)
                startActivity(intent)
            }
        })
        adapter.setOnItemFavoriteClickCallback(object : FoodAdapter.OnItemFavoriteClickCallBack {
            override fun onItemFavoriteClicked(data: Food) {
                Toast.makeText(applicationContext,
                        "${data.name} berhasil ditambahkan ke favorite",
                        Toast.LENGTH_SHORT).show()

                if (!favoriteList.contains(data)) favoriteList.add(data)

            }
        })

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.about -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
                return true
            }
            R.id.favorite -> {
                val moveIntent = Intent(this@MainActivity, FavoriteActivity::class.java)
                moveIntent.putExtra("fav_list", favoriteList)
                startActivity(moveIntent)
                return true
            }
            else -> return super.onOptionsItemSelected(item)

        }
    }


}