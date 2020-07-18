package com.example.demo06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    List<Card> cardList;
    CardAdapter adapter;
    Card PhanDuyAnh, HuongLy, Erik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /////hàm khởi tạo list
        cardList = new ArrayList<>();
        listview = findViewById(R.id.listview1);
        PhanDuyAnh = new Card("Ca Sĩ : Phan Duy Anh","Hà Nội","Subcribe","Like","Follow","2345","1222","433",R.drawable.phanduyanh,R.drawable.bg1,true,true);
        HuongLy = new Card("Ca Sĩ: Hương Ly","Hà Nội","Subcribe","Like","Follow","4455","122","355",R.drawable.huongly,R.drawable.bg2,true,true);
        Erik = new Card("Ca Sĩ: ERik","Hà Nội","Subcribe","Like","Follow","5676","122","231",R.drawable.erik,R.drawable.bg3,true,true);

        cardList.add(PhanDuyAnh);
        cardList.add(HuongLy);
        cardList.add(Erik);


        adapter = new CardAdapter(cardList);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(),cardList.get(i).getName(),Toast.LENGTH_LONG).show();
            }
        });
    }
}