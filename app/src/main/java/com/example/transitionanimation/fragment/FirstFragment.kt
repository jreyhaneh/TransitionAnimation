package com.example.transitionanimation.fragment

import android.app.DirectAction
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.example.transitionanimation.R
import com.example.transitionanimation.databinding.FragmentFirstBinding
import com.example.transitionanimation.modal.User

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        binding.butSecondFrag.setOnClickListener {

            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }


        binding.butThirdFrag.setOnClickListener {  //**safe Args**//

            val firstName = binding.etName.text.toString()
            val lastName = binding.etLastName.text.toString()
            val user = User(firstName, lastName)
            val action: NavDirections =
                FirstFragmentDirections.actionFirstFragmentToThirdFragment(user)
            findNavController().navigate(action)


        }                                                  //**safe Args**//

        return binding.root
    }

}