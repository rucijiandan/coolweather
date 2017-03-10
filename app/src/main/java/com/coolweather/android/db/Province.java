package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by kaifa on 2017/3/10.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provineceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvineceCode() {
        return provineceCode;
    }

    public void setProvineceCode(int provineceCode) {
        this.provineceCode = provineceCode;
    }
}
