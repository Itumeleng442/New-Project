package com.example.dietapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etSurname = findViewById<EditText>(R.id.etSurname).text
        val etEmailAddress = findViewById<EditText>(R.id.etEmailAddress).text
        val etPhoneNumber = findViewById<EditText>(R.id.etPhoneNumber).text
        val etDay = findViewById<EditText>(R.id.etDay).text

        val btnDisplay = findViewById<Button>(R.id.bntDisplay)

        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnDisplay.setOnClickListener {

            var message: String = ""
//
//            if (etDay.toString().equals("Monday")) {
//                message = "for ${etDay.toString()} : Grilled chicken with quinoa salad"
//            } else if (etDay.toString().equals("Tuesday")) {
//                message = "for ${etDay.toString()} : Salmon with steamed vegetables"
//            } else if (etDay.toString().equals("Wednesday")) {
//                message = "for ${etDay.toString()} : Vegetables stir-fry with tofu"
//            } else if (etDay.toString().equals("Thursaday")) {
//                message = "for ${etDay.toString()} : Turkey and avocado wrap"
//            } else if (etDay.toString().equals("Friday")) {
//                message = "for ${etDay.toString()} : Grilled fish tacos with salsa"
//            } else if (etDay.toString().equals("Saturday")) {
//                message = "for ${etDay.toString()} : Grilled fish tacos with salsa"
//            } else if (etDay.toString().equals("Sunday")) {
//                message =
//                    "for ${etDay.toString()} : Seven Colours "
//            } else {
//                message = "Invalid day"
//            }

            when (etDay.toString()){
                "Monday"-> message = "for ${etDay.toString()} : Grilled chicken with quinoa salad"
                "Tuesday"-> message = "for ${etDay.toString()} :Salmon with steamed vegetables "
                "Wednesda"-> message = "for ${etDay.toString()} : Vegetables stir-fry with tofu"
                "Thursaday"-> message = "for ${etDay.toString()} : Turkey and avocado wrap"
                "Friday"-> message = "for ${etDay.toString()} : Grilled fish tacos with salsa"
                "Saturday"-> message = "for ${etDay.toString()} :Grilled fish tacos with salsa "
                "Sunday"-> message = "for ${etDay.toString()} : Seven Colours"

                else ->  message = "Invalid day"
            }



            tvResult.text = "Hi ${etSurname}, ${message} \n" +
                    "Your Preference will be emailed to ${etEmailAddress}\n" +
                    "Our dietition will contact on ${etPhoneNumber}"

        }

    }
}