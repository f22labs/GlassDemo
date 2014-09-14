package com.example.hariharasudhan.glassfirst;

import android.view.View;
import android.view.ViewGroup;

import com.google.android.glass.widget.CardBuilder;
import com.google.android.glass.widget.CardScrollAdapter;

import java.util.List;



/**
 * Created by hariharasudhan on 13/09/14.
 */
public class EventAdapter extends CardScrollAdapter {

    private List<CardBuilder> mCards;
    private List<com.example.hariharasudhan.glassfirst.EventModel> mData;
    public EventAdapter(List<CardBuilder> cards){
        this.mCards = cards;
    }
    @Override
    public int getCount() {
        return mCards.size();
    }

    @Override
    public Object getItem(int position) {
        return mCards.indexOf(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return mCards.get(position).getView(convertView, parent);
    }

    @Override
    public int getPosition(Object item) {
        return mCards.indexOf(item);
    }

    @Override
    public int getViewTypeCount() {
        return CardBuilder.getViewTypeCount();
    }

    @Override
    public int getItemViewType(int position){
        return mCards.get(position).getItemViewType();
    }
}
