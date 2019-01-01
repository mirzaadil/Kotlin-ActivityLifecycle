package com.kotlin.mirzaadil.kotlinactivitylifecycle

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {


    companion object {
        val log = Logger.getLogger(MainActivity::class.java.name)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        log.info("on Create Call")
    }

    override fun onResume() {
        super.onResume()
        log.info("on Resume Call")
    }

    override fun onStart() {
        super.onStart()

        log.info("on Start Call")
    }

    override fun onPause() {
        super.onPause()

        log.info("on Pause Call")
    }

    override fun onStop() {
        super.onStop()

        log.info("on Stop call")
    }

    override fun onDestroy() {
        super.onDestroy()

        log.info("on Destroy call")
    }
}
