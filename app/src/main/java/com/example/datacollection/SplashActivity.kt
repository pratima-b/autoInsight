package com.example.datacollection

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

@Suppress("DEPRECATION")
@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private lateinit var topAnim: Animation
    private lateinit var bottomAnim: Animation
    private lateinit var splashLogo: ImageView
    private lateinit var appName: TextView
    private var splashScreen: Int = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)

        topAnim=AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnim=AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        splashLogo = this.findViewById(R.id.splashLogo)
        appName = this.findViewById(R.id.appName)

        splashLogo.animation = topAnim
        appName.animation = bottomAnim

        val r = Runnable {
            val intent= Intent(this,PersonalActivity::class.java).apply{
            }
            startActivity(intent)
            finish()
        }
        Handler(Looper.getMainLooper()).postDelayed(r, splashScreen.toLong())

    }
}