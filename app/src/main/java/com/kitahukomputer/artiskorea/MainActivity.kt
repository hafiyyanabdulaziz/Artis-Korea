package com.kitahukomputer.artiskorea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvArtis: RecyclerView
    private var list: ArrayList<Artis> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvArtis = findViewById(R.id.rv_artis)
        rvArtis.setHasFixedSize(true)

        list.addAll(ArtisData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvArtis.layoutManager = LinearLayoutManager(this)
        val listArtisAdapter = ListArtisAdapter(list)
        rvArtis.adapter = listArtisAdapter

        listArtisAdapter.setOnItemClickCallback(object : ListArtisAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Artis) {
                showSelectedArtis(data)
            }
        })
    }

    private fun showSelectedArtis(artis: Artis) {
        val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, artis.name)
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_DETAIL, artis.detail)
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_IMAGE, artis.photo)
        startActivity(moveWithDataIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.about -> {
                val moveIntent = Intent(this@MainActivity, About::class.java)
                startActivity(moveIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
