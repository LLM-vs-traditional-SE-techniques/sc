import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_46 { 
  @Test
    public void testGetDelay() {
        LiveDataState state = new LiveDataState();
        LiveData liveData = new LiveData(1000);
        Assert.assertTrue(state.getDelay(liveData) == 10000);
    }
}