package com.android.example.helper.base_knowledge_helper;

import android.content.Context;
import android.os.Bundle;

import com.android.example.R;
import com.android.example.base_knowledge.content_provider.ConProBaseInfoActivity;
import com.android.example.base_knowledge.content_provider.CustomConProActivity;
import com.android.example.base_knowledge.content_provider.GetSystemContactActivity;
import com.android.example.common.Constance;
import com.android.example.utils.IntentUtils;

/**
 * 描述：ContentProviderHelper
 * Created by Administrator on 2016/2/22 0022.
 */
public class ContentProviderHelper {

    public static void goNext(Context context, int index) {
        Bundle bundle = null;
        switch (index) {
            case R.string.contentProviderBaseInfo:
                bundle = new Bundle();
                bundle.putInt(Constance.TITLE, R.string.contentProviderBaseInfo);
                IntentUtils.intent(context, bundle, ConProBaseInfoActivity.class, false);
                break;
            case R.string.getSystemContact:
                bundle = new Bundle();
                bundle.putInt(Constance.TITLE, R.string.getSystemContact);
                IntentUtils.intent(context, bundle, GetSystemContactActivity.class, false);
                break;
            case R.string.customContentProvider:
                bundle = new Bundle();
                bundle.putInt(Constance.TITLE, R.string.customContentProvider);
                IntentUtils.intent(context, bundle, CustomConProActivity.class, false);
                break;
            default:
                break;
        }
    }
}
