import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_17 { 
  @Test
  public void testIsClient() {
    if (com.google.gwt.core.shared.GWT.isClient()) {
      Builder b = GoCache.newBuilder().setExpireAfterWrite(3, TimeUnit.SECONDS).setMaximumSize(2);
      try {
        Cache<String, Integer> cache = b.build();
        cache.getUnchecked("1");
        cache.getUnchecked("2");
        System.out.println("The \"try\" block worked.");
      } catch (RuntimeException e) {
        System.out.println("The \"try\" block failed.");
      } finally {
        b.setExpireAfterWrite(5, TimeUnit.SECONDS).build();
      }
    }
  }
}