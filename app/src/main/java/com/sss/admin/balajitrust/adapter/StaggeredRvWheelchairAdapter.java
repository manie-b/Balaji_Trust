package com.sss.admin.balajitrust.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sss.admin.balajitrust.R;
import com.sss.admin.balajitrust.model.RowItem_Wheelchair;

import java.util.ArrayList;

public class StaggeredRvWheelchairAdapter extends RecyclerView.Adapter<StaggeredRvWheelchairAdapter.ImageviewHolder> {

    Context mContext;
    ArrayList<RowItem_Wheelchair> mData;

    public StaggeredRvWheelchairAdapter(Context mContext, ArrayList<RowItem_Wheelchair> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ImageviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mContext).inflate(R.layout.row_item_wheelchair,parent,false);
        return new ImageviewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageviewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ImageviewHolder extends RecyclerView.ViewHolder{
        public ImageviewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
