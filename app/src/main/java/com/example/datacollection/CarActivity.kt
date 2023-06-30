package com.example.datacollection

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.datacollection.PersonalActivity.Companion.g
import com.example.datacollection.PersonalActivity.Companion.h
import com.example.datacollection.PersonalActivity.Companion.i


class CarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car)

        g = this.findViewById<EditText>(R.id.manf)
        h = this.findViewById<EditText>(R.id.model)
        i = this.findViewById<EditText>(R.id.manfYear)

        val nextButton = this.findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            val intent = Intent(this, ContactActivity::class.java).apply {
            }
            startActivity(intent)
        }

        val backButton = this.findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this, PersonalActivity::class.java).apply {
            }
            startActivity(intent)
        }
    }
}
