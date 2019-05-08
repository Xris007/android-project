package pe.noblecilla.mjrlanguages

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AlertDialog
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

        iBtnContact.setOnClickListener {
            startActivity(Intent(this, ContactUsActivity::class.java))
        }

        //setSupportActionBar(toolBar)
        toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolBar, R.string.open, R.string.exit)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        //toolBar.setNavigationIcon(R.drawable.ic_menu)









    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
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
}
