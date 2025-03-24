package com.example.fitgrind

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DietManagementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diet_management)

        findViewById<Button>(R.id.btnCalesthenics).setOnClickListener {
            startActivity(Intent(this, CalisthenicsActivity::class.java))
        }

        findViewById<Button>(R.id.btnBodyBuilding).setOnClickListener {
            startActivity(Intent(this, BodyBuildingActivity::class.java))
        }
    }
}
