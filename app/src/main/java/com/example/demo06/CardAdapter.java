package com.example.demo06;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import java.util.ArrayList;
import java.util.List;

public class CardAdapter extends BaseAdapter {
    List<Card> cardList;
    Context context;

    public CardAdapter(List<Card> cardList) {
        this.cardList = cardList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return cardList.size();
    }

    @Override
    public Object getItem(int i) {
        return cardList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.card_view, viewGroup,false);
        TextView name = v.findViewById(R.id.Textview_01);
        TextView nation = v.findViewById(R.id.Textview_02);
        TextView name1 = v.findViewById(R.id.textSubcribe);
        TextView name2 = v.findViewById(R.id.textLike);
        TextView name3 = v.findViewById(R.id.textFollow);
        TextView number1 = v.findViewById(R.id.textview_number1);
        TextView number2 = v.findViewById(R.id.textview_number2);
        TextView number3 = v.findViewById(R.id.textview_number3);

        Card card = cardList.get(i);
        name.setText(card.getName());
        nation.setText(card.getAddress());
        name1.setText(card.getName1());
        name2.setText(card.getName2());
        name3.setText(card.getName3());
        number1.setText(String.valueOf(card.getNumber1()));
        number2.setText(String.valueOf(card.getNumber2()));
        number3.setText(String.valueOf(card.getNumber3()));
        ImageView imageView3cham = v.findViewById(R.id.Imageview_3cham);
        if (card.isIcon1()) imageView3cham.setImageResource(R.drawable.bacham);
        ImageView imageViewhome = v.findViewById(R.id.Imageview_icon);
        if (card.isIcon2()) imageViewhome.setImageResource(R.drawable.home);
        ImageView imageViewhinh = v.findViewById(R.id.Imageview_Hinh);
        imageViewhinh.setImageResource(card.getHinhAnh());
        LinearLayout linearLayout = v.findViewById(R.id.cardview);
        linearLayout.setBackgroundResource(card.getNen());
        return v;
    }
}
