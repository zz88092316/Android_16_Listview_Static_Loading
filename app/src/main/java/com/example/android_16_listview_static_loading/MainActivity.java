package com.example.android_16_listview_static_loading;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private TextView txt_ItemSelect;
    private ListView lsv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_ItemSelect = (TextView) findViewById(R.id.txt_ItemSelect);
        lsv_main = (ListView) findViewById(R.id.lsv_main);
        lsv_main.setOnItemClickListener(listViewRegionOnItemClick);
    }

    private AdapterView.OnItemClickListener listViewRegionOnItemClick
            = new AdapterView.OnItemClickListener()
    {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id)
        {
            txt_ItemSelect.setText("您選擇了: " + ((TextView) view).getText());
        }
    };
}