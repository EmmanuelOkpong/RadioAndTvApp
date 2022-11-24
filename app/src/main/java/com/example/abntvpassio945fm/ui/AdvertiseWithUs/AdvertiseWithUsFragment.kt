package com.example.abntvpassio945fm.ui.AdvertiseWithUs

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.abntvpassio945fm.R

class AdvertiseWithUsFragment : Fragment() {

    companion object {
        fun newInstance() = AdvertiseWithUsFragment()
    }

    private lateinit var viewModel: AdvertiseWithUsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_advertise_with_us, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AdvertiseWithUsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}