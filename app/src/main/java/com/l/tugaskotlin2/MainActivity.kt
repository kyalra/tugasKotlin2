package com.l.tugaskotlin2

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fb=findViewById(R.id.fb)as ImageView
        val ig=findViewById(R.id.ig)as ImageView
        val twt=findViewById(R.id.twt)as ImageView
        val gth=findViewById(R.id.gth)as ImageView


        fb.setOnClickListener {
            val fb=Intent(android.content.Intent.ACTION_VIEW)
            fb.data= Uri.parse("https://facebook.com/rials26")
            startActivity(fb)
        }
        ig.setOnClickListener {
            val ig=Intent(android.content.Intent.ACTION_VIEW)
            ig.data= Uri.parse("https://instagram.com/kyalra")
            startActivity(ig)
        }
        twt.setOnClickListener {
            val twt=Intent(android.content.Intent.ACTION_VIEW)
            twt.data= Uri.parse("https://tweter.com/")
            startActivity(twt)
        }
        gth.setOnClickListener {
            val gth=Intent(android.content.Intent.ACTION_VIEW)
            gth.data= Uri.parse("https://github.com/rialsq")
            startActivity(gth)
        }


    }
}
