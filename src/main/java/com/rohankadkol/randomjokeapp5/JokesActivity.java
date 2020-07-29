package com.rohankadkol.randomjokeapp5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.rohankadkol.randomjokeapp5.data.JokeHelper;

public class JokesActivity extends AppCompatActivity {
    TextView mTvJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        mTvJoke = findViewById(R.id.tv_joke);

        // TODO (26): Add a back button and set the title of the ActionBar
        JokeHelper.initializeJokes(this);

        setJoke();
    }

    public void onBtnNextJokeClicked(View view) {
        setJoke();
    }

    private void setJoke() {
        String joke = JokeHelper.getJoke();
        mTvJoke.setText(joke);
    }
    public void onBtnClicked(View view) {
        // TODO (14): Use intents to go to the JokesActivity
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    // TODO (27): Override onOptionsItemsSelected() to go back when the back button is clicked
}
