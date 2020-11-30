package jp.techacademy.takuya.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import java.text.Format
import android.support.v4.app.SupportActivity
import android.support.v4.app.SupportActivity.ExtraData
import android.support.v4.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity(), View.OnClickListener {
        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
                button1.setOnClickListener (this)
                button2.setOnClickListener (this)
                button3.setOnClickListener (this)
                button4.setOnClickListener (this)
        }
        override fun onClick(v: View) {
                val intent = Intent(this, SecondActivity::class.java)
                val a = editText1.toString().toDouble()
                val b = editText2.toString().toDouble()
                if (v.id == R.id.button1) {
                        intent.putExtra("VALUE",a+b)
                        startActivity(intent)
                } else if (v.id == R.id.button2) {
                        intent.putExtra("VALUE",a-b)
                        startActivity(intent)
                } else if (v.id == R.id.button3) {
                        intent.putExtra("VALUE", a*b)
                        startActivity(intent)
                } else if (v.id == R.id.button4) {
                        intent.putExtra("VALUE",a/b)
                        startActivity(intent)
        }
        }
}


