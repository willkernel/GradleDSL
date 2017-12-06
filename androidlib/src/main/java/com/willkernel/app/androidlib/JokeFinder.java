package com.willkernel.app.androidlib;


import android.os.AsyncTask;
import android.widget.TextView;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class JokeFinder {

    private TextView jokeView;
    private Retrofit retrofit;
    private AsyncTask<String, Void, String> task;

    public interface ICNDB {
        @GET("/jokes/random")
        Call<IcndbJoke> getJoke(@Query("firstName") String firstName,
                                @Query("lastName") String lastName,
                                @Query("limitTo") String limitTo);
    }

    public JokeFinder() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://api.icndb.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public void getJoke(TextView textView, String first, String last) {
        jokeView = textView;
        new JokeTask().execute(first, last);
    }

    private class JokeTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            ICNDB icndb = retrofit.create(ICNDB.class);
            Call<IcndbJoke> icndbJokeCall = icndb.getJoke(params[0], params[1], "[nerdy]");
            String joke = "";
            try {
                joke = icndbJokeCall.execute().body().getValue().getJoke();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return joke;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            jokeView.setText(s);
        }
    }
}
