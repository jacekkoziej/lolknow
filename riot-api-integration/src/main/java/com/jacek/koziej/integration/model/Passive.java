
package com.jacek.koziej.integration.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Passive {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("image")
    @Expose
    private Image__2 image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image__2 getImage() {
        return image;
    }

    public void setImage(Image__2 image) {
        this.image = image;
    }

}
