package com.slfortuner.slbutterflydirectory.u42;


import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.slfortuner.slbutterflydirectory.R;


public class Photos_42_Fragment extends Fragment {

    View v;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, @Nullable Bundle savedInstanceState) {
        return inflater.inflate( R.layout.photos42fragment, viewGroup, false);
    }
}


