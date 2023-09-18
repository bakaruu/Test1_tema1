package com.example.test1_tema1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val checkbox1 = findViewById<CheckBox>(R.id.checkBox1);
        val checkbox2 = findViewById<CheckBox>(R.id.checkBox2);

        checkbox1.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked){
                checkbox2.isChecked = false;
                checkbox2.isEnabled = true;

            }else{
                checkbox2.isEnabled = true;

            }
        }

        checkbox2.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked){
                checkbox1.isChecked = false;
                checkbox1.isEnabled = true;

            }else{
                checkbox1.isEnabled = true;

            }
        }

    }
}