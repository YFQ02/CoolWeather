package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {
    // 舒适度
    @SerializedName("comf")
    public Comfort comfort;
    // 洗车建议
    @SerializedName("cw")
    public CarWash carWash;
    // 运动建议
    @SerializedName("sport")
    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
