package com.example.thaifood

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        bottomNav.setOnItemSelectedListener {

            when(it.itemId){

                R.id.nav_home -> {
                    true
                }

                R.id.nav_orders -> {
                    val intent = Intent(this, OrderActivity::class.java)
                    startActivity(intent)
                    true
                }

                R.id.nav_profile -> {
                    Toast.makeText(this,"Trang cá nhân",Toast.LENGTH_SHORT).show()
                    true
                }

                else -> false
            }

        }
        /*MÓN CHÍNH*/
        val danhSachMon = ArrayList<String>()

        val btnTomyum = findViewById<Button>(R.id.btnAddTomyum)
        val btnPadThai = findViewById<Button>(R.id.btnPadThai)
        val btnBakhia = findViewById<Button>(R.id.btnBakhia)
        val btngoixoaiphutomdo = findViewById<Button>(R.id.btngoixoaiphutomdo)
        val btnlabbo = findViewById<Button>(R.id.btnlabbo)
        val btndaosuoncay = findViewById<Button>(R.id.btndaosuoncay)

        /* Tom Yum */
        btnTomyum.setOnClickListener {
            Cart.danhSachMon.add("Tom Yum Hải Sản - 65.000đ")

            val intent = Intent(this, OrderActivity::class.java)
            intent.putStringArrayListExtra("dsMon", danhSachMon)

            startActivity(intent)
        }

        btnPadThai.setOnClickListener {

            Cart.danhSachMon.add("Pad Thai - 55.000đ")

            val intent = Intent(this, OrderActivity::class.java)
            intent.putStringArrayListExtra("dsMon", danhSachMon)

            startActivity(intent)
        }

        btnBakhia.setOnClickListener {

            Cart.danhSachMon.add("Ba Khía Thái - 70.000đ")

            val intent = Intent(this, OrderActivity::class.java)
            intent.putStringArrayListExtra("dsMon", danhSachMon)

            startActivity(intent)
        }

        btngoixoaiphutomdo.setOnClickListener {

            Cart.danhSachMon.add("Gỏi Xoài Phủ Tôm Đỏ - 110.000đ")

            val intent = Intent(this, OrderActivity::class.java)
            intent.putStringArrayListExtra("dsMon", danhSachMon)

            startActivity(intent)
        }

        btnlabbo.setOnClickListener {

            Cart.danhSachMon.add("Lạp Bò - 95.000đ")

            val intent = Intent(this, OrderActivity::class.java)
            intent.putStringArrayListExtra("dsMon", danhSachMon)

            startActivity(intent)
        }

        btndaosuoncay.setOnClickListener {

            Cart.danhSachMon.add("Đảo Sườn Cay - 150.000đ")

            val intent = Intent(this, OrderActivity::class.java)
            intent.putStringArrayListExtra("dsMon", danhSachMon)

            startActivity(intent)
        }
        /*MÓN TRÁNG MIỆNG*/
        val btnbanhchuoithai = findViewById<Button>(R.id.btnbanhchuoithai)
        val btnbanhquay = findViewById<Button>(R.id.btnbanhquay)
        val btnchethai = findViewById<Button>(R.id.btnchethai)
        val btnkemduachuoichien = findViewById<Button>(R.id.btnkemduacchuoichien)

        btnbanhchuoithai.setOnClickListener {

            Cart.danhSachMon.add("Bánh Chuối Thái - 45.000đ")

            val intent = Intent(this, OrderActivity::class.java)
            intent.putStringArrayListExtra("dsMon", danhSachMon)

            startActivity(intent)
        }
        btnbanhquay.setOnClickListener {

            Cart.danhSachMon.add("Bánh Quẩy - 45.000đ")

            val intent = Intent(this, OrderActivity::class.java)
            intent.putStringArrayListExtra("dsMon", danhSachMon)

            startActivity(intent)
        }
        btnchethai.setOnClickListener {

            Cart.danhSachMon.add("Bánh Quẩy - 45.000đ")

            val intent = Intent(this, OrderActivity::class.java)
            intent.putStringArrayListExtra("dsMon", danhSachMon)

            startActivity(intent)
        }
        btnkemduachuoichien.setOnClickListener {

            Cart.danhSachMon.add("Kem Dừa Chuối Chiên - 45.000đ")

            val intent = Intent(this, OrderActivity::class.java)
            intent.putStringArrayListExtra("dsMon", danhSachMon)

            startActivity(intent)
        }
    }
}