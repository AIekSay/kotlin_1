package com.example.first

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setView()
    }
    private fun setView(){
        textView2.text=intent.getStringExtra("Question")
    }
    fun sendAnswer(view: View){
        val data = Intent().apply {
            putExtra("Answer", editText2.text.toString())
        }


        setResult(Activity.RESULT_OK,data)
        finish()
    }
}
