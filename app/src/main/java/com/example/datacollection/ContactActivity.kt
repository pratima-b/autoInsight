package com.example.datacollection

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.datacollection.PersonalActivity.Companion.j
import com.example.datacollection.PersonalActivity.Companion.k
import com.example.datacollection.PersonalActivity.Companion.l
import com.hbb20.CountryCodePicker


class ContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        var ccp: CountryCodePicker = this.findViewById(R.id.countryCodeHolder)
        j = this.findViewById<EditText>(R.id.mobile)
        k = this.findViewById<EditText>(R.id.email)

        ccp.registerCarrierNumberEditText(j)

        val backButton = this.findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            val intent= Intent(this,CarActivity::class.java).apply {
            }
            startActivity(intent)
        }

        val nextButton = this.findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
                val intent = Intent(this, VerifiedActivity::class.java).apply {
                }
                startActivity(intent)
        }
    }
}