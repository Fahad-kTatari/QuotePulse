package com.fahad.quotepulse

object QuoteGenerator {

    private val motivationalQuotes = listOf(
        "Believe in yourself!",
        "Push through the pain. It’s worth it.",
        "Every day is a new beginning."
    )

    private val poeticQuotes = listOf(
        "In the depth of winter, I found my summer soul.",
        "The moon whispered secrets only the stars knew.",
        "Your silence sings louder than thunder."
    )

    private val funnyQuotes = listOf(
        "I’m not lazy, I’m just on energy-saving mode.",
        "404: Motivation not found.",
        "Life is short. Smile while you still have teeth."
    )

    private val deepQuotes = listOf(
        "We are just stardust with stories to tell.",
        "Time is an illusion; only memories are real.",
        "The mind is its own universe."
    )

    fun getQuote(style: String): String {
        return when (style.lowercase()) {
            "motivational" -> motivationalQuotes.random()
            "poetic" -> poeticQuotes.random()
            "funny" -> funnyQuotes.random()
            "deep" -> deepQuotes.random()
            else -> "Let your heart speak. The words will follow."
        }
    }
}
