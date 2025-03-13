package com.example.fitgrind

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class CardioExercisesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardio_exercises)


        // Button stuff
        val btnBack: ImageButton = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        val btnJoggingReadMore: Button = findViewById(R.id.btnJoggingReadMore)
        btnJoggingReadMore.setOnClickListener {

        }

        val btnJumpingJacksReadMore: Button = findViewById(R.id.btnJumpingJacksReadMore)
        btnJumpingJacksReadMore.setOnClickListener {

        }

        val btnJumpRopeReadMore: Button = findViewById(R.id.btnJumpRopeReadMore)
        btnJumpRopeReadMore.setOnClickListener {

        }

        val btnCyclingReadMore: Button = findViewById(R.id.btnCyclingReadMore)
        btnCyclingReadMore.setOnClickListener {

        }

    }
}