import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.fahad.quotepulse.InputFragment
import com.fahad.quotepulse.QuoteFragment
import com.fahad.quotepulse.PreferencesFragment
import com.fahad.quotepulse.InfoFragment

class ViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 4  // Number of fragments

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> InputFragment()         // First fragment
            1 -> QuoteFragment()         // Second fragment
            2 -> PreferencesFragment()   // Third fragment
            3 -> InfoFragment()          // Fourth fragment
            else -> InputFragment()      // Default fragment
        }
    }
}
