package com.jacek.koziej.application.api.model;

import lombok.Data;

@Data
class Player {
    private String summonerId;
    private String summonerName;
    private int leaguePoints;
    private String rank;
    private int wins;
    private int losses;
    private boolean veteran;
    private boolean inactive;
    private boolean freshBlood;
    private boolean hotStreak;
}
