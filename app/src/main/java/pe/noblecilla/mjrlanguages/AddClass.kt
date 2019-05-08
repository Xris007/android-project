package pe.noblecilla.mjrlanguages

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_forgot_password.*

class AddClass : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_class)



        /*ivBack.setOnClickListener {
            startActivity(Intent(this, AllClasses::class.java))
            finish()
        }*/
        btnSend.setOnClickListener {
            val alert = AlertDialog.Builder(this@AddClass)
            alert.setView(R.layout.dialog_confirm)
            alert.setPositiveButton(R.string.dialog_confirm_exit){
                    dialog, which ->
                startActivity(Intent(this, AllClasses::class.java))
                finish()
            }
            val dialog: AlertDialog = alert.create()
            dialog.show()
        }
    }
}
