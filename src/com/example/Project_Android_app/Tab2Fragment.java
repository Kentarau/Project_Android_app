package com.example.Project_Android_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by Kevin on 26/03/14.
 */
public class Tab2Fragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        if(container==null){
            return null;
        }
        return (LinearLayout)inflater.inflate(R.layout.tab2fragment, container, false);
    }
}
