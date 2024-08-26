package com.example.lifecounteredh

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.app.AlertDialog;
import android.os.Build
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.widget.ImageView
import kotlin.random.Random

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


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

        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnCloseMenu: Button = findViewById(R.id.btnCloseMenu)
        val btnQuitApp: Button = findViewById(R.id.btnQuit)
        val btnRollTheDice: Button = findViewById(R.id.btnRollTheDice)
        val btnReset:Button=findViewById(R.id.btnReset)

        val ivDice: ImageView = findViewById(R.id.ivDice)

        var dice_num: Int = 1

        btnCloseMenu.setOnClickListener {
            finish()
        }
        btnQuitApp.setOnClickListener {
            AlertDialog.Builder(this) // FragmentではActivityを取得して生成
                .setTitle("Quit Application ?")
                //.setMessage("Quit Application ?")
                .setPositiveButton("Yes", { dialog, which ->
                    // TODO:Yesが押された時の挙動
                    finishAffinity()
                })
                .setNegativeButton("No", { dialog, which ->
                    // TODO:Noが押された時の挙動
                })
                .show()
        }
        btnRollTheDice.setOnClickListener {
            dice_num = Random.nextInt(1, 7)
            when (dice_num) {
                1 -> ivDice.setImageResource(R.drawable.t_dice_01)
                2 -> ivDice.setImageResource(R.drawable.t_dice_02)
                3 -> ivDice.setImageResource(R.drawable.t_dice_03)
                4 -> ivDice.setImageResource(R.drawable.t_dice_04)
                5 -> ivDice.setImageResource(R.drawable.t_dice_05)
                6 -> ivDice.setImageResource(R.drawable.t_dice_06)
                else -> println("Number is out of range")
            }
        }
        btnReset.setOnClickListener {
            AlertDialog.Builder(this) // FragmentではActivityを取得して生成
                .setTitle("Reset Life ?")
                //.setMessage("Quit Application ?")
                .setPositiveButton("Yes", { dialog, which ->
                    // TODO:Yesが押された時の挙動

                    sg.p1Life= 40
                    sg.p2Life= 40
                    sg.p3Life= 40
                    sg.p4Life= 40

                    sg.p4EDHP1Damage=0
                    sg.p4EDHP2Damage=0
                    sg.p4EDHP3Damage=0

                    sg.p3EDHP1Damage=0
                    sg.p3EDHP2Damage=0
                    sg.p3EDHP4Damage=0

                    sg.p2EDHP1Damage=0
                    sg.p2EDHP3Damage=0
                    sg.p2EDHP4Damage=0

                    sg.p1EDHP2Damage=0
                    sg.p1EDHP3Damage=0
                    sg.p1EDHP4Damage=0
                })
                .setNegativeButton("No", { dialog, which ->
                    // TODO:Noが押された時の挙動
                })
                .show()
        }


    }
}