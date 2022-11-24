package com.example.abntvpassio945fm.ui.SplashScreen

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.example.abntvpassio945fm.OnBoardingScreenScreen.MainActivity2
import com.example.abntvpassio945fm.R

public const val SPLASH_TIME=4000L
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logoimage=findViewById<ImageView>(R.id.Abnlogo)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        Handler(Looper.myLooper()!!).postDelayed(
            {
                 val intent= Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish()
            }, SPLASH_TIME
        )
//        val fadeAnim=AnimationUtils.loadAnimation(this,R.anim.fade_in_animation)
//        logoimage.animation=fadeAnim
    }
}