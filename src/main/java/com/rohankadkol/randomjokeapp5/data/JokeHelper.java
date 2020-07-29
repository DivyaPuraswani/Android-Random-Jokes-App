package com.rohankadkol.randomjokeapp5.data;

import android.content.Context;

import com.rohankadkol.randomjokeapp5.R;

import java.util.ArrayList;
import java.util.List;

public class JokeHelper {
    private static int currentJoke = 0;

    // TODO (15): Add all the below jokes to a string-array in strings.xml
    // TODO (16): Set jokes to null
    private static String[] jokes = null;

    public static void initializeJokes(Context context) {
        if (jokes != null) {
            return;
        }

        // TODO (17): Uncomment this line when using strings.xml. This line populates the jokes
        //  array using the string-array we created in strings.xml during step #13
            jokes = context.getResources().getStringArray(R.array.jokes);
    }

    public static String getJoke() {
        currentJoke++;
        if (currentJoke >= jokes.length) {
            currentJoke = 0;
        }

        return jokes[currentJoke];
    }
}
