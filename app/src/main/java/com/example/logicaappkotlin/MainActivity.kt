package com.example.logicaappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var count = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        submitBtn.setOnClickListener { onClick() }
    }
    private fun onClick() {
        if(inputT.text.toString().equals(getString(R.string.isTrue))) count++
        if(inputF1.text.toString().equals(getString(R.string.isFalse))) count++
        if(inputF2.text.toString().equals(getString(R.string.isFalse))) count++
        if(inputF3.text.toString().equals(getString(R.string.isFalse))) count++
        Toast.makeText(this, getString(R.string.text)+ count, Toast.LENGTH_SHORT).show()
        count =0
    }


}
