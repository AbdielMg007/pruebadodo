package com.mg.pruebadodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.mg.pruebadodo.databinding.ActivityProductoBinding

class producto : AppCompatActivity() {

    private lateinit var binding: ActivityProductoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        incellFragment()
        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.or -> replaceFragment(orFragment())
                R.id.incell -> replaceFragment(incellFragment())

                else ->{

                }
            }
            true
        }

    }


    private fun replaceFragment(fragment: Fragment){
        val fragmentMager = supportFragmentManager
        val fragmentTrasaction = fragmentMager.beginTransaction()
        fragmentTrasaction.replace(R.id.fragmentNav, fragment)
        fragmentTrasaction.commit()
    }
}