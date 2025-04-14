package com.fahad.quotepulse

import android.content.Context
import android.os.Bundle
import android.view.*
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class QuoteFragment : Fragment() {

    private lateinit var quoteTextView: TextView
    private lateinit var generateBtn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_quote, container, false)

        quoteTextView = view.findViewById(R.id.generatedQuoteText)
        generateBtn = view.findViewById(R.id.generateQuoteButton)

        generateBtn.setOnClickListener {
            displayQuoteWithAnimation()
        }

        return view
    }

    private fun displayQuoteWithAnimation() {
        val prefs = requireActivity().getSharedPreferences("QuotePulsePrefs", Context.MODE_PRIVATE)
        val selectedStyle = prefs.getString("quote_style", "motivational") ?: "motivational"

        val quote = QuoteGenerator.getQuote(selectedStyle)
        quoteTextView.text = quote

        val fadeIn = AlphaAnimation(0f, 1f)
        fadeIn.duration = 800
        quoteTextView.startAnimation(fadeIn)
    }
}
