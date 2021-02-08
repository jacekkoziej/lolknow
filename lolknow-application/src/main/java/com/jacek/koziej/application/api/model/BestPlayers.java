package com.jacek.koziej.application.api.model;

import java.util.List;

public class BestPlayers {

    public List<Player> players;

    public long totalCount;

    public int pagaNumer;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public int getPagaNumer() {
        return pagaNumer;
    }

    public void setPagaNumer(int pagaNumer) {
        this.pagaNumer = pagaNumer;
    }
}
