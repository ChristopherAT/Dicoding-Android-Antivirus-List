package com.dicoding.androidantivirus.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.androidantivirus.DetailActivity;
import com.dicoding.androidantivirus.R;
import com.dicoding.androidantivirus.model.Antivirus;

import java.util.ArrayList;

public class ListAntivirusAdapter extends RecyclerView.Adapter<ListAntivirusAdapter.ListViewHolder>{

    private Context context;
    private ArrayList<Antivirus> listAV;

    public ListAntivirusAdapter(ArrayList<Antivirus> list) {
       this.listAV = list;
    }
    //public ListAntivirusAdapter(Context context){
    //    this.context = context;
    //}

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_av, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Antivirus AV = listAV.get(position);

        Glide.with(holder.itemView.getContext())
                .load(AV.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(AV.getName());
        holder.tvDetail.setText(AV.getDetail());

        holder.itemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent moveDetail = new Intent(context, DetailActivity.class);
                moveDetail.putExtra("name",AV.getName());
                moveDetail.putExtra("detail",AV.getDetail());
                moveDetail.putExtra("country",AV.getCountry());
                moveDetail.putExtra("year",AV.getYear());
                moveDetail.putExtra("price",AV.getPrice());
                moveDetail.putExtra("photo",AV.getPhoto());
                context.startActivity(moveDetail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listAV.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        RelativeLayout itemList;
        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            itemList = itemView.findViewById(R.id.rl_item_list);
            context = itemList.getContext();
        }
    }
}
