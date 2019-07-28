package com.nestorcalvo.calculadora


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var operator1:String = ""
    private var operator2:String = ""
    private var operation:String = ""
    private var flag:Int = 0

    private var result_flag = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvResult.text = ""
    }


    @SuppressLint("SetTextI18n")
    fun calculate(view: View){
        if (view is Button){
            when(view.id){
                R.id.bn_number->{
                    if (result_flag==1){
                        tvResult.text = ""
                        result_flag=0
                        flag=0
                    }

                    tvResult.text = tvResult.text.toString() + view.text.toString()}
                R.id.bn_plus->{
                    operation = "+"
                    if (flag==1){
                        tvResult.text = operator1 + view.text.toString()
                    }
                    else{
                        operator1 = tvResult.text.toString()
                        tvResult.text = operator1 + view.text.toString()
                        flag = 1
                    }
                }

                R.id.bn_minus->{
                    operation = "-"
                    if (flag==1){
                        tvResult.text = operator1 + view.text.toString()
                    }
                    else{
                        operator1 = tvResult.text.toString()
                        tvResult.text = operator1 + view.text.toString()
                        flag = 1
                    }
                }
                R.id.bn_times->{
                    operation = "X"
                    if (flag==1){
                        tvResult.text = operator1 + view.text.toString()
                    }
                    else{
                        operator1 = tvResult.text.toString()
                        tvResult.text = operator1 + view.text.toString()
                        flag = 1
                    }
                }
                R.id.bn_divide->{
                    operation = "/"
                    if (flag==1){
                        tvResult.text = operator1 + view.text.toString()
                    }
                    else{
                        operator1 = tvResult.text.toString()
                        tvResult.text = operator1 + view.text.toString()
                        flag = 1
                    }
                }
                R.id.bn_dot->{
                    if(result_flag ==1){
                        tvResult.text = ""
                        result_flag=0
                    }
                    tvResult.text = tvResult.text.toString() + "."


                }
                R.id.bn_equal->{
                    operator2= tvResult.text.toString().replace(operator1+operation, "", ignoreCase = true)
                    when (operation) {
                        "+" -> tvResult.text =(operator1.toDouble() + operator2.toDouble()).toString()
                        "-" -> tvResult.text =(operator1.toDouble() - operator2.toDouble()).toString()
                        "X" -> tvResult.text =(operator1.toDouble() * operator2.toDouble()).toString()
                        "/" -> {
                            if (operator2.toDouble() == 0.0){
                                tvResult.text = "NaN"
                            }
                            else{
                                tvResult.text =(operator1.toDouble() / operator2.toDouble()).toString()
                            }

                        }
                    }
                    operation = ""
                    operator1 = ""
                    operator2 = ""
                    result_flag = 1
                }
                R.id.bn_delete->{
                    tvResult.text = ""
                    operator2 = ""
                    operation = ""
                    operator1 = ""
                    flag = 0
                    result_flag = 0
                }


            }
        }
    }

}


