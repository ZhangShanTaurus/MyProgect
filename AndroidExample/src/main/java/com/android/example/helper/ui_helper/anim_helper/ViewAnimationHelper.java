package com.android.example.helper.ui_helper.anim_helper;

import android.content.Context;
import android.os.Bundle;

import com.android.example.R;
import com.android.example.common.CommonActivity;
import com.android.example.common.Constance;
import com.android.example.common.DataResource;
import com.android.example.common.MyData;
import com.android.example.utils.IntentUtils;

/**
 * 描述：View模块下Animation帮助类
 * Created by Administrator on 2016/1/14 0014.
 */
public class ViewAnimationHelper {
    private static MyData myData;

    public static void goNext(Context context, int index) {
        switch (index) {
            case R.string.tweenAnimation:
                myData = new MyData(R.string.tweenAnimation, new DataResource(Constance.TWEEN_ANIMATION).getList(), Constance.TWEEN_ANIMATION);
                break;
            case R.string.frameAnimation:
                myData = new MyData(R.string.frameAnimation, new DataResource(Constance.FRAME_ANIMATION).getList(), Constance.FRAME_ANIMATION);
                break;
            default:
                break;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constance.MYDATA, myData);
        IntentUtils.intent(context, bundle, CommonActivity.class, false);
    }
}
