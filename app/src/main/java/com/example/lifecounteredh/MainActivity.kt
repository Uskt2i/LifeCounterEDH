package com.example.lifecounteredh

import android.content.Intent
import android.os.Bundle
import android.os.Build
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.WindowManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // フルスクリーンモードを設定
        /*
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
         */
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            // Android 11 以上の場合
            window.insetsController?.let { controller ->
                controller.hide(WindowInsets.Type.statusBars() or WindowInsets.Type.navigationBars())
                controller.systemBarsBehavior = WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            }
        } else {
            // Android 11 以下の場合
            @Suppress("DEPRECATION")
            window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_FULLSCREEN
                    or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
        }

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tvP1Life:TextView=findViewById(R.id.tvP1Life)
        val tvP2Life:TextView=findViewById(R.id.tvP2Life)
        val tvP3Life:TextView=findViewById(R.id.tvP3Life)
        val tvP4Life:TextView=findViewById(R.id.tvP4Life)

        val tvP4EDHP1Damage:TextView=findViewById(R.id.tvP4EDHP1Damage)
        val tvP4EDHP2Damage:TextView=findViewById(R.id.tvP4EDHP2Damage)
        val tvP4EDHP3Damage:TextView=findViewById(R.id.tvP4EDHP3Damage)

        val tvP3EDHP1Damage:TextView=findViewById(R.id.tvP3EDHP1Damage)
        val tvP3EDHP2Damage:TextView=findViewById(R.id.tvP3EDHP2Damage)
        val tvP3EDHP4Damage:TextView=findViewById(R.id.tvP3EDHP4Damage)

        val tvP2EDHP1Damage:TextView=findViewById(R.id.tvP2EDHP1Damage)
        val tvP2EDHP3Damage:TextView=findViewById(R.id.tvP2EDHP3Damage)
        val tvP2EDHP4Damage:TextView=findViewById(R.id.tvP2EDHP4Damage)

        val tvP1EDHP2Damage:TextView=findViewById(R.id.tvP1EDHP2Damage)
        val tvP1EDHP3Damage:TextView=findViewById(R.id.tvP1EDHP3Damage)
        val tvP1EDHP4Damage:TextView=findViewById(R.id.tvP1EDHP4Damage)

        val btnP1LifeTop:Button=findViewById(R.id.btnP1LifeTop)
        val btnP1LifeButton:Button=findViewById(R.id.btnP1LifeButtom)
        val btnP2LifeTop:Button=findViewById(R.id.btnP2LifeTop)
        val btnP2LifeButton:Button=findViewById(R.id.btnP2LifeButtom)
        val btnP3LifeTop:Button=findViewById(R.id.btnP3LifeTop)
        val btnP3LifeButton:Button=findViewById(R.id.btnP3LifeButtom)
        val btnP4LifeTop:Button=findViewById(R.id.btnP4LifeTop)
        val btnP4LifeButton:Button=findViewById(R.id.btnP4LifeButtom)

        val btnP4EDHP1Top:Button=findViewById(R.id.btnP4EDHP1Top)
        val btnP4EDHP2Top:Button=findViewById(R.id.btnP4EDHP2Top)
        val btnP4EDHP3Top:Button=findViewById(R.id.btnP4EDHP3Top)
        val btnP4EDHP1Buttom:Button=findViewById(R.id.btnP4EDHP1Buttom)
        val btnP4EDHP2Buttom:Button=findViewById(R.id.btnP4EDHP2Buttom)
        val btnP4EDHP3Buttom:Button=findViewById(R.id.btnP4EDHP3Buttom)

        val btnP3EDHP1Top:Button=findViewById(R.id.btnP3EDHP1Top)
        val btnP3EDHP2Top:Button=findViewById(R.id.btnP3EDHP2Top)
        val btnP3EDHP4Top:Button=findViewById(R.id.btnP3EDHP4Top)
        val btnP3EDHP1Buttom:Button=findViewById(R.id.btnP3EDHP1Buttom)
        val btnP3EDHP2Buttom:Button=findViewById(R.id.btnP3EDHP2Buttom)
        val btnP3EDHP4Buttom:Button=findViewById(R.id.btnP3EDHP4Buttom)

        val btnP2EDHP1Top:Button=findViewById(R.id.btnP2EDHP1Top)
        val btnP2EDHP3Top:Button=findViewById(R.id.btnP2EDHP3Top)
        val btnP2EDHP4Top:Button=findViewById(R.id.btnP2EDHP4Top)
        val btnP2EDHP1Buttom:Button=findViewById(R.id.btnP2EDHP1Buttom)
        val btnP2EDHP3Buttom:Button=findViewById(R.id.btnP2EDHP3Buttom)
        val btnP2EDHP4Buttom:Button=findViewById(R.id.btnP2EDHP4Buttom)

        val btnP1EDHP4Top:Button=findViewById(R.id.btnP1EDHP4Top)
        val btnP1EDHP2Top:Button=findViewById(R.id.btnP1EDHP2Top)
        val btnP1EDHP3Top:Button=findViewById(R.id.btnP1EDHP3Top)
        val btnP1EDHP4Buttom:Button=findViewById(R.id.btnP1EDHP4Buttom)
        val btnP1EDHP2Buttom:Button=findViewById(R.id.btnP1EDHP2Buttom)
        val btnP1EDHP3Buttom:Button=findViewById(R.id.btnP1EDHP3Buttom)

        val btnP4Menu:Button=findViewById(R.id.btnP4Menu)

        /*
        var p1Life:Int=40
        var p2Life:Int=40
        var p3Life:Int=40
        var p4Life:Int=40

        var p4EDHP1Damage:Int=0
        var p4EDHP2Damage:Int=0
        var p4EDHP3Damage:Int=0

        var p3EDHP1Damage:Int=0
        var p3EDHP2Damage:Int=0
        var p3EDHP4Damage:Int=0

        var p2EDHP1Damage:Int=0
        var p2EDHP3Damage:Int=0
        var p2EDHP4Damage:Int=0

        var p1EDHP2Damage:Int=0
        var p1EDHP3Damage:Int=0
        var p1EDHP4Damage:Int=0
         */



        //Button Menu
        btnP4Menu.setOnClickListener {
            val intent = Intent(this,MenuActivity::class.java)

            //2)値を渡す
            intent.putExtra("MY_PARAM","Test")
            startActivity(intent)
        }
        //Button
        btnP1LifeTop.setOnClickListener {
            sg.p1Life++
            tvP1Life.text=sg.p1Life.toString()
        }
        btnP2LifeTop.setOnClickListener {
            sg.p2Life++
            tvP2Life.text=sg.p2Life.toString()
        }
        btnP3LifeTop.setOnClickListener {
            sg.p3Life++
            tvP3Life.text=sg.p3Life.toString()
        }
        btnP4LifeTop.setOnClickListener {
            sg.p4Life++
            tvP4Life.text=sg.p4Life.toString()
        }

        //Button Click Button
        btnP1LifeButton.setOnClickListener {
            sg.p1Life--
            tvP1Life.text=sg.p1Life.toString()
        }
        btnP2LifeButton.setOnClickListener {
            sg.p2Life--
            tvP2Life.text=sg.p2Life.toString()
        }
        btnP3LifeButton.setOnClickListener {
            sg.p3Life--
            tvP3Life.text=sg.p3Life.toString()
        }
        btnP4LifeButton.setOnClickListener {
            sg.p4Life--
            tvP4Life.text=sg.p4Life.toString()
        }
        //Button P4 EDH damage
        btnP4EDHP1Top.setOnClickListener {
            sg.p4EDHP1Damage++
            sg.p4Life--
            tvP4EDHP1Damage.text=sg.p4EDHP1Damage.toString()
            tvP4Life.text=sg.p4Life.toString()
        }
        btnP4EDHP2Top.setOnClickListener {
            sg.p4EDHP2Damage++
            sg.p4Life--
            tvP4EDHP2Damage.text=sg.p4EDHP2Damage.toString()
            tvP4Life.text=sg.p4Life.toString()
        }
        btnP4EDHP3Top.setOnClickListener {
            sg.p4EDHP3Damage++
            sg.p4Life--
            tvP4EDHP3Damage.text=sg.p4EDHP3Damage.toString()
            tvP4Life.text=sg.p4Life.toString()
        }
        btnP4EDHP1Buttom.setOnClickListener {
            sg.p4EDHP1Damage--
            sg.p4Life++
            tvP4EDHP1Damage.text=sg.p4EDHP1Damage.toString()
            tvP4Life.text=sg.p4Life.toString()
        }
        btnP4EDHP2Buttom.setOnClickListener {
            sg.p4EDHP2Damage--
            sg.p4Life++
            tvP4EDHP2Damage.text=sg.p4EDHP2Damage.toString()
            tvP4Life.text=sg.p4Life.toString()
        }
        btnP4EDHP3Buttom.setOnClickListener {
            sg.p4EDHP3Damage--
            sg.p4Life++
            tvP4EDHP3Damage.text=sg.p4EDHP3Damage.toString()
            tvP4Life.text=sg.p4Life.toString()
        }

        //Button P3 EDH damage
        btnP3EDHP1Top.setOnClickListener {
            sg.p3EDHP1Damage++
            sg.p3Life--
            tvP3EDHP1Damage.text=sg.p3EDHP1Damage.toString()
            tvP3Life.text=sg.p3Life.toString()
        }
        btnP3EDHP2Top.setOnClickListener {
            sg.p3EDHP2Damage++
            sg.p3Life--
            tvP3EDHP2Damage.text=sg.p3EDHP2Damage.toString()
            tvP3Life.text=sg.p3Life.toString()
        }
        btnP3EDHP4Top.setOnClickListener {
            sg.p3EDHP4Damage++
            sg.p3Life--
            tvP3EDHP4Damage.text=sg.p3EDHP4Damage.toString()
            tvP3Life.text=sg.p3Life.toString()
        }
        btnP3EDHP1Buttom.setOnClickListener {
            sg.p3EDHP1Damage--
            sg.p3Life++
            tvP3EDHP1Damage.text=sg.p3EDHP1Damage.toString()
            tvP3Life.text=sg.p3Life.toString()
        }
        btnP3EDHP2Buttom.setOnClickListener {
            sg.p3EDHP2Damage--
            sg.p3Life++
            tvP3EDHP2Damage.text=sg.p3EDHP2Damage.toString()
            tvP3Life.text=sg.p3Life.toString()
        }
        btnP3EDHP4Buttom.setOnClickListener {
            sg.p3EDHP4Damage--
            sg.p3Life++
            tvP3EDHP4Damage.text = sg.p3EDHP4Damage.toString()
            tvP3Life.text=sg.p3Life.toString()
        }
        //Button P2 EDH damage
        btnP2EDHP1Top.setOnClickListener {
            sg.p2EDHP1Damage++
            sg.p2Life--
            tvP2EDHP1Damage.text=sg.p2EDHP1Damage.toString()
            tvP2Life.text=sg.p2Life.toString()
        }
        btnP2EDHP3Top.setOnClickListener {
            sg.p2EDHP3Damage++
            sg.p2Life--
            tvP2EDHP3Damage.text=sg.p2EDHP3Damage.toString()
            tvP2Life.text=sg.p2Life.toString()
        }
        btnP2EDHP4Top.setOnClickListener {
            sg.p2EDHP4Damage++
            sg.p2Life--
            tvP2EDHP4Damage.text=sg.p2EDHP4Damage.toString()
            tvP2Life.text=sg.p2Life.toString()
        }
        btnP2EDHP1Buttom.setOnClickListener {
            sg.p2EDHP1Damage--
            sg.p2Life++
            tvP2EDHP1Damage.text=sg.p2EDHP1Damage.toString()
            tvP2Life.text=sg.p2Life.toString()
        }
        btnP2EDHP4Buttom.setOnClickListener {
            sg.p2EDHP4Damage--
            sg.p2Life++
            tvP2EDHP4Damage.text=sg.p2EDHP4Damage.toString()
            tvP2Life.text=sg.p2Life.toString()
        }
        btnP2EDHP3Buttom.setOnClickListener {
            sg.p2EDHP3Damage--
            sg.p2Life++
            tvP2EDHP3Damage.text=sg.p2EDHP3Damage.toString()
            tvP2Life.text=sg.p2Life.toString()
        }
        //Button P1 EDH damage
        btnP1EDHP4Top.setOnClickListener {
            sg.p1EDHP4Damage++
            sg.p1Life--
            tvP1EDHP4Damage.text=sg.p1EDHP4Damage.toString()
            tvP1Life.text=sg.p1Life.toString()
        }
        btnP1EDHP2Top.setOnClickListener {
            sg.p1EDHP2Damage++
            sg.p1Life--
            tvP1EDHP2Damage.text=sg.p1EDHP2Damage.toString()
            tvP1Life.text=sg.p1Life.toString()
        }
        btnP1EDHP3Top.setOnClickListener {
            sg.p1EDHP3Damage++
            sg.p1Life--
            tvP1EDHP3Damage.text=sg.p1EDHP3Damage.toString()
            tvP1Life.text=sg.p1Life.toString()
        }
        btnP1EDHP4Buttom.setOnClickListener {
            sg.p1EDHP4Damage--
            sg.p1Life++
            tvP1EDHP4Damage.text=sg.p1EDHP4Damage.toString()
            tvP1Life.text=sg.p1Life.toString()
        }
        btnP1EDHP2Buttom.setOnClickListener {
            sg.p1EDHP2Damage--
            sg.p1Life++
            tvP1EDHP2Damage.text=sg.p1EDHP2Damage.toString()
            tvP1Life.text=sg.p1Life.toString()
        }
        btnP1EDHP3Buttom.setOnClickListener {
            sg.p1EDHP3Damage--
            sg.p1Life++
            tvP1EDHP3Damage.text=sg.p1EDHP3Damage.toString()
            tvP1Life.text=sg.p1Life.toString()
        }

    }

    override fun onResume() {
        super.onResume()
        val tvP1Life:TextView=findViewById(R.id.tvP1Life)
        val tvP2Life:TextView=findViewById(R.id.tvP2Life)
        val tvP3Life:TextView=findViewById(R.id.tvP3Life)
        val tvP4Life:TextView=findViewById(R.id.tvP4Life)

        val tvP4EDHP1Damage:TextView=findViewById(R.id.tvP4EDHP1Damage)
        val tvP4EDHP2Damage:TextView=findViewById(R.id.tvP4EDHP2Damage)
        val tvP4EDHP3Damage:TextView=findViewById(R.id.tvP4EDHP3Damage)

        val tvP3EDHP1Damage:TextView=findViewById(R.id.tvP3EDHP1Damage)
        val tvP3EDHP2Damage:TextView=findViewById(R.id.tvP3EDHP2Damage)
        val tvP3EDHP4Damage:TextView=findViewById(R.id.tvP3EDHP4Damage)

        val tvP2EDHP1Damage:TextView=findViewById(R.id.tvP2EDHP1Damage)
        val tvP2EDHP3Damage:TextView=findViewById(R.id.tvP2EDHP3Damage)
        val tvP2EDHP4Damage:TextView=findViewById(R.id.tvP2EDHP4Damage)

        val tvP1EDHP2Damage:TextView=findViewById(R.id.tvP1EDHP2Damage)
        val tvP1EDHP3Damage:TextView=findViewById(R.id.tvP1EDHP3Damage)
        val tvP1EDHP4Damage:TextView=findViewById(R.id.tvP1EDHP4Damage)

        tvP1Life.text=sg.p1Life.toString()
        tvP2Life.text=sg.p2Life.toString()
        tvP3Life.text=sg.p3Life.toString()
        tvP4Life.text=sg.p4Life.toString()

        tvP1EDHP2Damage.text=sg.p1EDHP2Damage.toString()
        tvP1EDHP3Damage.text=sg.p1EDHP3Damage.toString()
        tvP1EDHP4Damage.text=sg.p1EDHP4Damage.toString()

        tvP2EDHP1Damage.text=sg.p2EDHP1Damage.toString()
        tvP2EDHP3Damage.text=sg.p2EDHP3Damage.toString()
        tvP2EDHP4Damage.text=sg.p2EDHP4Damage.toString()

        tvP3EDHP1Damage.text=sg.p3EDHP1Damage.toString()
        tvP3EDHP2Damage.text=sg.p3EDHP2Damage.toString()
        tvP3EDHP4Damage.text=sg.p3EDHP4Damage.toString()

        tvP4EDHP1Damage.text=sg.p4EDHP1Damage.toString()
        tvP4EDHP2Damage.text=sg.p4EDHP2Damage.toString()
        tvP4EDHP3Damage.text=sg.p4EDHP3Damage.toString()

    }
}