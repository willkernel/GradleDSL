package com.willkernel.app.gradledsl;

import android.support.test.InstrumentationRegistry;
import android.support.test.filters.MediumTest;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Expected durations are @SmallTest, @MediumTest, and @LargeTest
 * Tests that only take a few milliseconds are marked as @SmallTest, those that take on the
 * order of 100 milliseconds are @MediumTest, and longer ones are marked @LargeTest.
 * RunWith Use the JUnit 4 runner for Android
 * <p>
 * Run the connectedCheck task to execute tests on all emulators and
 * connected devices concurrently.
 */
@MediumTest
@RunWith(AndroidJUnit4.class)
public class MyActivityLayoutTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private MainActivity mainActivity;
    private TextView textView;
    private EditText editText;
    private Button button;

    public MyActivityLayoutTest() {
        super(MainActivity.class);
    }


    @Before
    @Override
    public void setUp() throws Exception {
        super.setUp();
        //Needed for the new JUnit 4 runner
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        mainActivity = getActivity();

        textView = mainActivity.findViewById(R.id.textView);
        editText = mainActivity.findViewById(R.id.edit_text);
        button = mainActivity.findViewById(R.id.button);
    }

    @After
    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * The docs recommend
     * using a testPreconditions test like the one shown, just to demonstrate that the
     * widgets were found
     */
    @Test
    public void testPreconditions() {
        assertNotNull("Activity is null", mainActivity);
        assertNotNull("TextView is null", textView);
        assertNotNull("EditText is null", editText);
        assertNotNull("Button is null", button);
    }

    @Test
    public void testView_label() {
        String expected = mainActivity.getString(R.string.app_name);
        String actual = textView.getText().toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testText_hint() {
        String expect = mainActivity.getString(R.string.hint);
        String actual = editText.getHint().toString();
        assertEquals(expect, actual);
    }

    @Test
    public void helloButton_label() {
        final String expected = mainActivity.getString(R.string.app_name);
        final String actual = button.getText().toString();
        assertEquals(expected, actual);
    }
}
