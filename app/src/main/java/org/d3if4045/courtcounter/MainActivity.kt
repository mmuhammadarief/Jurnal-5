package org.d3if4045.courtcounter


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import org.d3if4045.courtcounter.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil



class MainActivity : AppCompatActivity() {


    private var nilaiA = 0
    private var nilaiB = 0
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        if (savedInstanceState!=null){

            nilaiA = savedInstanceState.getInt("nilai_A_key",0)
            nilaiB = savedInstanceState.getInt("nilai_B_key",0)
        }
            binding.nilaiA.text = "$nilaiA"
            binding.nilaiB.text = "$nilaiB"

        binding.btnPlus3A.setOnClickListener {
            nilaiA += 3
            binding.nilaiA.text="$nilaiA"
        }

        binding.btnPlusA.setOnClickListener {
            nilaiA +=2
            binding.nilaiA.text="$nilaiA"
        }

        binding.btnFreethrowA2.setOnClickListener {
            nilaiA +=1
            binding.nilaiA.text="$nilaiA"
        }


        binding.btnPlus3B.setOnClickListener {
            nilaiB += 3
            binding.nilaiB.text="$nilaiB"
        }

        binding.btnPlus2B.setOnClickListener {
            nilaiB += 2
            binding.nilaiB.text="$nilaiB"
        }

        binding.btnFreethrowB.setOnClickListener {
            nilaiB +=1
            binding.nilaiB.text="$nilaiB"
        }


        binding.btnReset.setOnClickListener {
            nilaiA +=0
            binding.nilaiA.text="0"
            nilaiB +=0
            binding.nilaiB.text="0"
        }



    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("nilai_A_key",nilaiA)
        outState.putInt("nilai_B_key",nilaiB)
        super.onSaveInstanceState(outState)
    }


}
