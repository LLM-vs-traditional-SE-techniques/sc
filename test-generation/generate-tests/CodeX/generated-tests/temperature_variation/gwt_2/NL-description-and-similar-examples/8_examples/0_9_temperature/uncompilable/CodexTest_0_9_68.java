import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_68 { 
  @Test
  public void testThrowableThrowAndThrowIfUncaught() {
    Throwable throwable = new Throwable() {
      @Override public Throwable fillInStackTrace() {
        return this;
      }
    };
    try {
      UncaughtExceptionHandler.get().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
      fail();
    } catch (Throwable t) {
      assertEquals(throwable, t);
    }
    try {
      UncaughtExceptionHandler.get().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), new Exception(throwable) {
        @Override public String toString() {
          return throwable.toString();
        }
}