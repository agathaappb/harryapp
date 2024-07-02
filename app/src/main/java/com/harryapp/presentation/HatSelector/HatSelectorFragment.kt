package com.harryapp.presentation.HatSelector

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.harryapp.R
import com.harryapp.databinding.FragmentHatSelectorBinding


class HatSelectorFragment : Fragment(R.layout.fragment_hat_selector) {

     private lateinit var binding: FragmentHatSelectorBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.background_default)
        binding = FragmentHatSelectorBinding.inflate(inflater, container, false)
        return binding.root
    }



    companion object {
        fun newInstance() = HatSelectorFragment()
    }
}