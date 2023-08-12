package com.myapp.catatuang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapp.catatuang.databinding.ActivityWelcomepageBinding

class welcomepage : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomepageBinding
    override fun onCreate(savedInstanceState: Bundle?) {super.onCreate(savedInstanceState)
        binding = ActivityWelcomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
            finish()
        }
    }
}