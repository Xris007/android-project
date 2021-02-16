package pe.noblecilla.mjrlanguages

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_feed_back.*

class FeedBackActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed_back)

        ivBack.setOnClickListener {
            startActivity(Intent(this, ContactUsActivity::class.java))
            finish()
        }

        btnSend.setOnClickListener {
            val alert = AlertDialog.Builder(this@FeedBackActivity)
            alert.setView(R.layout.dialog_feedback)
            alert.setPositiveButton(R.string.send){
                    dialog, which ->
                startActivity(Intent(this, ContactUsActivity::class.java))
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

