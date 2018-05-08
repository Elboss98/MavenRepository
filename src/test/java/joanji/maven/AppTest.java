package joanji.maven;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    private App app;

    @Before
    public void setup() {
        app = new App();
    }


    @Test
    public void testWordCountString() {
        int count = app.contarLletres("this is a test");
        assertTrue(count == 4);
    }

    @Test
    public void testWordCountEmpty() {
        int count = app.contarLletres("");
        assertTrue(count == 0);
    }

    @Test
    public void testWordCountNull() {
        int count = app.contarLletres(null);
        assertTrue(count == 0);
    }

    @Test
    @Ignore
    public void testWordCountMore() {
        int count = app.contarLletres("this will be skipped");
        assertTrue(count == 3);
    }

    @Test
    public void testWordCountSingle() {
        int count = app.contarLletres("test");
        assertTrue(count == 1);
    }
}
