package com.example.manuel.cursokotlinandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TextWatcher {
    override fun afterTextChanged(p0: Editable?) {

    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        name = editName?.text.toString()
        age = editAge?.text.toString()
        if(name != "") textName?.text = name
        if(age != "") textAge?.text = age

        //Toast.makeText(this, p0.toString(), Toast.LENGTH_SHORT).show()
    }

    private var editName: EditText? = null
    private var editAge: EditText? = null
    private var textName: TextView? = null
    private var textAge: TextView? = null

    private var name: String? = null
    private var age: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editName = findViewById(R.id.editText_Name)
        editAge = findViewById(R.id.editText_Age)
        textName = findViewById(R.id.textView_Name)
        textAge = findViewById(R.id.textView_Age)

        editName!!.addTextChangedListener(this)
        editAge!!.addTextChangedListener(this)
    }
}
