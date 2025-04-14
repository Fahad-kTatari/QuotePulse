package com.fahad.quotepulse

import android.app.AlertDialog
import android.os.Bundle
import android.view.*
import android.widget.Button
import androidx.fragment.app.Fragment

class InfoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_info, container, false)

        val aboutBtn = view.findViewById<Button>(R.id.aboutButton)
        aboutBtn.setOnClickListener {
            showInfoDialog()
        }

        return view
    }

    private fun showInfoDialog() {
        AlertDialog.Builder(requireContext())
            .setTitle("QuotePulse Info")
            .setMessage("This app uses your mood or input to find or generate quotes that match your vibe. It adds visual animations and lets you save your favorite styles.\n\n✨ Inspired by art, emotion, and words.")
            .setPositiveButton("Got it!") { dialog, _ -> dialog.dismiss() }
            .show()
    }
}
