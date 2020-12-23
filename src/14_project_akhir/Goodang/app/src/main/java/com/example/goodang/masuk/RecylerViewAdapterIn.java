package com.example.goodang.masuk;

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

public class RecylerViewAdapterIn extends RecyclerView.Adapter<RecylerViewAdapterIn.MyHolder>{

    Context mContext;
    List<Masuk> mData;

    public RecylerViewAdapterIn(Context mContext, List<Masuk> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_masuk, parent, false);
        RecylerViewAdapterIn.MyHolder vHolder = new RecylerViewAdapterIn.MyHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        holder.nama.setText(mData.get(position).getNama());
        holder.kode.setText(mData.get(position).getKode());
        holder.deskripsi.setText(mData.get(position).getDeskripsi());
        holder.jmlh.setText(mData.get(position).getJmlh());
        holder.tanggal.setText(mData.get(position).getTanggal());
        holder.gambar.setImageResource(mData.get(position).getGambar());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder{

        private TextView nama;
        private TextView kode;
        private TextView deskripsi;
        private TextView jmlh;
        private TextView tanggal;
        private ImageView gambar;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            nama = (TextView)itemView.findViewById(R.id.nama_in);
            kode = (TextView)itemView.findViewById(R.id.kode_in);
            deskripsi = (TextView)itemView.findViewById(R.id.des_in);
            jmlh = (TextView)itemView.findViewById(R.id.stok_in);
            tanggal = (TextView)itemView.findViewById(R.id.tanggal_in);
            gambar = (ImageView) itemView.findViewById(R.id.img_in);
        }
    }

}
