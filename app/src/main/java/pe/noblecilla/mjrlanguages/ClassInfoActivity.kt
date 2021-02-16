package pe.noblecilla.mjrlanguages

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_class.*
import kotlinx.android.synthetic.main.activity_class_info.*
import kotlinx.android.synthetic.main.activity_class_info.ivBack

class ClassInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_info)

        ivBack.setOnClickListener {
            startActivity(Intent(this, ClassActivity::class.java))
            finish()
        }

        btnEdit.setOnClickListener {
            startActivity(Intent(this, EditClassActivity::class.java))
        }
    }

    override fun onBackPressed() {

    }
}
