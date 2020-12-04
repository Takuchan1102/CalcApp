package jp.techacademy.takuya.calcapp
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second_calc_app_main2.*
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_calc_app_main2)
        val value1 = intent.getIntExtra("VALUE1", 0)
        val value2 = intent.getIntExtra("VALUE2", 0)
        textView.text = "${value1 + value2}"
        val value3 = intent.getIntExtra("VALUE3", 0)
        val value4 = intent.getIntExtra("VALUE4", 0)
        textView.text = "${value3 - value4}"
        val value5 = intent.getIntExtra("VALUE5", 0)
        val value6 = intent.getIntExtra("VALUE6", 0)
        textView.text = "${value5 * value6}"
        val value7 = intent.getIntExtra("VALUE7", 0)
        val value8 = intent.getIntExtra("VALUE8", 0)
        textView.text = "${value7 / value8}"
    }}

