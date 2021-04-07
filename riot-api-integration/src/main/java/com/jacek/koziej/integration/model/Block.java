package com.jacek.koziej.integration.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Block {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("recMath")
    @Expose
    private Boolean recMath;
    @SerializedName("recSteps")
    @Expose
    private Boolean recSteps;
    @SerializedName("minSummonerLevel")
    @Expose
    private Integer minSummonerLevel;
    @SerializedName("maxSummonerLevel")
    @Expose
    private Integer maxSummonerLevel;
    @SerializedName("showIfSummonerSpell")
    @Expose
    private String showIfSummonerSpell;
    @SerializedName("hideIfSummonerSpell")
    @Expose
    private String hideIfSummonerSpell;
    @SerializedName("appendAfterSection")
    @Expose
    private String appendAfterSection;
    @SerializedName("visibleWithAllOf")
    @Expose
    private List<String> visibleWithAllOf = null;
    @SerializedName("hiddenWithAnyOf")
    @Expose
    private List<String> hiddenWithAnyOf = null;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getRecMath() {
        return recMath;
    }

    public void setRecMath(Boolean recMath) {
        this.recMath = recMath;
    }

    public Boolean getRecSteps() {
        return recSteps;
    }

    public void setRecSteps(Boolean recSteps) {
        this.recSteps = recSteps;
    }

    public Integer getMinSummonerLevel() {
        return minSummonerLevel;
    }

    public void setMinSummonerLevel(Integer minSummonerLevel) {
        this.minSummonerLevel = minSummonerLevel;
    }

    public Integer getMaxSummonerLevel() {
        return maxSummonerLevel;
    }

    public void setMaxSummonerLevel(Integer maxSummonerLevel) {
        this.maxSummonerLevel = maxSummonerLevel;
    }

    public String getShowIfSummonerSpell() {
        return showIfSummonerSpell;
    }

    public void setShowIfSummonerSpell(String showIfSummonerSpell) {
        this.showIfSummonerSpell = showIfSummonerSpell;
    }

    public String getHideIfSummonerSpell() {
        return hideIfSummonerSpell;
    }

    public void setHideIfSummonerSpell(String hideIfSummonerSpell) {
        this.hideIfSummonerSpell = hideIfSummonerSpell;
    }

    public String getAppendAfterSection() {
        return appendAfterSection;
    }

    public void setAppendAfterSection(String appendAfterSection) {
        this.appendAfterSection = appendAfterSection;
    }

    public List<String> getVisibleWithAllOf() {
        return visibleWithAllOf;
    }

    public void setVisibleWithAllOf(List<String> visibleWithAllOf) {
        this.visibleWithAllOf = visibleWithAllOf;
    }

    public List<String> getHiddenWithAnyOf() {
        return hiddenWithAnyOf;
    }

    public void setHiddenWithAnyOf(List<String> hiddenWithAnyOf) {
        this.hiddenWithAnyOf = hiddenWithAnyOf;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
