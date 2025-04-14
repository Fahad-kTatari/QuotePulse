package com.fahad.quotepulse

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Button
import android.content.Context
import android.widget.Toast
import com.fahad.quotepulse.R // Import your R class


class InputFragment : Fragment() {

    // The 'someFunction' was outside the class. It needs to be inside if it's part of the Fragment's logic.
    // If it's a top-level function, it should be declared outside the class.
    // Assuming it belongs to the Fragment for now.
    fun someFunction(context: Context) {
        // Your function logic here
        Toast.makeText(context, "Some function called", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_input, container, false)

        val inputEditText = view.findViewById<EditText>(R.id.inputEditText)
        val generateButton = view.findViewById<Button>(R.id.generateButton)

        // 'context' here refers to the Fragment's context, which might be null initially.
        // It's safer to use 'requireContext()' after the Fragment is attached.
        generateButton.setOnClickListener {
            val moodText = inputEditText.text.toString()
            val prefs = requireActivity().getSharedPreferences("QuotePulsePrefs", Context.MODE_PRIVATE)
            prefs.edit().putString("user_mood", moodText).apply()
            Toast.makeText(requireContext(), "Mood saved!", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}