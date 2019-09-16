package com.sss.admin.balajitrust.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.sss.admin.balajitrust.gallery_details_activity.GalleryDetailsActivity;
import com.sss.admin.balajitrust.R;
import com.sss.admin.balajitrust.model.row;

import java.util.ArrayList;
import java.util.List;

public class StaggeredRecyclerviewAdapter extends RecyclerView.Adapter<StaggeredRecyclerviewAdapter.ImageviewHolder> {

    Context mContext;
    ArrayList<row> mData;

    public StaggeredRecyclerviewAdapter(Context mContext, ArrayList<row> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ImageviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mContext).inflate(R.layout.row_item,parent,false);
        return new ImageviewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageviewHolder holder, int position) {
        /*//bind the images here
        holder.img.setImageResource(mData.get(position).getImg());*/

        //get image url here
        Glide.with(mContext).load(mData.get(position).getImg()).into(holder.img);

        //click listener for new activity 12-09-2019
        final row row=mData.get(position);
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mContext, GalleryDetailsActivity.class);
                intent.putExtra("image",row.getImg());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ImageviewHolder extends RecyclerView.ViewHolder{

        ImageView img;

        public ImageviewHolder(@NonNull View itemView) {
            super(itemView);

            img=itemView.findViewById(R.id.row_image);
        }
    }
}
