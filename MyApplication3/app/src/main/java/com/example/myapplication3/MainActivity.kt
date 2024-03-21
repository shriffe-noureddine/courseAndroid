package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.R
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_layout_id)

        val button: Button = findViewById(R.id.label)
        button.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                // Code here executes on main thread after user presses button
            }
        });
    }
}