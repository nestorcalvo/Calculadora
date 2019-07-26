package com.nestorcalvo.calculadora


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvResult.text = ""
    }


    fun calculate(view: View){
        if (view is Button){
            when(view.id){
                R.id.bn_number->
                    tvResult.text = tvResult.text.toString() + bn_number.text.toString()

            }
        }
    }

}


