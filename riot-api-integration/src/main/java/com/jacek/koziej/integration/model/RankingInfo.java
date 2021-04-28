package com.jacek.koziej.integration.model;

import java.util.Map;

public class RankingInfo {
    private String leagueId;
    private String queueType;
    private String tier;
    private String rank;
    private String summonerId;
    private String summonerName;
    private String leaguePoints;
    private int wins;
    private int losses;
    private String veteran;
    private String inactive;
    private String freshBlood;
    private String hotStreak;
    private String wlratio;

    public String calculateWlratio(int wins, int losses){
        double w = Double.parseDouble(String.valueOf(getWins()));
        double l = Double.parseDouble(String.valueOf(getLosses()));
        double wlratio = w/l;
        double roundOff = Math.round(wlratio * 100.0) / 100.0;
        return Double.toString(roundOff);
    }
    public String getWlratio() {
        wlratio = calculateWlratio(getWins(),getLosses());
        return wlratio;
    }

    public void setWlratio(String wlratio) {
        this.wlratio = wlratio;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public String getQueueType() {
        if (queueType.equals("RANKED_SOLO_5x5")) {
            return "Flex Kolejka";
        }
        else if (queueType.equals("RANKED_FLEX_SR")) {
            return "Solo Kolejka";
        }
        else return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public String getLeaguePoints() {
        return leaguePoints;
    }

    public void setLeaguePoints(String leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public String getVeteran() {
        return veteran;
    }

    public void setVeteran(String veteran) {
        this.veteran = veteran;
    }

    public String getInactive() {
        return inactive;
    }

    public void setInactive(String inactive) {
        this.inactive = inactive;
    }

    public String getFreshBlood() {
        return freshBlood;
    }

    public void setFreshBlood(String freshBlood) {
        this.freshBlood = freshBlood;
    }

    public String getHotStreak() {
        if(hotStreak.equals("true")){
            return "Passa zwycięstw!";
        }
        return "Brak passy 🙁";
    }

    public void setHotStreak(String hotStreak) {
        this.hotStreak = hotStreak;
    }
}
