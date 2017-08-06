package com.codeme.tmagiera.galaktykascroll;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

public class Photo implements Serializable {

    private String mHumanDate;
    private String mExplanation;
    private String mUrl;

    public Photo(JSONObject photoJSON) {
        try {
            mHumanDate = photoJSON.getString("date");
            mExplanation = photoJSON.getString("explanation");
            mUrl = photoJSON.getString("url");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String getHumanDate() {
        return mHumanDate;
    }

    public String getExplanation() {
        return mExplanation;
    }

    public String getUrl() {
        return mUrl;
    }
}
