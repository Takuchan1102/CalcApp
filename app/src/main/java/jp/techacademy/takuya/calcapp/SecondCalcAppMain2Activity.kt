package jp.techacademy.takuya.calcapp
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second_calc_app_main2.*
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_calc_app_main2)
        val value1 = intent.getIntExtra("VALUE1",0)
        textView.text = "${value1}"
    }
}

