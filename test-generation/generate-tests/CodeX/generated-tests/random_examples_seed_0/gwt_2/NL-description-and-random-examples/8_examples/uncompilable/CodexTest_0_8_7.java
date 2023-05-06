import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_7 { 
  @Test
        public void testRunAsync_NullPriority() {
            TestHandler handler = new TestHandler();
            TestRunnable target = new TestRunnable();
            TestPriorityRunnable priorityTarget = new TestPriorityRunnable();
}