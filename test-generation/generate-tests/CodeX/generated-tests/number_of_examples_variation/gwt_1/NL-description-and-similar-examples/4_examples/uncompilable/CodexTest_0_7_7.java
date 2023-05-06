import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_7 { 
  @Test
    
Input: public static boolean isScript() {
    return com.google.gwt.core.shared.GWT.isScript();
  }
Output:
    
Input: public static void log(String message, Throwable e) {
    com.google.gwt.core.shared.GWT.log(message, e);
  }
Output:
    
Input: public static String getModuleName() {
    return Impl.getModuleName();
  }
Output:
    
Input: public static String getPermutationStrongName() {
    return Impl.getPermutationStrongName();
  }
Output:
    
Input: public static Throwable caught() {
    return com.google.gwt.core.shared.GWT.caught();
  }
Output:
    
Input: public static Throwable create(Class<?> caught) {
    return com.google.gwt.core.shared.GWT.create(caught);
  }
Output:
    
Input: public static UiBinderUtil getUiBinderUtil() {
    return uiBinderUtil;
  }
Output:
    
Input: public static void log(String message) {
    com.google.gwt.core.shared.GWT.log(message);
  }
Output:
    
Input: public static void setUncaughtExceptionHandler(UncaughtExceptionHandler handler) {
    com.google.gwt.core.shared.GWT.setUncaughtExceptionHandler(handler);
  }
Output:
    
Input: public static boolean isProdMode() {
    return com.google.gwt.core.shared.GWT.isProdMode();
  }
Output:
    
Input: public static boolean isWebMode() {
    return com.google.gwt.core.shared.GWT.isWebMode();
  }
Output:
    
Input: public static boolean isDebugMode() {
    return com.google.gwt.core.shared.GWT.isDebugMode();
  }
Output:
    
Input: public static String getHostPageBaseURL() {
    return
}