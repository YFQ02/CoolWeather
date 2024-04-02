package com.coolweather.android.gson;

public class AQI {
    public AQICity city;

    public class AQICity {
        // 空气质量指数
        public String aqi;
        // pm2.5指数
        public String pm25;
    }
}
