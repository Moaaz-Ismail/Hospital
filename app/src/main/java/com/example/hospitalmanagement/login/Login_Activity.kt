package com.example.hospitalmanagement.login

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.hospitalmanagement.R
import eightbitlab.com.blurview.BlurView
import eightbitlab.com.blurview.RenderScriptBlur


class login_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_)
      var frame : FrameLayout = findViewById(R.id.frame)
        frame.setBackgroundColor(Color.argb(100,0,0,170))
        val blurView : BlurView  =findViewById(R.id.blurView)
        val radius = 1f
        val decorView: View = window.decorView
        val windowBackground: Drawable = decorView.getBackground()
        blurView.setupWith(decorView.findViewById(android.R.id.content))
                .setFrameClearDrawable(windowBackground)
                .setBlurAlgorithm(RenderScriptBlur(this))
                .setBlurRadius(radius)
                .setBlurAutoUpdate(true)
                .setHasFixedTransformationMatrix(true)
    }
}