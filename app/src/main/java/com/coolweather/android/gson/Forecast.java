package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    // 日期
    public String date;

    // 温度
    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        // 最高温度
        public String max;
        // 最低温度
        public String min;
    }

    public class More {
        // 天气状况
        @SerializedName("txt_d")
        public String info;
    }
}
