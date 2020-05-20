package com.kitahukomputer.artiskorea

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_about.*

class About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Hafiyyan Abdul Aziz"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)

        //tombol
        val btnInstagram: Button = findViewById(R.id.btn_instagram)
        btnInstagram.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/hafiyyanabdulaziz/")))
        }
        val btnDicoding: Button = findViewById(R.id.btn_dicoding)
        btnDicoding.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dicoding.com/users/39660")))
        }
        val btnGithub: Button = findViewById(R.id.btn_github)
        btnGithub.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/hafiyyanabdulaziz/")))
        }
    }

    //fungsi back
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
