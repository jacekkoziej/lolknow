package com.jacek.koziej.integration;

import org.apache.http.client.methods.HttpGet;

import java.io.IOException;

public class OmegaService {


    public String returnSomething() throws IOException {
        HttpGet request = new HttpGet("https://eun1.api.riotgames.com/lol/league/v4/challengerleagues/by-queue/RANKED_SOLO_5x5");
        return RiotGateway.callService(request);

    }
}
