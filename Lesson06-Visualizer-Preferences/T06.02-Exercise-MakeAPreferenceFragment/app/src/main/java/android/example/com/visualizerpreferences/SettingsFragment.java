package android.example.com.visualizerpreferences;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by JR on 4/7/2018.
 */

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        // Done (5) In SettingsFragment's onCreatePreferences method add the preference file using the
        addPreferencesFromResource(R.xml.pref_visualizer);
    }
}