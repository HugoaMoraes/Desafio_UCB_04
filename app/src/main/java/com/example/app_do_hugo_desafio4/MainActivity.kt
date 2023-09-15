package com.example.app_do_hugo_desafio4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var userNameEditText: EditText = findViewById(R.id.username)
        var passworldEditText: EditText = findViewById(R.id.senha)
        var telefoneEditText: EditText = findViewById(R.id.telefone)
        var dataEditText: EditText = findViewById(R.id.data)

        var button: Button = findViewById(R.id.button)
        var swtch = findViewById<Switch>(R.id.switch1) as Switch


        button.setOnClickListener{
            var intent: Intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("usermane",userNameEditText.text.toString())
            intent.putExtra("telefone",telefoneEditText.text.toString())
            intent.putExtra("data", dataEditText.text.toString())

            if (swtch.isChecked) {
                intent.putExtra("senha", passworldEditText.text.toString())

            }else{
                intent.putExtra("senha", "******")
            }
            startActivity(intent)
        }

        swtch.setOnClickListener {
            if (swtch.isChecked){
                Toast.makeText(applicationContext,"Sua senha será exibida", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"Sua senha não será exibida", Toast.LENGTH_SHORT).show()
            }
        }
    }
}