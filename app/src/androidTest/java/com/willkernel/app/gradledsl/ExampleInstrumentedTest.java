package com.willkernel.app.gradledsl;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * testing Android components, like activities or services,
 * requires deployment of the app to a connected device or emulator
 * The testing library is based on JUnit, but these are not unit tests in the strictest sense

 Despite the word “unit” in AndroidJUnitRunner and other test
 classes, Android tests are inherently functional. They require either
 an emulator or a connected device in order to run.

 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.willkernel.app.gradledsl", appContext.getPackageName());
    }
}
