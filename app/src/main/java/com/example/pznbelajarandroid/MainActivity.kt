package com.example.belajarandroiddasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        val nameEditText: EditText=findViewById(R.id.nameEditText)
        val sayButton: Button=findViewById(R.id.sayButton)
        val sayTextView: TextView=findViewById(R.id.sayTextView)

        sayTextView.text="Hallo!"
    }
}