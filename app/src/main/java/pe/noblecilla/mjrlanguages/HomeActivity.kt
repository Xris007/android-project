package pe.noblecilla.mjrlanguages

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AlertDialog
import android.view.Menu
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.home_content.*

class HomeActivity : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        iBtnClass.setOnClickListener {
            startActivity(Intent(this, ClassActivity::class.java))
        }

        iBtnPackage.setOnClickListener {
            startActivity(Intent(this, PackageActivity::class.java))
        }

        iBtnNotification.setOnClickListener {
            startActivity(Intent(this, NotificationActivity::class.java))
        }

        iBtnTeacher.setOnClickListener {
            startActivity(Intent(this, TeacherInfoActivity::class.java))
        }

        iBtnContact.setOnClickListener {
            startActivity(Intent(this, ContactUsActivity::class.java))
        }

        toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolBar, R.string.open, R.string.exit)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()


        navView.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.navUser -> {
                    startActivity(Intent(this, StudentInfoActivity::class.java))
                    true
                } R.id.navClass -> {
                    startActivity(Intent(this, ClassActivity::class.java))
                    true
                } R.id.navSchedule -> {
                    true
                } R.id.navPackage -> {
                    startActivity(Intent(this, PackageActivity::class.java))
                    true
                } R.id.navNotification -> {
                    startActivity(Intent(this, NotificationActivity::class.java))
                    true
                } R.id.navSetting -> {
                    true
                } R.id.navLogOut -> {
                    val alert = AlertDialog.Builder(this@HomeActivity)
                    alert.setView(R.layout.dialog_exit)
                    alert.setPositiveButton(R.string.exit){
                            dialog, which ->
                        startActivity(Intent(this, LogInActivity::class.java))
                        finish()
                    }
                    alert.setNegativeButton(R.string.cancel){
                            dialog, which ->
                    }
                    val dialoga: AlertDialog = alert.create()
                    dialoga.show()
                    true
                } else -> false
            }
        }

    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            val alert = AlertDialog.Builder(this@HomeActivity)
            alert.setView(R.layout.dialog_exit)
            alert.setPositiveButton(R.string.exit){
                    dialog, which ->
                startActivity(Intent(this, LogInActivity::class.java))
                finish()
            }
            alert.setNegativeButton(R.string.cancel){
                    dialog, which ->
            }
            val dialog: AlertDialog = alert.create()
            dialog.show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_home, menu)
        return super.onCreateOptionsMenu(menu)
    }

}
