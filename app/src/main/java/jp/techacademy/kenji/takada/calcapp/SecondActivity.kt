package jp.techacademy.kenji.takada.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

//見た目　部　import
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//      1値のみの　結果をもらう
        val value_a:Double = intent.getDoubleExtra("VALUE_A", 0.0)

        result.text = "${value_a}"
    }
}
//Class END

