package com.example.Project_Android_app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by Kevin on 26/03/14.
 */
public class Tab4Fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        if(container==null){
            return null;
        }
        return (LinearLayout)inflater.inflate(R.layout.tab4fragment, container, false);
    }
}
