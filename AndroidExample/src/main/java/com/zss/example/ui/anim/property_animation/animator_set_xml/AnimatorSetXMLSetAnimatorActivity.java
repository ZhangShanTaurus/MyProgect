package com.zss.example.ui.anim.property_animation.animator_set_xml;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.zss.example.R;
import com.zss.example.common.Constance;
import com.zss.example.main.BaseActivity;

/**
 * 描述：AnimatorSetXMLSetAnimatorActivity
 * Created by Administrator on 2016/1/21 0021.
 */
public class AnimatorSetXMLSetAnimatorActivity extends BaseActivity implements View.OnClickListener {
    private ImageView iv_back;
    private TextView tv_title;
    private TextView textView;
    private Button btn_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animator_set_xml_set_animator_layout);
        initView();
        initData();
    }

    @Override
    public void initView() {
        iv_back = (ImageView) findViewById(R.id.iv_back);
        iv_back.setOnClickListener(this);
        tv_title = (TextView) findViewById(R.id.tv_title);
        textView = (TextView) findViewById(R.id.textView);
        btn_start = (Button) findViewById(R.id.btn_start);
        btn_start.setOnClickListener(this);
    }

    @Override
    public void initData() {
        if (getIntent().getExtras() != null) {
            tv_title.setText(getIntent().getExtras().getInt(Constance.TITLE));
        }
    }

    /**
     * 执行动画
     */
    public void doAnimator() {
        AnimatorSet animator = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.set_animator);
        animator.setTarget(textView);
        animator.start();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                onBackPressed();
                break;
            case R.id.btn_start:
                doAnimator();
                break;
            default:
                break;
        }
    }
}
