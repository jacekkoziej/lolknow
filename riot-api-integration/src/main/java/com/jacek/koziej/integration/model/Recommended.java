
package com.jacek.koziej.integration.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Recommended {

    @SerializedName("champion")
    @Expose
    private String champion;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("map")
    @Expose
    private String map;
    @SerializedName("mode")
    @Expose
    private String mode;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("customTag")
    @Expose
    private String customTag;
    @SerializedName("sortrank")
    @Expose
    private Integer sortrank;
    @SerializedName("extensionPage")
    @Expose
    private Boolean extensionPage;
    @SerializedName("useObviousCheckmark")
    @Expose
    private Boolean useObviousCheckmark;
    @SerializedName("customPanel")
    @Expose
    private Object customPanel;
    @SerializedName("blocks")
    @Expose
    private List<Block> blocks = null;

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCustomTag() {
        return customTag;
    }

    public void setCustomTag(String customTag) {
        this.customTag = customTag;
    }

    public Integer getSortrank() {
        return sortrank;
    }

    public void setSortrank(Integer sortrank) {
        this.sortrank = sortrank;
    }

    public Boolean getExtensionPage() {
        return extensionPage;
    }

    public void setExtensionPage(Boolean extensionPage) {
        this.extensionPage = extensionPage;
    }

    public Boolean getUseObviousCheckmark() {
        return useObviousCheckmark;
    }

    public void setUseObviousCheckmark(Boolean useObviousCheckmark) {
        this.useObviousCheckmark = useObviousCheckmark;
    }

    public Object getCustomPanel() {
        return customPanel;
    }

    public void setCustomPanel(Object customPanel) {
        this.customPanel = customPanel;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

}
