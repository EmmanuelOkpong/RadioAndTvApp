package com.example.abntvpassio945fm.ui.ConnectWithOAP

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.abntvpassio945fm.R

class ConnectWithOAPFragment : Fragment() {

    companion object {
        fun newInstance() = ConnectWithOAPFragment()
    }

    private lateinit var viewModel: ConnectWithOAViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_connect_with_o_a, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ConnectWithOAViewModel::class.java)
        // TODO: Use the ViewModel
    }

}