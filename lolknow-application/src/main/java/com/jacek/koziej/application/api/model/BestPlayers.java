package com.jacek.koziej.application.api.model;

import lombok.Data;

import java.util.List;
@Data
public class BestPlayers {

    public List<Player> players;

    public long totalCount;

    public int pageNumber;

}
