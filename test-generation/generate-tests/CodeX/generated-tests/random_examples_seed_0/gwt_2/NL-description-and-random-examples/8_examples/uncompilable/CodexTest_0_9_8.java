import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_8 { 
        @Test
        public void testUncaughtExceptionHandler() throws InterruptedException, IOException {
            final CountDownLatch latch = new CountDownLatch(1);
            final LogCapture capture = new LogCapture(LogLevel.ERROR);
            try {
                Thread.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread th, Throwable ex) {
                        assertTrue("Expected " + AssertionError.class.getSimpleName() + " but was " + ex.getClass().getSimpleName(), ex instanceof AssertionError);
                        latch.countDown();
                    }
                });
                try {
                    assertEquals("1", "2");
                    Assert.fail("Missing AssertionError");
                } catch (AssertionError ae) {
                    // ignore
                }
                latch.await();
                assertTrue("Expected: " + System.getProperty("line.separator") +
                   "But was: " + capture, capture.getMessage().endsWith(System.getProperty("line.separator")));
            } finally {
                capture.close();
            }
        }
}