package com.example.androidstudy_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
//import com.example.androidstudy_kotlin.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        binding = ActivityMainBinding.inflate(layoutInflater);
//        setContentView(binding.root);

//        navController = binding.navHostFragment.findNavController()
        navController = nav_host_fragment.findNavController()

//        binding.btnViewBiding.setOnClickListener {
//            startActivity(Intent(this, ViewActivity::class.java))
//        }
//
//        binding.btnDataBinding.setOnClickListener {
//            startActivity(Intent(this, DataActivity::class.java));
//        }
//
//        binding.btnRoom.setOnClickListener {
//            startActivity(Intent(this, RoomActivity::class.java))
//        }
    }
}