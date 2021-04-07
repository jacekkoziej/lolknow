
package com.jacek.koziej.integration.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("hideCount")
    @Expose
    private Boolean hideCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getHideCount() {
        return hideCount;
    }

    public void setHideCount(Boolean hideCount) {
        this.hideCount = hideCount;
    }

}
