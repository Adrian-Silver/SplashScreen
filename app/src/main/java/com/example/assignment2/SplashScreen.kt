package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import java.lang.Exception

class SplashScreen : AppCompatActivity() {

    internal val TIME_OUT = 2000


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

//        val background = object : Thread(){
//            override fun run() {
//                try{
//                    Thread.sleep(3000)
//                    val intent = Intent(baseContext, MainActivity::class.java)
//
//                    startActivity(intent)
//                }catch (e:Exception){
//                    e.printStackTrace()
//                }
//            }
//        }.start()
////        background.start()


        Handler().postDelayed(
            {
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            },TIME_OUT.toLong())


    }
}
