package jp.techacademy.kenji.takada.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

//追加
import android.view.View

//追加
import kotlinx.android.synthetic.main.activity_main.*

//追加
import android.content.Intent
import android.support.v7.app.AlertDialog


//interfaceを追加している
class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      Bottonごとに処理作成する形態

        button1.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)

            val num1 = (editText1.getText().toString()).toDoubleOrNull()
            val num2 = (editText2.getText().toString()).toDoubleOrNull()

            if (num1 != null && num2  != null) {
                val num_a:Double = num1 + num2
                intent.putExtra("VALUE_A",num_a)
                startActivity(intent)

            }else{
                showAlertDialog()
            }

        }

        button2.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)

            val num1 = (editText1.getText().toString()).toDoubleOrNull()
            val num2 = (editText2.getText().toString()).toDoubleOrNull()

            if (num1 != null && num2  != null) {
                val num_a:Double = num1 - num2
                intent.putExtra("VALUE_A",num_a)
                startActivity(intent)

            }else{
                showAlertDialog()
            }

        }


        button3.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)

            val num1 = (editText1.getText().toString()).toDoubleOrNull()
            val num2 = (editText2.getText().toString()).toDoubleOrNull()

            if (num1 != null && num2  != null) {
                val num_a:Double = num1 * num2
                intent.putExtra("VALUE_A",num_a)
                startActivity(intent)

            }else{
                showAlertDialog()
            }

        }

        button4.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)

            val num1 = (editText1.getText().toString()).toDoubleOrNull()
            val num2 = (editText2.getText().toString()).toDoubleOrNull()

            if (num1 != null && num2  != null) {
                val num_a:Double = num1 / num2
                intent.putExtra("VALUE_A",num_a)
                startActivity(intent)

            }else{
                showAlertDialog()
            }

        }


        }


//    Alert Method 関数　定義
    private fun showAlertDialog() {
        // AlertDialog.Builderクラスを使ってAlertDialogの準備をする
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage("空白が入力されたか、過大な数字が入力されました！　数字は17桁までで、" +
                "-17976931348623157 から　17976931348623157 迄可能です。")

        // AlertDialogを作成して表示する
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }



}
//Class END