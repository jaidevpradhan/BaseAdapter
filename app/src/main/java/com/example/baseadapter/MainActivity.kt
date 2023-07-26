package com.example.baseadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.BaseAdapter
import com.example.baseadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var baseAdapter : BaseAdapter
    lateinit var binding: ActivityMainBinding
    var studentList= mutableListOf<studentdata>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        baseAdapter= BaseAdapterClass(studentList)
        binding.listView.adapter=baseAdapter
        studentList.add(studentdata(1,"Jaidev"))
        studentList.add(studentdata(1,"Gourav"))
        studentList.add(studentdata(name = "Tate"))
        binding.listView.setOnItemClickListener { adapterView, view, position, id ->
            System.out.println("position $position id $id")
            studentList.removeAt(position)
            baseAdapter.notifyDataSetChanged()
        }
    }
}


