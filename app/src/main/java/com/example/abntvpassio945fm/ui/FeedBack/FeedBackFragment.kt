package com.example.abntvpassio945fm.ui.FeedBack

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.abntvpassio945fm.R

class FeedBackFragment : Fragment() {

    companion object {
        fun newInstance() = FeedBackFragment()
    }

    private lateinit var viewModel: FeedBackViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feed_back, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FeedBackViewModel::class.java)
        // TODO: Use the ViewModel
    }

}