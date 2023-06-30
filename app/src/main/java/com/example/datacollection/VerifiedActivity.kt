package com.example.datacollection

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.datacollection.PersonalActivity.Companion.a
import com.example.datacollection.PersonalActivity.Companion.b
import com.example.datacollection.PersonalActivity.Companion.c
import com.example.datacollection.PersonalActivity.Companion.d
import com.example.datacollection.PersonalActivity.Companion.e
import com.example.datacollection.PersonalActivity.Companion.f
import com.example.datacollection.PersonalActivity.Companion.g
import com.example.datacollection.PersonalActivity.Companion.h
import com.example.datacollection.PersonalActivity.Companion.i
import com.example.datacollection.PersonalActivity.Companion.j
import com.example.datacollection.PersonalActivity.Companion.k
import com.example.datacollection.PersonalActivity.Companion.l
import com.hbb20.CountryCodePicker

class VerifiedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verified)


        val dbHelper = DBHelper(applicationContext)

        dbHelper.addData(
            j.text.toString(),
            a.text.toString(),
            b.text.toString(),
            c.text.toString(),
            d.text.toString(),
            e.text.toString(),
            f.text.toString(),
            g.text.toString(),
            h.text.toString(),
            i.text.toString(),
            k.text.toString()
        )

        val mainScreenButton = this.findViewById<Button>(R.id.mainScreenButton)
        mainScreenButton.setOnClickListener {
            val intent = Intent(this, PersonalActivity::class.java).apply {
            }
            startActivity(intent)
        }

    }
}