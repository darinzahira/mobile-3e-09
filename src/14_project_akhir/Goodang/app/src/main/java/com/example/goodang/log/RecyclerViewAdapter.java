package com.example.goodang.log;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.goodang.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    Context mContext;
    List<LogActivities> mData;

    public RecyclerViewAdapter(Context mContext, List<LogActivities> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_log, parent, false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_namalog.setText(mData.get(position).getNama_log());
        holder.tv_namabarang.setText(mData.get(position).getNama_barang());
        holder.tv_tanggal.setText(mData.get(position).getTanggal());
        holder.img.setImageResource(mData.get(position).getIcon());

    }

    @Override
    public int getItemCount() {

        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_namalog;
        private TextView tv_namabarang;
        private ImageView img;
        private TextView tv_tanggal;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_namalog = (TextView)itemView.findViewById(R.id.nama_log);
            tv_namabarang = (TextView)itemView.findViewById(R.id.nama_barang);
            tv_tanggal = (TextView)itemView.findViewById(R.id.tanggal_log);
            img = (ImageView) itemView.findViewById(R.id.img_log);
        }
    }
}
