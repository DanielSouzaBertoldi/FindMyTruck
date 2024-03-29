package com.example.findmytruck.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.findmytruck.databinding.ProfileFragmentBinding

class ProfileFragment : Fragment() {

   private lateinit var binding: ProfileFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = ProfileFragmentBinding.inflate(layoutInflater, container, false).apply {
       binding = this
    }.root
}