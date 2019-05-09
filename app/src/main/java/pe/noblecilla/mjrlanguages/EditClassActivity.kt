package pe.noblecilla.mjrlanguages

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_edit_class.*

class EditClassActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_class)

        btnCancel.setOnClickListener {
            startActivity(Intent(this, ClassInfoActivity::class.java))
        }

        btnSave.setOnClickListener {
            val alert = AlertDialog.Builder(this@EditClassActivity)
            alert.setView(R.layout.dialog_edit_class)
            alert.setPositiveButton(R.string.save){
                    dialog, which ->
                startActivity(Intent(this, ClassInfoActivity::class.java))
                finish()
            }
            alert.setNegativeButton(R.string.cancel){
                    dialog, which ->
            }
            val dialog: AlertDialog = alert.create()
            dialog.show()
        }
    }

    override fun onBackPressed() {

    }
}
