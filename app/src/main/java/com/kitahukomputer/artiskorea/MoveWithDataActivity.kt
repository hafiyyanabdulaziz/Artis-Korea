package com.kitahukomputer.artiskorea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class MoveWithDataActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_IMAGE = "extra_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        val tvDataImage: ImageView = findViewById(R.id.tv_data_image)
        val tvDataName: TextView = findViewById(R.id.tv_data_name)
        val tvDataDetail: TextView = findViewById(R.id.tv_data_detail)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val image = intent.getIntExtra(EXTRA_IMAGE, 0)

        tvDataName.text = name
        tvDataDetail.text = detail

        Glide.with(this)
            .load(image).into(tvDataImage)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = name
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    //menu about
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.about -> {
                val moveIntent = Intent(this@MoveWithDataActivity, About::class.java)
                startActivity(moveIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    //fungsi back
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
