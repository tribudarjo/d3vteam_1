package com.d3vteam.looking.activity;

/**
 * Created by DITA on 30/05/2017.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.d3vteam.looking.R;

import java.util.ArrayList;
import java.util.List;

 public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder>  {


     List<EndangeredItem> mItems;

     public GridAdapter() {
         super();
         mItems = new ArrayList<EndangeredItem>();
         EndangeredItem nama = new EndangeredItem();
         nama.setName("Argon");
         nama.setThumbnail(R.drawable.mobil);
         mItems.add(nama);

         nama = new EndangeredItem();
         nama.setName("Alkana");
         nama.setThumbnail(R.drawable.mobil2);
         mItems.add(nama);

         nama = new EndangeredItem();
         nama.setName("Helium");
         nama.setThumbnail(R.drawable.mobil3);
         mItems.add(nama);


     }

     @Override
     public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
         View v = LayoutInflater.from(viewGroup.getContext())
                 .inflate(R.layout.grid_view, viewGroup, false);
         ViewHolder viewHolder = new ViewHolder(v);
         return viewHolder;
     }

     @Override
     public void onBindViewHolder(ViewHolder viewHolder, int i) {
         EndangeredItem nature = mItems.get(i);
         viewHolder.tvspecies.setText(nature.getName());
         viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
     }

     @Override
     public int getItemCount() {

         return mItems.size();
     }

     class ViewHolder extends RecyclerView.ViewHolder  {


         public ImageView imgThumbnail;
         public TextView tvspecies;

         public ViewHolder(View itemView) {
             super(itemView);
             imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
             tvspecies = (TextView)itemView.findViewById(R.id.status);

         }
     }
 }








