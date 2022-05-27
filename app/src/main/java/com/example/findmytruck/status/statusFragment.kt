package com.example.findmytruck.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.findmytruck.databinding.StatusFragmentBinding

class StatusFragment : Fragment() {

    private lateinit var binding: StatusFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = StatusFragmentBinding.inflate(layoutInflater, container, false).apply {
        binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.speedIndicator.setProgressCompat(72, true)
        binding.speedIndicator2.setProgressCompat(60,true)
    }
}