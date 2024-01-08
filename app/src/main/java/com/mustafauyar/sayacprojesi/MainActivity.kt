package com.mustafauyar.sayacprojesi
import com.mustafauyar.sayacprojesi.databinding.ActivityMainBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // abstrack class yani soyut sınıf
        object :CountDownTimer(15*1000,1*1000){
            override fun onTick(millisUntilFinished: Long) {
                val zaman = millisUntilFinished/1000
                binding.sayacTextView.text = "kalan süre : $zaman"
            }

            override fun onFinish() {
                binding.sayacTextView.text = "süre bitti"
            }

        }.start()

    }
}