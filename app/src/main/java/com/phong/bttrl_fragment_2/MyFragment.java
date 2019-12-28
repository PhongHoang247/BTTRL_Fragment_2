package com.phong.bttrl_fragment_2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.phong.adapter.LienLacAdapter;
import com.phong.model.LienLac;

import java.util.ArrayList;

public class MyFragment extends Fragment {
    private ArrayList<LienLac> lienLacs;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_fragment,null);
        //TabHost:
        TabHost tabHost = view.findViewById(R.id.tabHost);
        tabHost.setup();
        TabHost.TabSpec tab1 = tabHost.newTabSpec("t1");
        tab1.setContent(R.id.tab1);
        tab1.setIndicator("All contacts");
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2 = tabHost.newTabSpec("t2");
        tab2.setContent(R.id.tab2);
        tab2.setIndicator("Favourites");
        tabHost.addTab(tab2);

        TabHost.TabSpec tab3 = tabHost.newTabSpec("t3");
        tab3.setContent(R.id.tab3);
        tab3.setIndicator("Groups");
        tabHost.addTab(tab3);
        //ListView:
        ListView lvLienLac = view.findViewById(R.id.lvLienLac);
        lienLacs = new ArrayList<>();
        lienLacs.add(new LienLac("Phong",R.mipmap.ic_launcher));
        lienLacs.add(new LienLac("Tom",R.mipmap.ic_launcher));
        lienLacs.add(new LienLac("Phan Anh",R.mipmap.ic_launcher));
        lienLacs.add(new LienLac("Mạnh",R.mipmap.ic_launcher));
        lienLacs.add(new LienLac("Nguyên",R.mipmap.ic_launcher));
        lienLacs.add(new LienLac("Linh",R.mipmap.ic_launcher));
        ListAdapter adapter = new LienLacAdapter(getActivity(),lienLacs);
        lvLienLac.setAdapter(adapter);
        return view;
    }
}
