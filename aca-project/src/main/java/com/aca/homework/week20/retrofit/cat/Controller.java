package com.aca.homework.week20.retrofit.cat;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.Map;

public class Controller implements Callback<Map<String, String>> {

    public void start() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://catfact.ninja/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        CatFactNinjaService catFactNinjaService = retrofit.create(CatFactNinjaService.class);

        Call<Map<String, String>> call = catFactNinjaService.getCatFact();
        call.enqueue(this);
    }


    @Override
    public void onResponse(Call<Map<String, String>> call, Response<Map<String, String>> response) {
        if (response.isSuccessful()) {
            System.out.println(response.body());
        } else {
            System.out.println(response.errorBody());
        }
    }

    @Override
    public void onFailure(Call<Map<String, String>> call, Throwable t) {
        t.printStackTrace();
    }
}
