package jp.techacademy.takuya.calcapp
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second_calc_app_main2.*
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_calc_app_main2)
        val value1 = intent.getDoubleExtra("VALUE1", 0.0)
        textView.text = "${value1}"
    }}

