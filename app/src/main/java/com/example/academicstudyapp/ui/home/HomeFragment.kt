package com.example.academicstudyapp.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.academicstudyapp.FinalYear.finalYHome
import com.example.academicstudyapp.FirstYear.fyHome
import com.example.academicstudyapp.R
import com.example.academicstudyapp.SecondYear.syHome
import com.example.academicstudyapp.ThirdYear.tyHome
import com.example.academicstudyapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val openActivityButton = root?.findViewById<Button>(R.id.firstyear)

        // Set an OnClickListener to handle the click
        openActivityButton?.setOnClickListener {
            // Create an Intent to open the Activity
            val intent = Intent(activity, fyHome::class.java)
            startActivity(intent)
        }
        val openActivityButton1 = root?.findViewById<Button>(R.id.secondyear)

        // Set an OnClickListener to handle the click
        openActivityButton1?.setOnClickListener {
            // Create an Intent to open the Activity
            val intent = Intent(activity, syHome::class.java)
            startActivity(intent)
        }
        val openActivityButton2 = root?.findViewById<Button>(R.id.thirdyear)

        // Set an OnClickListener to handle the click
        openActivityButton2?.setOnClickListener {
            // Create an Intent to open the Activity
            val intent = Intent(activity, tyHome::class.java)
            startActivity(intent)
        }
        val openActivityButton3 = root?.findViewById<Button>(R.id.finalyear)

        // Set an OnClickListener to handle the click
        openActivityButton3?.setOnClickListener {
            // Create an Intent to open the Activity
            val intent = Intent(activity, finalYHome::class.java)
            startActivity(intent)
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}