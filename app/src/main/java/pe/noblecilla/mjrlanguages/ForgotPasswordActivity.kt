package pe.noblecilla.mjrlanguages

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_forgot_password.*

class ForgotPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        ivBack.setOnClickListener {
            startActivity(Intent(this, LogInActivity::class.java))
        }

        btnSend.setOnClickListener {
            val alert = AlertDialog.Builder(this@ForgotPasswordActivity)
            alert.setView(R.layout.dialog_password)
            alert.setPositiveButton(R.string.done){
                dialog, which ->
                startActivity(Intent(this, LogInActivity::class.java))
                finish()
            }
            val dialog: AlertDialog = alert.create()
            dialog.show()
        }
    }

    override fun onBackPressed() {

    }
}
