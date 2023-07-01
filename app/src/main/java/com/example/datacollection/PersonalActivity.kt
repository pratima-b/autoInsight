package com.example.datacollection

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class PersonalActivity : AppCompatActivity() {

    companion object{
        lateinit var a: EditText
        lateinit var b: EditText
        lateinit var c: EditText
        lateinit var d: EditText
        lateinit var e: EditText
        lateinit var f: EditText
        lateinit var g: EditText
        lateinit var h: EditText
        lateinit var i: EditText
        lateinit var j: EditText
        lateinit var k: EditText
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal)

        a = this.findViewById<EditText>(R.id.firstName)
        b = this.findViewById<EditText>(R.id.lastName)
        c = this.findViewById<EditText>(R.id.houseNo)
        d = this.findViewById<EditText>(R.id.city)
        e = this.findViewById<EditText>(R.id.state)
        f = this.findViewById<EditText>(R.id.pinCode)

        val nextButton = this.findViewById<Button>(R.id.nextButton)

        nextButton.setOnClickListener {
            if (a.text.toString().isEmpty() || b.text.toString().isEmpty() || c.text.toString()
                    .isEmpty() || d.text.toString().isEmpty() || e.text.toString()
                    .isEmpty() || f.text.toString().isEmpty()
            ) {
                Toast.makeText(applicationContext, "Please fill all the mandatory * fields.", Toast.LENGTH_SHORT)
                    .show()
            }
            else {
                val intent = Intent(this, CarActivity::class.java).apply {
                }
                startActivity(intent)
            }
        }
    }
}