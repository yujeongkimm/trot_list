package org.techtown.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Singer2Fragment : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //inflate layout
        val view= inflater.inflate(R.layout.fragment_singer2, container, false)

        val items = mutableListOf<String>()
        items.add("별빛 같은 나의 사랑")
        items.add("사랑의 콜센터")
        items.add("영웅시대")
        items.add("별빛 같은 나의 사랑")
        items.add("사랑의 콜센터")
        items.add("영웅시대")
        items.add("별빛 같은 나의 사랑")
        items.add("사랑의 콜센터")
        items.add("영웅시대")
        items.add("별빛 같은 나의 사랑")
        items.add("사랑의 콜센터")
        items.add("영웅시대")
        items.add("별빛 같은 나의 사랑")
        items.add("사랑의 콜센터")
        items.add("영웅시대")
        items.add("별빛 같은 나의 사랑")
        items.add("사랑의 콜센터")
        items.add("영웅시대")


        val rv2 = view.findViewById<RecyclerView>(R.id.singRV2)
        rv2.adapter = RVAdapter(items)
        rv2.layoutManager=LinearLayoutManager(context)


        view.findViewById<ImageView>(R.id.image1).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer1Fragment)
        }

        view.findViewById<ImageView>(R.id.image3).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer3Fragment)
        }

        return view
    }


}