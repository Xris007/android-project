package pe.noblecilla.mjrlanguages

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_class.*

class ClassActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class)

        ivBack.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        tvInfo.setOnClickListener {
            startActivity(Intent(this, ClassInfoActivity::class.java))
        }

        fabAdd.setOnClickListener {
            startActivity(Intent(this, AddClassActivity::class.java))
        }
    }

    override fun onBackPressed() {

    }
}
