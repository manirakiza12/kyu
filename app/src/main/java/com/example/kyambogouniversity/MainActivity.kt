package com.example.kyambogouniversity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loggs=findViewById<ImageView>(R.id.imageView2)
        val kyambogos=findViewById<TextView>(R.id.textView3)
        val verso=findViewById<TextView>(R.id.textView2)

        val topAnim=AnimationUtils.loadAnimation(this,R.anim.top)
        val bottomanim=AnimationUtils.loadAnimation(this,R.anim.bottom)

        loggs.startAnimation(bottomanim)
        kyambogos.startAnimation(topAnim)
        verso.startAnimation(topAnim)
        Handler().postDelayed({
            val into=Intent(this,homekyambogo::class.java)
            startActivity(into)
            finish()
        },4000)
    }
}