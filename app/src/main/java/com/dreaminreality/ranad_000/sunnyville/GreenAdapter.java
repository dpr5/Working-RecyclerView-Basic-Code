package com.dreaminreality.ranad_000.sunnyville;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ranad_000 on 9/20/2017.
 */

public class GreenAdapter extends RecyclerView.Adapter<GreenAdapter.NumberViewHolder> {

    private int mNumberItems;

    public GreenAdapter(int numberOfItems) {
        mNumberItems = numberOfItems;
    }


    @Override
    public GreenAdapter.NumberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        int layoutForListItem = R.layout.number_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAtachToParentImmediately = false;

        View view = inflater.inflate(layoutForListItem, parent, shouldAtachToParentImmediately);
        NumberViewHolder viewHolder = new NumberViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(GreenAdapter.NumberViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }


    class NumberViewHolder extends RecyclerView.ViewHolder {

        TextView listItemNumberView;

        public NumberViewHolder(View itemView) {
            super(itemView);

            listItemNumberView = (TextView) itemView.findViewById(R.id.tv_item_number);
        }

        void bind(int listIndex) {
            listItemNumberView.setText(String.valueOf(listIndex));
        }
    }
}
