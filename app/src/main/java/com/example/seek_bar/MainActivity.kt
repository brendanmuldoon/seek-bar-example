package com.example.seek_bar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.seek_bar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initBinding()
    }

    private fun initBinding() {
        val activityMainBinding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this,
            R.layout.activity_main)

        viewModel = ViewModelProvider.AndroidViewModelFactory(application)
            .create(MyViewModel::class.java)

        activityMainBinding.viewmodel = viewModel
        activityMainBinding.lifecycleOwner = this
    }
}