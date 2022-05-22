package com.aca.homework.week20.retrofit.cat;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.Map;

public interface CatFactNinjaService {
    @GET("fact")
    Call<Map<String, String>> getCatFact();
}
