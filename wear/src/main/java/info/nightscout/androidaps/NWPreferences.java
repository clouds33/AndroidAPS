package info.nightscout.androidaps;


import android.os.Bundle;
import android.preference.PreferenceActivity;

import info.nightscout.androidaps.R;
import preference.WearPreferenceActivity;

public class NWPreferences extends WearPreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }

}