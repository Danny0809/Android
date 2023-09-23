package com.chobo.a_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var timerTask: Timer? = null
        var sec : Int = 0
        var isRunning = false
        val tv : TextView = findViewById(R.id.tv_hello)
        val btn : Button = findViewById(R.id.btn_call)

        btn.setOnClickListener{
            val random_box = Random()
            val num = random_box.nextInt(10) + 1
            tv.text = ((num.toFloat())/100).tofloat()
        }


//        btn.setOnClickListener{
//            isRunning = !isRunning
//
//            if(isRunning == true) {
//                btn.text = "중지"
//                timerTask = kotlin.concurrent.timer(period = 10) {
//                    sec++
//                    runOnUiThread {
//                        tv.text = (sec.toFloat()/100).toString()
//                    }
//                }
//            }
//            else {
//                btn.text = "시작"
//                timerTask?.cancel();
//            }
//        }







//        val tv: TextView = findViewById(R.id.tv_hello) // tv라는 밸류를 만들고 이는 id가 tv_hello인 텍스트를 가리킨다.
//        val btn: Button = findViewById(R.id.btn_call) // 위 텍스트의 버튼버전
//
//        btn.setOnClickListener {//버튼 리스너
//            if(tv.text == "안녕"){
//                tv.text = "hello"
//            }
//            else if(tv.text == "hello"){
//                tv.text = "안녕"
//            }
//        }

//        val textView: TextView = findViewById(R.id.android_text) as TextView
//        textView.setOnClickListener {
//            textView.text = getString(R.string.name)
//        }
    }
}