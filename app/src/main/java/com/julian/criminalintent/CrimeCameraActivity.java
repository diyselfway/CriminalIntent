package com.julian.criminalintent;

import android.app.Fragment;
import android.os.Bundle;

public class CrimeCameraActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeCameraFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }
}
