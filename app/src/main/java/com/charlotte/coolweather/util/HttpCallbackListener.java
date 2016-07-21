package com.charlotte.coolweather.util;

/**
 * Created by Administrator on 2016/7/21 0021.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);

}
