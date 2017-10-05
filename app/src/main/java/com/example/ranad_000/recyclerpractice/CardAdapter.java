package com.example.ranad_000.recyclerpractice;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by ranad_000 on 9/20/2017.
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.NumberViewHolder> {

    private List<Data_for_Cards> data;
    final private RecyclerViewClickListener mOnClickListener;
    private static int viewHolderCount;


    //****+++++++++++++++++++++++++++++constructor+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public CardAdapter(List<Data_for_Cards> data, RecyclerViewClickListener listener) {
        this.data = data;
        mOnClickListener = listener;
        viewHolderCount = 0;
    }


    //===============================================================================================================


    class NumberViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView text;
        public ImageView image;

        public NumberViewHolder(View itemView) {
            super(itemView);

            text = (TextView) itemView.findViewById(R.id.card_title);
            image = (ImageView) itemView.findViewById(R.id.card_image);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            mOnClickListener.onListItemClick(clickedPosition);
        }
    }


    @Override
    public NumberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.cardlayout;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        NumberViewHolder viewHolder = new NumberViewHolder(view);

        //View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout, parent, false);
        return new CardAdapter.NumberViewHolder(view);

    }


    @Override
    public void onBindViewHolder(CardAdapter.NumberViewHolder holder, int position) {
        Data_for_Cards card_for_nutrition = data.get(position);
        holder.text.setText(card_for_nutrition.getTitle());
        holder.image.setImageResource(card_for_nutrition.getImageID());

        Log.d(TAG, "#" + position);

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

}
