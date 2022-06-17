package com.slfortuner.slbutterflydirectory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private final String TAG = "RecyclerView";
    private final Context mContext;
    private final ArrayList<Messages> messagesList;


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewFire;
        ImageView imageViewFire;



        public ViewHolder(@NonNull View itemView) {
            super( itemView );

            textViewFire = (TextView) itemView.findViewById( R.id.textViewFirebase);
            imageViewFire = (ImageView) itemView.findViewById( R.id.imageViewFirebase);

        }
    }


    public RecyclerAdapter(Context mContext, ArrayList<Messages> messagesList) {
        this.mContext = mContext;
        this.messagesList = messagesList;
    }



    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from( parent.getContext() )
                .inflate( R.layout.message_item, parent, false );

        return new ViewHolder( view );
    }

    @Override
    public void  onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textViewFire.setText( messagesList.get( position ).getArticle() );

        Glide.with(mContext).load(messagesList.get(position).getImageURL())
                .into(holder.imageViewFire);

    }

    @Override
    public int getItemCount() {
        return messagesList.size();
    }


}
