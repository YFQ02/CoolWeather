package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    // 当前温度
    @SerializedName("tmp")
    public String temperature;
    // 当前天气状况
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
