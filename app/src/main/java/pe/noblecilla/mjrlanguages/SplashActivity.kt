package pe.noblecilla.mjrlanguages

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        progressBar()

        Handler().postDelayed({
            startActivity(Intent(this, LogInActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT);
    }

    fun progressBar() {
        var progressStatus = 0;
        val handler: Handler = Handler()

        Thread(Runnable {
            while (progressStatus < 100) {
                progressStatus+=1;
                try {
                    Thread.sleep(30)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }

                handler.post(Runnable {
                    progressBar.progress = progressStatus
                })
            }
        }).start()
    }


}
