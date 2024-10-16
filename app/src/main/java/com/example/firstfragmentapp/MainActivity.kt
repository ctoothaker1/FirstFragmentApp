package com.example.firstfragmentapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // use transaction to add second fragment
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainerView2, ColorFragment())
            .commit()
    }
}