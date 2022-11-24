package com.example.abntvpassio945fm.ui.LiveRadio

import android.content.Context
import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.abntvpassio945fm.R
import com.example.abntvpassio945fm.databinding.FragmentRadioBinding


class RadioFragment : Fragment() {
lateinit var play:ImageView
lateinit var stop:ImageView
lateinit var pause:ImageView
lateinit var mplayer:MediaPlayer}
//lateinit var binding: FragmentRadioBinding
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//       binding= FragmentRadioBinding.inflate(inflater)
//
//        binding.playId
//
//        binding.playId
//        binding.pauseId
//       binding.stopId
//
//        RadioZone()
//        return binding.root
//
//    }
//
//    fun RadioZone(){
//        val Url="http://radio.garden/visit/mansa/JkIh1LJg"
//        mplayer= MediaPlayer()
//        mplayer.setDataSource(Url)
//        mplayer.setAudioStreamType(AudioManager.STREAM_MUSIC)
//        mplayer.prepareAsync()
//        mplayer.setOnPreparedListener{
//            Play()
//        }
//
//    }
//    fun Play(){
//        play.setOnClickListener{
//            mplayer.start()
//            Toast.makeText(context,"Play",Toast.LENGTH_SHORT)
//        }
//        pause.setOnClickListener{
//            mplayer.pause()
//            Toast.makeText(context,"Play",Toast.LENGTH_SHORT)
//        }
//
//
//    }
//
//}