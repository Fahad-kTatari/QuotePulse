package com.fahad.quotepulse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import ViewPagerAdapter as ViewPagerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val adapter = ViewPagerAdapter(this)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Input"
                1 -> "Quote"
                2 -> "Preferences"
                3 -> "Info"
                else -> ""
            }
        }.attach()
    }
}
