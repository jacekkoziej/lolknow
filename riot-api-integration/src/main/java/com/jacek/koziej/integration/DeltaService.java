package com.jacek.koziej.integration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.http.client.methods.HttpGet;

import java.io.IOException;

public class DeltaService {

    public String returnSomething() throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().generateNonExecutableJson().create();
        HttpGet request = new HttpGet("https://eun1.api.riotgames.com/lol/league/v4/entries/RANKED_SOLO_5x5/DIAMOND/I?page=1");
        String response = RiotGateway.callService(request);
        String s = gson.toJson(response);
        System.out.println(s);
        return response;

    }
}
