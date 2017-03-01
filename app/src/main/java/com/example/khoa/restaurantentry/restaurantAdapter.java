package com.example.khoa.restaurantentry;

import java.util.List;
import java.util.Objects;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


//Adapter used to handle data when it is changed
public class restaurantAdapter extends BaseAdapter  {
    private Context listContext;
    private List<restaurantData> listRestaurant;

    public restaurantAdapter(Context context, List<restaurantData> list)
    {
        listContext = context;
        listRestaurant = list;
    }

    @Override
    public int getCount()
    {
        return listRestaurant.size();
    }

    @Override
    public Object getItem(int pos)
    {
        return listRestaurant.get(pos);
    }

    @Override
    public long getItemId(int pos){
        return pos;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent){
        restaurantData entry = listRestaurant.get(pos);

        ImageView pictures = (ImageView) convertView.findViewById(R.id.getImage);
        pictures.setImageBitmap(entry.getPicture());

        TextView tvName = (TextView)convertView.findViewById(R.id.restName);
        tvName.setText(entry.getName());

        TextView tvCity = (TextView)convertView.findViewById(R.id.cityName);
        tvCity.setText(entry.getCity());

        return convertView;
    }




}
