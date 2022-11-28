package com.sunit.pigeonholeprinciple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun findPplusOne(view: View) {

        var n = findViewById<EditText>(R.id.n1).text.toString().toInt()
        var m = findViewById<EditText>(R.id.m1).text.toString().toInt()

        var p = (n-1)/m
        p += 1


        var result = findViewById<TextView>(R.id.r1);

        var pString = p.toString();

        result.text = "Result: " + pString;


    }
    fun findPplusN(view: View) {
        var p = findViewById<EditText>(R.id.p2).text.toString().toInt()
        var m = findViewById<EditText>(R.id.m2).text.toString().toInt()

        var n: Int = (p -1) * m;
        n += 1


        var result = findViewById<TextView>(R.id.r2);


        result.text = "Result: " + n.toString();

    }
    fun findPplusM(view: View) {
        var p = findViewById<EditText>(R.id.p3).text.toString().toInt()
        var n = findViewById<EditText>(R.id.n3).text.toString().toInt()

        var m: Int = (n - 1)/(p - 1)  ;
        n += 1


        var result = findViewById<TextView>(R.id.r3);


        result.text = "Result: " + m.toString();

    }
}