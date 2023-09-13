package com.example.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentkullanimi.databinding.FragmentDetayBinding
import com.google.android.material.snackbar.Snackbar

class DetayFragment : Fragment() {

    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetayBinding.inflate(inflater, container, false)

        val bundle: DetayFragmentArgs by navArgs()
        val gelenAd = bundle.ad
        val gelenYas = bundle.yas
        val gelenBoy = bundle.boy
        val gelenBekar = bundle.bekar
        val urunId = bundle.urun.id
        val urunAd = bundle.urun.ad

      binding.textViewBilgi.text = "$gelenAd - $gelenYas - $gelenBoy - $gelenBekar - $urunAd - $urunId"

        val geriTusu = object : OnBackPressedCallback(true){//true: geri dönüş aktif değil
            override fun handleOnBackPressed() {
                Snackbar.make(binding.textViewBilgi, "Geri dönmek istiyor musunuz?", Snackbar.LENGTH_SHORT)
                    .setAction("EVET"){
                        isEnabled = false
                        requireActivity().onBackPressedDispatcher.onBackPressed()
                    }.show()

            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, geriTusu)
        return binding.root
    }

}