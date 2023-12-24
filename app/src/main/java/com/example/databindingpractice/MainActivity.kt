package com.example.databindingpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databindingpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    private val image: ImageView
        get() = binding.image

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        val post = Post(
            "Random",
            "This is random picture that fetched by url",
            "https://consolidatedlabel.com/app/uploads/2007/10/low-res-72dpi.jpg"
        )
        binding.lifecycleOwner = this
        binding.mainViewModel = mainViewModel
        binding.post = post

        var url : String = "https://consolidatedlabel.com/app/uploads/2007/10/low-res-72dpi.jpg"

    }
}