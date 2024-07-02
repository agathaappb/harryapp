package com.harryapp.presentation.HatSelector

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.harryapp.R
import com.harryapp.databinding.FragmentHatSelectorBinding
import org.koin.androidx.viewmodel.ext.android.viewModel


class HatSelectorFragment : Fragment(R.layout.fragment_hat_selector) {

     private lateinit var binding: FragmentHatSelectorBinding
     private val viewModel: HatSelectorViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.background_default)
        binding = FragmentHatSelectorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.hatSelectorBtn.setOnClickListener {
            viewModel.selectorHat()
        }

        viewModel.selectorHouse.observe(viewLifecycleOwner, Observer {
            binding.hatSelectorImgHouse.setImageResource(it)
        })

    }



    companion object {
        fun newInstance() = HatSelectorFragment()
    }
}