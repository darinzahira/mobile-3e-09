package com.example.goodang.produk;

import android.app.Dialog;
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

public class RecyclerViewAdapterPro extends RecyclerView.Adapter<RecyclerViewAdapterPro.MyHolder> {

    Context mContext;
    List<Produk> mData;
    Dialog mDialog;

    public RecyclerViewAdapterPro(Context mContext, List<Produk> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_produk, parent, false);
        RecyclerViewAdapterPro.MyHolder vHolder = new RecyclerViewAdapterPro.MyHolder(v);

        mDialog = new Dialog(mContext);
        mDialog.setContentView(R.layout.detail_produk);

        vHolder.detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView nama_produk = (TextView) mDialog.findViewById(R.id.nama_det);
                TextView kode_produk = (TextView) mDialog.findViewById(R.id.kode_det);
                TextView stok_produk = (TextView) mDialog.findViewById(R.id.jmlh_detail);
                TextView harga_produk = (TextView) mDialog.findViewById(R.id.harga_detail);
                TextView des_produk = (TextView) mDialog.findViewById(R.id.des_detail);
                ImageView img_produk = (ImageView) mDialog.findViewById(R.id.img_det);
                ImageView close = (ImageView) mDialog.findViewById(R.id.close);

                nama_produk.setText(mData.get(vHolder.getAdapterPosition()).getNama());
                kode_produk.setText(mData.get(vHolder.getAdapterPosition()).getKode());
                stok_produk.setText(mData.get(vHolder.getAdapterPosition()).getStok());
                harga_produk.setText(mData.get(vHolder.getAdapterPosition()).getHarga());
                des_produk.setText(mData.get(vHolder.getAdapterPosition()).getDeskripsi());
                img_produk.setImageResource(mData.get(vHolder.getAdapterPosition()).getGambar());

                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mDialog.hide();
                    }
                });

                mDialog.show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        holder.nama.setText(mData.get(position).getNama());
        holder.kode.setText(mData.get(position).getKode());
        holder.deskripsi.setText(mData.get(position).getDeskripsi());
        holder.stok.setText(mData.get(position).getStok());
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
        private TextView stok;
        private ImageView gambar;
        private ImageView detail;
        private ImageView tambah;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            nama = (TextView)itemView.findViewById(R.id.nama_produk);
            kode = (TextView)itemView.findViewById(R.id.kode_produk);
            deskripsi = (TextView)itemView.findViewById(R.id.des_produk);
            stok = (TextView)itemView.findViewById(R.id.stok_produk);
            gambar = (ImageView) itemView.findViewById(R.id.img_pro);
            detail = (ImageView)itemView.findViewById(R.id.detail_icon);
            tambah = (ImageView)itemView.findViewById(R.id.tambah_produk);
        }
    }
}
