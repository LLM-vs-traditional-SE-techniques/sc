import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_8 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    final UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    assertNotNull(ueh);
    final Throwable t = new Throwable();
    Triple wrapped = new Triple(t,
        "Throwable thrown to UncaughtExceptionHandler, ",
        " but UncaughtExceptionHandler returned unexpected null");
    Triple unwrapped = new Triple(t,
        "Throwable thrown to UncaughtExceptionHandler, ",
        " but UncaughtExceptionHandler failed to throw the Throwable");
    try {
      assertTrue(ueh.onUncaughtException(t));
    } catch (Throwable e) {
      AssertionFailedError afe = new AssertionFailedError(unwrapped);
      afe.initCause(e);
      throw afe;
    }
    try {
      assertFalse(ueh.onUncaughtException(t));
    } catch (Throwable e) {
      AssertionFailedError afe = new AssertionFailedError(wrapped);
      afe.initCause(e);
      throw afe;
    }
  }
*/
JNIEXPORT jobjectArray JNICALL Java_GUnit_getUncaughtExceptionHandlerTest
  (JNIEnv *env, jclass thisClass, jstring input, jstring methodBody) {
}