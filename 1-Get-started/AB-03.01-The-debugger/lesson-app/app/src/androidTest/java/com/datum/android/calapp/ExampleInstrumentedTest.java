/*
 * *
 *  * Created by mutairibassam on 1/2/21 10:29 PM
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 1/2/21 1:33 PM
 *
 */

package com.datum.android.calapp;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.datum.android.calapp", appContext.getPackageName());
    }
}