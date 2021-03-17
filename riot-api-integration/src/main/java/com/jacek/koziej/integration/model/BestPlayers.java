package com.jacek.koziej.integration.model;

import java.util.ArrayList;
import java.util.Map;

public class BestPlayers {
    private String leagueId;
    private String queue;
    private String name;
    private String tier;
    private ArrayList<Player> entries;

    public ArrayList<Player> getEntries() {
        return entries;
    }

    public void setEntries(ArrayList<Player> entries) {
        this.entries = entries;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    private Map<String, Player> data;

    public Map<String, Player> getData() {
        return data;
    }

    public void setData(Map<String, Player> data) {
        this.data = data;
    }


}
