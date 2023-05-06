import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_73 { 
  @Test
    public void testAdd() {
        try {
            Database.add(null);
        } catch (IllegalArgumentException e) {
        }
    }
}