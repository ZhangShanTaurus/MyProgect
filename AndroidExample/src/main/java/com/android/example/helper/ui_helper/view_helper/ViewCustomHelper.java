package com.android.example.helper.ui_helper.view_helper;

import android.content.Context;

import com.android.example.R;
import com.android.example.ui.layout.FrameLayoutActivity;
import com.android.example.ui.layout.LinearLayoutActivity;
import com.android.example.ui.layout.RelativeLayoutActivity;
import com.android.example.utils.IntentUtils;

/**
 * 描述：View模块下Custom帮助类
 * Created by Administrator on 2016/1/14 0014.
 */
public class ViewCustomHelper {

    public static void goNext(Context context, int index) {
        switch (index) {
            case R.string.include:
                IntentUtils.intent(context, FrameLayoutActivity.class, false);
                break;
            case R.string.fragment1:
                IntentUtils.intent(context, LinearLayoutActivity.class, false);
                break;
            case R.string.requestFocus:
                IntentUtils.intent(context, RelativeLayoutActivity.class, false);
                break;
            default:
                break;
        }
    }
}
