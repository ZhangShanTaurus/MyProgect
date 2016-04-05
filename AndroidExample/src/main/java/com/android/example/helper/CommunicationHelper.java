package com.android.example.helper;

import android.content.Context;
import android.os.Bundle;

import com.android.example.R;
import com.android.example.common.CommonActivity;
import com.android.example.common.Constance;
import com.android.example.common.DataResource;
import com.android.example.common.MyData;
import com.android.example.communication.socket.SocketActivity;
import com.android.example.utils.IntentUtils;

/**
 * 描述：
 * Created by Administrator on 2016/1/14 0014.
 */
public class CommunicationHelper {

    private static MyData myData;

    public static void goNext(Context context, int index) {
        Bundle bundle;
        switch (index) {
            case R.string.tcp_udp:
                myData = new MyData(R.string.tcp_udp, new DataResource(Constance.TCP_UDP).getList(), Constance.TCP_UDP);
                bundle = new Bundle();
                bundle.putSerializable(Constance.MYDATA, myData);
                IntentUtils.intent(context, bundle, CommonActivity.class, false);
                break;
            case R.string.http:
                myData = new MyData(R.string.http, new DataResource(Constance.HTTP).getList(), Constance.HTTP);
                bundle = new Bundle();
                bundle.putSerializable(Constance.MYDATA, myData);
                IntentUtils.intent(context, bundle, CommonActivity.class, false);
                break;
            case R.string.socket:
                myData = new MyData(R.string.socket, new DataResource(Constance.SOCKET).getList(), Constance.SOCKET);
                bundle = new Bundle();
                bundle.putSerializable(Constance.MYDATA, myData);
                IntentUtils.intent(context, bundle, CommonActivity.class, false);
                break;
            case R.string.bluetooth:
                bundle = new Bundle();
                bundle.putInt(Constance.TITLE, R.string.bluetooth);
                IntentUtils.intent(context, bundle, SocketActivity.class, false);
                break;
            case R.string.nfc:
                bundle = new Bundle();
                bundle.putInt(Constance.TITLE, R.string.nfc);
                IntentUtils.intent(context, bundle, SocketActivity.class, false);
                break;
            case R.string.headset:
                bundle = new Bundle();
                bundle.putInt(Constance.TITLE, R.string.headset);
                IntentUtils.intent(context, bundle, SocketActivity.class, false);
                break;
            case R.string.usb:
                bundle = new Bundle();
                bundle.putInt(Constance.TITLE, R.string.usb);
                IntentUtils.intent(context, bundle, SocketActivity.class, false);
                break;
            default:
                break;
        }
    }
}
