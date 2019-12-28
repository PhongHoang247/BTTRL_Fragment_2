package com.phong.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.phong.bttrl_fragment_2.R;
import com.phong.model.LienLac;

import java.util.ArrayList;

public class LienLacAdapter extends BaseAdapter {
    Context context;
    ArrayList<LienLac> lienLacs;
    LayoutInflater inflater;
    public LienLacAdapter(Context context, ArrayList<LienLac> lienLacs){
        this.context = context;
        this.lienLacs = lienLacs;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return lienLacs.size();
    }

    @Override
    public Object getItem(int i) {
        return lienLacs.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view == null){
            viewHolder = new ViewHolder();
            view = inflater.inflate(R.layout.item_listview,null);
            viewHolder.imgHinh = view.findViewById(R.id.imgHinh);
            viewHolder.txtTen = view.findViewById(R.id.txtTen);
            view.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) view.getTag();
        }
        LienLac lienLac = lienLacs.get(i);
        viewHolder.imgHinh.setImageResource(lienLac.getHinh());
        viewHolder.txtTen.setText(lienLac.getTen() + "");
        return view;
    }
    private class ViewHolder{
        public TextView txtTen;
        public ImageView imgHinh;
    }
}
