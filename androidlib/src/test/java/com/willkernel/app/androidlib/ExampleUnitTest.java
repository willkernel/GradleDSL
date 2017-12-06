package com.willkernel.app.androidlib;

import com.google.gson.Gson;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private String jsonText = "{\"type\":\"success\"," +
            "\"value\":{\"id\":35,\"joke\":\"joke on u\"," +
            "\"category\":[\"nerdy\"]}}";

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testGetJoke() throws Exception {
        Gson gson = new Gson();
        IcndbJoke joke = gson.fromJson(jsonText, IcndbJoke.class);
        String correct = "joke on u";

        assertNotNull(joke.getValue());
        assertNotNull(joke.getValue().getJoke());

        assertEquals(correct, joke.getValue().getJoke());
    }
}