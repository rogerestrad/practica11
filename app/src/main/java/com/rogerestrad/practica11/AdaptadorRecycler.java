package com.rogerestrad.practica11;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class AdaptadorRecycler extends
        RecyclerView.Adapter<AdaptadorRecycler.ViewHolderArtista> {
    private final Context context;
    private List<Artista> datos;

    public AdaptadorRecycler(Context context, List<Artista> datos) {
        this.context = context;
        this.datos = datos;
    }

    @Override
    public ViewHolderArtista onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).
        inflate(R.layout.item_recicler, parent,false);
        return new ViewHolderArtista(v);
    }
    @Override
    public void onBindViewHolder(ViewHolderArtista holder, int position) {
        Artista artista=datos.get(position);
        holder.txtnombre.setText(artista.getName());
        holder.txtTelefono.setText(artista.getPhone());
        holder.ratingBar.setRating(artista.getRating());
        if (artista.ChecarImagen()){
            //hacer algo
        }else{
            holder.CImage.setImageResource((R.drawable.asd));
        }
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolderArtista extends RecyclerView.ViewHolder
    {
        @BindView(R.id.nombre_artista)
        TextView txtnombre;
        @BindView(R.id.rating)
        RatingBar ratingBar;
        @BindView(R.id.telefono)
        TextView  txtTelefono;
        @BindView(R.id.avatar)
        CircleImageView CImage;


        public ViewHolderArtista(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
