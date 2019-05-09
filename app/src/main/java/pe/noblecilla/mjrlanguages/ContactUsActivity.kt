package pe.noblecilla.mjrlanguages

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_class_info.*
import kotlinx.android.synthetic.main.activity_class_info.ivBack
import kotlinx.android.synthetic.main.activity_contact_us.*

class ContactUsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us)

        ivBack.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        btnFeedBack.setOnClickListener {
            startActivity(Intent(this, FeedBackActivity::class.java))
        }

    }

    override fun onBackPressed() {

    }
}
