package com.example.lifecounteredh

import android.os.Bundle
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
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

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

        //Button
        btnP1LifeTop.setOnClickListener {
            p1Life++
            tvP1Life.text=p1Life.toString()
        }
        btnP2LifeTop.setOnClickListener {
            p2Life++
            tvP2Life.text=p2Life.toString()
        }
        btnP3LifeTop.setOnClickListener {
            p3Life++
            tvP3Life.text=p3Life.toString()
        }
        btnP4LifeTop.setOnClickListener {
            p4Life++
            tvP4Life.text=p4Life.toString()
        }

        //Button Click Button
        btnP1LifeButton.setOnClickListener {
            p1Life--
            tvP1Life.text=p1Life.toString()
        }
        btnP2LifeButton.setOnClickListener {
            p2Life--
            tvP2Life.text=p2Life.toString()
        }
        btnP3LifeButton.setOnClickListener {
            p3Life--
            tvP3Life.text=p3Life.toString()
        }
        btnP4LifeButton.setOnClickListener {
            p4Life--
            tvP4Life.text=p4Life.toString()
        }
        //Button P4 EDH damage
        btnP4EDHP1Top.setOnClickListener {
            p4EDHP1Damage++
            p4Life--
            tvP4EDHP1Damage.text=p4EDHP1Damage.toString()
            tvP4Life.text=p4Life.toString()
        }
        btnP4EDHP2Top.setOnClickListener {
            p4EDHP2Damage++
            p4Life--
            tvP4EDHP2Damage.text=p4EDHP2Damage.toString()
            tvP4Life.text=p4Life.toString()
        }
        btnP4EDHP3Top.setOnClickListener {
            p4EDHP3Damage++
            p4Life--
            tvP4EDHP3Damage.text=p4EDHP3Damage.toString()
            tvP4Life.text=p4Life.toString()
        }
        btnP4EDHP1Buttom.setOnClickListener {
            p4EDHP1Damage--
            p4Life++
            tvP4EDHP1Damage.text=p4EDHP1Damage.toString()
            tvP4Life.text=p4Life.toString()
        }
        btnP4EDHP2Buttom.setOnClickListener {
            p4EDHP2Damage--
            p4Life++
            tvP4EDHP2Damage.text=p4EDHP2Damage.toString()
            tvP4Life.text=p4Life.toString()
        }
        btnP4EDHP3Buttom.setOnClickListener {
            p4EDHP3Damage--
            p4Life++
            tvP4EDHP3Damage.text=p4EDHP3Damage.toString()
            tvP4Life.text=p4Life.toString()
        }

        //Button P3 EDH damage
        btnP3EDHP1Top.setOnClickListener {
            p3EDHP1Damage++
            p3Life--
            tvP3EDHP1Damage.text=p3EDHP1Damage.toString()
            tvP3Life.text=p3Life.toString()
        }
        btnP3EDHP2Top.setOnClickListener {
            p3EDHP2Damage++
            p3Life--
            tvP3EDHP2Damage.text=p3EDHP2Damage.toString()
            tvP3Life.text=p3Life.toString()
        }
        btnP3EDHP4Top.setOnClickListener {
            p3EDHP4Damage++
            p3Life--
            tvP3EDHP4Damage.text=p3EDHP4Damage.toString()
            tvP3Life.text=p3Life.toString()
        }
        btnP3EDHP1Buttom.setOnClickListener {
            p3EDHP1Damage--
            p3Life++
            tvP3EDHP1Damage.text=p3EDHP1Damage.toString()
            tvP3Life.text=p3Life.toString()
        }
        btnP3EDHP2Buttom.setOnClickListener {
            p3EDHP2Damage--
            p3Life++
            tvP3EDHP2Damage.text=p3EDHP2Damage.toString()
            tvP3Life.text=p3Life.toString()
        }
        btnP3EDHP4Buttom.setOnClickListener {
            p3EDHP4Damage--
            p3Life++
            tvP3EDHP4Damage.text = p3EDHP4Damage.toString()
            tvP3Life.text=p3Life.toString()
        }
        //Button P2 EDH damage
        btnP2EDHP1Top.setOnClickListener {
            p2EDHP1Damage++
            p2Life--
            tvP2EDHP1Damage.text=p2EDHP1Damage.toString()
            tvP2Life.text=p2Life.toString()
        }
        btnP2EDHP3Top.setOnClickListener {
            p2EDHP3Damage++
            p2Life--
            tvP2EDHP3Damage.text=p2EDHP3Damage.toString()
            tvP2Life.text=p2Life.toString()
        }
        btnP2EDHP4Top.setOnClickListener {
            p2EDHP4Damage++
            p2Life--
            tvP2EDHP4Damage.text=p2EDHP4Damage.toString()
            tvP2Life.text=p2Life.toString()
        }
        btnP2EDHP1Buttom.setOnClickListener {
            p2EDHP1Damage--
            p2Life++
            tvP2EDHP1Damage.text=p2EDHP1Damage.toString()
            tvP2Life.text=p2Life.toString()
        }
        btnP2EDHP4Buttom.setOnClickListener {
            p2EDHP4Damage--
            p2Life++
            tvP2EDHP4Damage.text=p2EDHP4Damage.toString()
            tvP2Life.text=p2Life.toString()
        }
        btnP2EDHP3Buttom.setOnClickListener {
            p2EDHP3Damage--
            p2Life++
            tvP2EDHP3Damage.text=p2EDHP3Damage.toString()
            tvP2Life.text=p2Life.toString()
        }
        //Button P1 EDH damage
        btnP1EDHP4Top.setOnClickListener {
            p1EDHP4Damage++
            p1Life--
            tvP1EDHP4Damage.text=p1EDHP4Damage.toString()
            tvP1Life.text=p1Life.toString()
        }
        btnP1EDHP2Top.setOnClickListener {
            p1EDHP2Damage++
            p1Life--
            tvP1EDHP2Damage.text=p1EDHP2Damage.toString()
            tvP1Life.text=p1Life.toString()
        }
        btnP1EDHP3Top.setOnClickListener {
            p1EDHP3Damage++
            p1Life--
            tvP1EDHP3Damage.text=p1EDHP3Damage.toString()
            tvP1Life.text=p1Life.toString()
        }
        btnP1EDHP4Buttom.setOnClickListener {
            p1EDHP4Damage--
            p1Life++
            tvP1EDHP4Damage.text=p1EDHP4Damage.toString()
            tvP1Life.text=p1Life.toString()
        }
        btnP1EDHP2Buttom.setOnClickListener {
            p1EDHP2Damage--
            p1Life++
            tvP1EDHP2Damage.text=p1EDHP2Damage.toString()
            tvP1Life.text=p1Life.toString()
        }
        btnP1EDHP3Buttom.setOnClickListener {
            p1EDHP3Damage--
            p1Life++
            tvP1EDHP3Damage.text=p1EDHP3Damage.toString()
            tvP1Life.text=p1Life.toString()
        }
    }
}