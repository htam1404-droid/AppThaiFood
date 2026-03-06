package com.example.thaifood

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val btnBack = findViewById<Button>(R.id.btnBack)

        btnBack.setOnClickListener {
            finish()
        }

        val txtMon = findViewById<TextView>(R.id.txtMon)

        // nhận dữ liệu từ MainActivity
        val mon = intent.getStringExtra("mon")

        // hiển thị món
        txtMon.text = mon

        val danhSach = intent.getStringArrayListExtra("dsMon")

        txtMon.text = Cart.danhSachMon.joinToString("\n")

    }
}