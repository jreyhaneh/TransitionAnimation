package com.example.transitionanimation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.transitionanimation.R
import com.example.transitionanimation.databinding.FragmentFirstBinding
import com.example.transitionanimation.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSecondBinding.inflate(layoutInflater, container, false)

        binding.butSecondBack.setOnClickListener {

            findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
        }


        return binding.root
    }

}