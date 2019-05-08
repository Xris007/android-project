package pe.noblecilla.mjrlanguages

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        iBtnClass.setOnClickListener {
            startActivity(Intent(this, ClassActivity::class.java))
        }

        iBtnContact.setOnClickListener {
            startActivity(Intent(this, ContactUsActivity::class.java))
        }
    }

    override fun onBackPressed() {
        val alert = AlertDialog.Builder(this@HomeActivity)
        alert.setView(R.layout.dialog_exit)
        alert.setNegativeButton(R.string.exit){
                dialog, which ->
            startActivity(Intent(this, LogInActivity::class.java))
            finish()
        }
        alert.setPositiveButton(R.string.cancel){
                dialog, which ->
        }
        val dialog: AlertDialog = alert.create()
        dialog.show()
    }
}
