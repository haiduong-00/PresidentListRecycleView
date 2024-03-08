package com.example.presidentlistrecycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    List<President> presidentList;
    Context context;

    public RecyclerViewAdapter(List<President> presidentList, Context context) {
        this.presidentList = presidentList;
        this.context = context;
    }

    @NonNull
    // Create new views (invoked by the layout manager)
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_line_president, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_presName.setText(presidentList.get(position).getName());
        holder.tv_presElectionDate.setText(String.valueOf(presidentList.get(position).getDateOfElection())); // integer cannot be set as set text: integer -> string
        Glide.with(this.context).load(presidentList.get(position).getImageURL()).into(holder.iv_presPic);
    }

    @Override
    public int getItemCount() {
        return presidentList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_presPic;
        TextView tv_presName;
        TextView tv_presElectionDate;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_presPic = itemView.findViewById(R.id.iv_presidentPicture);
            tv_presName = itemView.findViewById(R.id.tv_presidentName);
            tv_presElectionDate = itemView.findViewById(R.id.tv_dateElection);
        }
    }
}
