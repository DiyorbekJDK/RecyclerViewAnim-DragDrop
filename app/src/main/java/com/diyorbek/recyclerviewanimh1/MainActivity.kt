package com.diyorbek.recyclerviewanimh1

import android.content.ClipData.Item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.diyorbek.recyclerviewanimh1.adapter.ItemAdapter
import com.diyorbek.recyclerviewanimh1.adapter.itemTouchHelper
import com.diyorbek.recyclerviewanimh1.databinding.ActivityMainBinding
import com.diyorbek.recyclerviewanimh1.util.Constants

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val itemList = mutableListOf<Item>()
    private val itemAdapter by lazy { ItemAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        itemTouchHelper.attachToRecyclerView(binding.recyclerView)

        binding.recyclerView.apply {
            adapter = itemAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
        itemAdapter.itemList = Constants.list()

    }
}