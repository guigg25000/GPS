package com.example.yoann.gps;

/**
 * Created by YoannO on 09/01/2017.
 */

import java.util.List;

import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Query;

interface GithubService {

    public static final String ENDPOINT = "https://api.github.com";

    @GET("/users/{user}/repos")
    List<Repo> listRepos(@Path("user") String user);

    @GET("/search/repositories")
    List<Repo> searchRepos(@Query("q") String query);

    // @FormUrlEncoded
    //@POST("/search/repositories")
    //List searchRepos(@Field("q") String query);

    public class Repo {
        private int id;
        private String name;
        private String full_name;
        private String html_url;

        //getters & setters
    }

}
