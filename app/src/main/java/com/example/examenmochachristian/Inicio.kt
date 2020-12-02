package com.example.examenmochachristian

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.examenmochachristian.databinding.FragmentInicioBinding


class Inicio : Fragment() {

    private lateinit var binding: FragmentInicioBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_inicio, container, false)

        return binding.root
    }


}