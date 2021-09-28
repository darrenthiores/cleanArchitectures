package com.icebeal.cleanarchitecture.presenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.icebeal.cleanarchitecture.R
import com.icebeal.cleanarchitecture.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding:ActivityMainBinding? = null
    private val binding get() = _binding

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val factory = ViewModelFactory.getInstance()
        mainViewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]

        mainViewModel.setName("Darren")
        mainViewModel.message.observe(this, {

            binding?.text?.text = it.message

        })

    }
}