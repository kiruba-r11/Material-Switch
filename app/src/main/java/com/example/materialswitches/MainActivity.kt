package com.example.materialswitches

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.switchmaterial.SwitchMaterial
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switchMaterial.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(this , "$isChecked", Toast.LENGTH_SHORT).show()
        }

    }
}