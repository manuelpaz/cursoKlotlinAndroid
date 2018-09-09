package com.example.manuel.cursokotlinandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TextWatcher, View.OnClickListener {
    override fun onClick(p0: View?) {
        operacion()
    }

    override fun afterTextChanged(p0: Editable?) {

    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
       //Toast.makeText(this, p0.toString(), Toast.LENGTH_SHORT).show()
    }

    private fun operacion(){

        var entero = 0
        var valor1 = 7
        var valor2 = 3

        valor1++
        valor1 = valor1.inc() //sobrecarga del operador incremento

        valor1--
        valor1 = valor1.dec() //sobecarga del operador decremento

        /*name = editName?.text.toString()
        age = editAge?.text.toString()
        if(name != "") textName?.text = name
        if(age != "") textAge?.text = age*/
    }

    private var editName: EditText? = null
    private var editAge: EditText? = null
    private var textName: TextView? = null
    private var textAge: TextView? = null
    private var button: Button? = null
    private var name: String? = null
    private var age: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editName = findViewById(R.id.editText_Name)
        editAge = findViewById(R.id.editText_Age)
        textName = findViewById(R.id.textView_Name)
        textAge = findViewById(R.id.textView_Age)
        button = findViewById(R.id.button_Ejecutar)
        button!!.setOnClickListener(this)
        editName!!.addTextChangedListener(this)
        editAge!!.addTextChangedListener(this)
    }
}
