package com.example.abntvpassio945fm.ui.ProgramSchedule

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.abntvpassio945fm.R

class ProgramScheduleFragment : Fragment() {

    companion object {
        fun newInstance() = ProgramScheduleFragment()
    }

    private lateinit var viewModel: ProgramScheduleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_program_schedule, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProgramScheduleViewModel::class.java)
        // TODO: Use the ViewModel
    }

}