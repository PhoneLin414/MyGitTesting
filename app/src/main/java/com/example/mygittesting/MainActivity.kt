package com.example.mygittesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this ,"This is Branch2", Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"This is Branch 1",Toast.LENGTH_SHORT).show()

    }
}
