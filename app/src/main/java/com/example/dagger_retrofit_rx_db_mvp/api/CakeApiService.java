package com.example.dagger_retrofit_rx_db_mvp.api;

//using retrofit,retrofit call object

import android.database.Observable;

import com.example.dagger_retrofit_rx_db_mvp.mvp.model.CakeResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CakeApiService {

    @GET("/filippella/a728a34822a3bc7add98e477a4057b69/raw/310d712e87941f569074a63fedb675d2b611342a/cakes")
    Observable<CakeResponse> getCakes();

    @GET("/filippella/a728a34822a3bc7add98e477a4057b69/raw/310d712e87941f569074a63fedb675d2b611342a/cakes")
    Call<CakeResponse> getTheCakes();

}
