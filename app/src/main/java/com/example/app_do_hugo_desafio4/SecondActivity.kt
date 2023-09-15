package com.example.app_do_hugo_desafio4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        var button: Button = findViewById(R.id.button2)
        var text: TextView = findViewById(R.id.textView4)
        var text2: TextView = findViewById(R.id.textView7)
        var text3: TextView = findViewById(R.id.textView8)
        var text4: TextView = findViewById(R.id.textView9)

        var extras:Bundle? = intent.extras


        if(extras != null){
            text.setText("Nome: ${extras.getString("usermane")}")
            text2.setText("Telefone: ${extras.getString("telefone")}")
            text3.setText("Data de Nascimento: ${extras.getString("data")}")
            text4.setText("Senha: ${extras.getString("senha")}")
        }


        button.setOnClickListener{
            finish()
        }
    }
}