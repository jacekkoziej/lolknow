package com.jacek.koziej.integration.model;

public class Champion {

    private String id;
    private String key;
    private String name;
    private String title;
    private Image image;
    private ChampionStats stats;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Image getImage() { return image; }

    public void setImage(Image image) { this.image = image; }

    public ChampionStats getStats() {
        return stats;
    }

    public void setStats(ChampionStats stats) {
        this.stats = stats;
    }
}
