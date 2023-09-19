package com.example.navigationcomponentkullanimi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate( inflater, container, false)

        binding.buttonDetay.setOnClickListener {
           // binding.textViewAnasayfa.text = "Merhaba"
            val urun = Urunler(100, "TV")
            val gecis = AnasayfaFragmentDirections.detayGecis(ad = "Ahmet", yas = 23, boy = 1.78f, bekar = true, urun = urun)
            Navigation.findNavController(it).navigate(gecis)
        }

        binding.buttonGoster.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.bottomSheetGecis)

        }
        return binding.root
    }

    //Life cycle = Yaşam Döngüsü
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Yaşam Döngüsü", "onCreate")
        //Uygulama çalıştığında bir kere çalışır.
    }

    override fun onPause() {
        super.onPause()
        Log.e("Yaşam Döngüsü", "onCreate")
        //Sayfa görünmez olduğunda çalışır.
    }

    override fun onResume() {
        super.onResume()
        Log.e("Yaşam Döngüsü", "onCreate")
        //Sayfa görünür olduğunda çalışır
    }

}