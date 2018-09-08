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

        var cadena = "MKJUO"
        var entero = 0
        /*var doble: Double = 5.0
        var valor: Boolean = true
        var char: Char = 'k'
        var f: Float = 5.2f*/

        if(false){
            entero = 5*5
        }else{
            cadena = "no tiene permiso"
        }

        val d = null ?: 4 //El operador elvis ?: evalua si al lado izquierdo, la epresión devuelve un null asignando a la variable el valor que se encuentra al lado derecho en este caso se asignara 4 ya que se tiene null al lado izquierdo en caso contrario se asignara a la variable el valor resultado de la expresión al lado izquierdo del operador elvis
        val e = cadena.length ?: 4 //En este caso a la variable e se le asignara el valor de 5 ya que la expresión a su lado izquierdo no es null y cadena.length devuelve 5
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
