package jp.techacademy.takuya.calcapp
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (!editText1.text.toString().isEmpty() && !editText2.text.toString().isEmpty()) {
            val intent = Intent(this, SecondActivity::class.java)
            val a = editText1.text.toString().toDouble()
            val b = editText2.text.toString().toDouble()
            if (v.id == R.id.button1) {
                intent.putExtra("VALUE1", a+b)
                startActivity(intent)
            }
            else if (v.id == R.id.button2) {
                intent.putExtra("VALUE1", a-b)
                startActivity(intent)
            }
            else if (v.id == R.id.button3) {
                intent.putExtra("VALUE1", a*b)
                startActivity(intent)
            }
            else if (v.id == R.id.button4) {
                intent.putExtra("VALUE1", a/b)
                startActivity(intent)
            }
        }
    }

}

