package com.fahad.quotepulse

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

class PreferencesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_preferences, container, false)

        val spinner = view.findViewById<Spinner>(R.id.styleSpinner)
        val saveBtn = view.findViewById<Button>(R.id.savePrefButton)

        val styles = arrayOf("motivational", "poetic", "funny", "deep")
        spinner.adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, styles)

        saveBtn.setOnClickListener {
            val prefs = requireActivity().getSharedPreferences("QuotePulsePrefs", Context.MODE_PRIVATE)
            prefs.edit().putString("quote_style", spinner.selectedItem.toString()).apply()
            Toast.makeText(context, "Style saved!", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
