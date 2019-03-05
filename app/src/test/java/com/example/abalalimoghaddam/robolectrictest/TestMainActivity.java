package com.example.abalalimoghaddam.robolectrictest;

import org.apache.tools.ant.Main;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.android.controller.ActivityController;
import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
public class TestMainActivity {

    private MainActivity mainActivity;

    //ActivityController<MainActivity> mainActivity = Robolectric.buildActivity(MainActivity.class);

    @Before
    public void setUp() throws Exception
    {
        mainActivity = Robolectric.buildActivity( MainActivity.class )
                .create()
                .resume()
                .get();
    }

    @Test
    public void shouldNotBeNull() throws Exception
    {
        assertNotNull( mainActivity );
    }

    @Test
    public void givesCorrectAnswer() {
        mainActivity.button.performClick();

        assertEquals("42", mainActivity.textView.getText());
    }

}
