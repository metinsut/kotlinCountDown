package com.metin.kotlincountdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        object : CountDownTimer(5000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                textView.text = "Left: ${millisUntilFinished / 1000}"
            }
            override fun onFinish() {
                textView.text = "Left: 0"
            }
        }.start()
    }
}