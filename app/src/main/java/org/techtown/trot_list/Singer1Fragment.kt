package org.techtown.trot_list

import android.content.Intent
import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Singer1Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //inflate layout
        val view= inflater.inflate(R.layout.fragment_singer1, container, false)

        //adapter연결

        val items = mutableListOf<String>()
        items.add("니가 왜 거기서나와")
        items.add("이불")
        items.add("찐이야")
        items.add("니가 왜 거기서나와")
        items.add("이불")
        items.add("찐이야")
        items.add("니가 왜 거기서나와")
        items.add("이불")
        items.add("찐이야")
        items.add("니가 왜 거기서나와")
        items.add("이불")
        items.add("찐이야")
        items.add("니가 왜 거기서나와")
        items.add("이불")
        items.add("찐이야")
        items.add("니가 왜 거기서나와")
        items.add("이불")
        items.add("찐이야")

        val rv = view.findViewById<RecyclerView>(R.id.singRV)
        //val rvAdapter = RVAdapter(items)

        rv.adapter = RVAdapter(items)
        rv.layoutManager = LinearLayoutManager(context)

        val image2 = view.findViewById<ImageView>(R.id.image2)
        image2.setOnClickListener {
            it.findNavController().navigate(R.id.action_singer1Fragment_to_singer2Fragment)
        }

        val image3 = view.findViewById<ImageView>(R.id.image3)
        image3.setOnClickListener {
            it.findNavController().navigate(R.id.action_singer1Fragment_to_singer3Fragment)
        }


        return view

    }


}