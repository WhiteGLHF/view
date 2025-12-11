package com.example.viewww

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


const val Login = "admin"
const val Password = "1234"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val login: EditText = findViewById(R.id.editTextText)
        val password: EditText = findViewById(R.id.editTextTextPassword)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            if ((login.text.toString() == Login) and (password.text.toString() == Password)){
                Toast.makeText(applicationContext,"Все так!!",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"Неправда!!",Toast.LENGTH_SHORT).show()
            }
        }
    }
}