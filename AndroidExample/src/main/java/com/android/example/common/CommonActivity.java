package com.android.example.common;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.android.example.R;
import com.android.example.main.BaseActivity;

/**
 * 描述：CommonActivity
 * Created by Administrator on 2016/1/13 0013.
 */
public class CommonActivity extends BaseActivity {
    private TextView title;
    private CommonAdapter adapter;
    private ImageView icon_back;
    private ListView listView;
    private int myTitle = R.string.test_character;
    private MyData myData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commen_activity_layout);
        initView();
        initData();
    }

    @Override
    public void initView() {
        icon_back = (ImageView) findViewById(R.id.icon_back);
        icon_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBack();
            }
        });
        title = (TextView) findViewById(R.id.title);
        listView = (ListView) findViewById(R.id.listView);
    }

    @Override
    public void initData() {
        if (getIntent() != null && getIntent().getExtras() != null) {
            myData = (MyData) getIntent().getSerializableExtra(Constance.MYDATA);
            myTitle = myData.getTitle();
            title.setText(myTitle);
            adapter = new CommonAdapter(this, myData);
            listView.setAdapter(adapter);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (myData != null) {
            myData = null;
        }
    }
}
