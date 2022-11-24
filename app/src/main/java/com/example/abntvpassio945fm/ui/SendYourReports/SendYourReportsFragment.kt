package com.example.abntvpassio945fm.ui.SendYourReports

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.abntvpassio945fm.R

class SendYourReportsFragment : Fragment() {

    companion object {
        fun newInstance() = SendYourReportsFragment()
    }

    private lateinit var viewModel: SendYourReportsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_send_your_reports, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SendYourReportsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}