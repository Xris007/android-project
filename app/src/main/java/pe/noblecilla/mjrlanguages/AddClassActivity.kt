package pe.noblecilla.mjrlanguages

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_add_class.*
import kotlinx.android.synthetic.main.activity_forgot_password.*

class AddClassActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_class)

        btnAdd.setOnClickListener {
            val alert = AlertDialog.Builder(this@AddClassActivity)
            alert.setView(R.layout.dialog_add_class)
            alert.setPositiveButton(R.string.add){
                    dialog, which ->
                startActivity(Intent(this, ClassActivity::class.java))
                finish()
            }
            alert.setNegativeButton(R.string.cancel){
                    dialog, which ->
            }
            val dialog: AlertDialog = alert.create()
            dialog.show()
        }

        btnCancel.setOnClickListener {
            startActivity(Intent(this, ClassActivity::class.java))
        }

    }
}
