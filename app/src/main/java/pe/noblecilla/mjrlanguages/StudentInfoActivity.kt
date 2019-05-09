package pe.noblecilla.mjrlanguages

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_package.*

class StudentInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_info)

        ivBack.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

    }

    override fun onBackPressed() {

    }
}
