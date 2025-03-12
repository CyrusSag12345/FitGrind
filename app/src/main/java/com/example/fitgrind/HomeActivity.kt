package com.example.fitgrind

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fitgrind.adapters.HomeMenuItemAdapter
import com.example.fitgrind.models.HomeMenuItem

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val homeMenuItemList = listOf(
            HomeMenuItem("Lose Weight", "Cardio Exercises", R.drawable.img_cardio),
            HomeMenuItem("Gain Muscle", "Muscle Gain Exercise", R.drawable.img_gain_muscle),
            HomeMenuItem("Manage Food Diet", "Diet Management", R.drawable.img_diet),
            HomeMenuItem("Sports", "Sports Challenges", R.drawable.img_sports)
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = HomeMenuItemAdapter(homeMenuItemList) { clickedItem ->
            when (clickedItem.subtitle) {
                "Cardio Exercises" -> startActivity(Intent(this, CardioExercisesActivity::class.java))
                "Muscle Gain Exercise" -> startActivity(Intent(this, MuscleGainExercisesActivity::class.java))
                "Diet Management" -> startActivity(Intent(this, DietManagementActivity::class.java))
                "Sports Challenges" -> startActivity(Intent(this, SportChallengesActivity::class.java))
            }
        }
    }
}
