package com.example.transitionanimation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.transitionanimation.R
import com.example.transitionanimation.databinding.FragmentFirstBinding
import com.example.transitionanimation.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {

    private val args by navArgs<ThirdFragmentArgs>()


    private lateinit var binding: FragmentThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentThirdBinding.inflate(layoutInflater, container, false)

        binding.textView.text =                            //**safe Args**//
            "name: ${args.currentUser.name} \n last name : ${args.currentUser.lastName}"

        binding.butThirdBack.setOnClickListener {

            findNavController().navigate(R.id.action_thirdFragment_to_firstFragment)
        }


        return binding.root
    }

}