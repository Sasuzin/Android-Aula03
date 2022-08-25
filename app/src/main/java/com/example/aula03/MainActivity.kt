package com.example.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Tipo de Binding 1 - findViewById
        val editValor1: EditText = findViewById(R.id.editValor1)
        val editValor2: EditText = findViewById(R.id.editValor2)
        val buttonSomar: Button = findViewById(R.id.buttonSomar)
        val buttonSubtrair: Button = findViewById(R.id.buttonSubtrair)
        val buttonDividir: Button = findViewById(R.id.buttonDividir)
        val buttonMultiplicar: Button = findViewById(R.id.buttonMultiplicar)

        buttonSomar.setOnClickListener {
            var valor1 = editValor1.text.toString().toInt()
            var valor2 = editValor2.text.toString().toInt()

            var resultado = valor1 + valor2

            showDialog(  "A soma é " + resultado)
        }
        buttonSubtrair.setOnClickListener {
            var valor1 = editValor1.text.toString().toInt()
            var valor2 = editValor2.text.toString().toInt()

            var resultado = valor1 - valor2

            showDialog(  "A subtracao é " + resultado)
        }
        buttonDividir.setOnClickListener {
            var valor1 = editValor1.text.toString().toInt()
            var valor2 = editValor2.text.toString().toInt()

            var resultado = valor1 / valor2

            showDialog(  "A Divisao é " + resultado)
        }
        buttonMultiplicar.setOnClickListener {
            var valor1 = editValor1.text.toString().toInt()
            var valor2 = editValor2.text.toString().toInt()

            var resultado = valor1 * valor2

            showDialog(  "A Multiplicacao é " + resultado)
        }


    }
        fun showDialog(msg: String) {
            val builder = AlertDialog.Builder(this)
            builder.setMessage(msg)
            builder.setPositiveButton("OK",null)
            val dialog = builder.create()
            dialog.show()
        }
}