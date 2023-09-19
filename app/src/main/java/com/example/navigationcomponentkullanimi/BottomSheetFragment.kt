package com.example.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponentkullanimi.databinding.FragmentBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.snackbar.Snackbar


class BottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentBottomSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBottomSheetBinding.inflate(inflater, container, false)

        binding.imageViewKopyala.setOnClickListener{
            Snackbar.make(it, "Kopyalandı", Snackbar.LENGTH_SHORT).show()
        }

        binding.imageViewPaylas.setOnClickListener{
            Snackbar.make(it, "Paylaşıldı", Snackbar.LENGTH_SHORT).show()
        }
        return binding.root
    }

}