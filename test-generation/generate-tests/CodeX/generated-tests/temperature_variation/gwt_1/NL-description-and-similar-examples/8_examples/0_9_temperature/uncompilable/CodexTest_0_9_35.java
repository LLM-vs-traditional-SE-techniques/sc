import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_35 { 
  @Test
    
Input: public static boolean isClient() {
    return com.google.gwt.core.shared.GWT.isClient();
  }
Output:
    
Input: public static boolean isScript() {
    return com.google.gwt.core.shared.GWT.isScript();
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
    
Input: public static String getVersion() {
    return Impl.getVersion();
  }
Output:
    
Input: public static <H, V> HashMap<H, V> createHashMap() {
    return new HashMap<H, V>();
  }
Output:
    
Input: public static <K, V> LinkedHashMap<K, V> createLinkedHashMap() {
    return new LinkedHashMap<K, V>();
  }
Output:
    
Input: public static <K, V> IdentityHashMap<K, V> createIdentityHashMap() {
    return new IdentityHashMap<K, V>();
  }
Output:
    
Input: public static <K, V> MapMaker().makeMap() {
    return new MapMaker().makeMap();
  }
Output:
    
Input: public static <K, V> ConcurrentMap<K, V> createConcurrentHashMap() {
    return new MappedResourceConcurrentHashMap<K, V>(IDENTITY, IDENTITY);
  }
Output:
    
Input: public static <K, V> ConcurrentNavigableMap<K, V> createConcurrentSkipListMap() {
    return new ConcurrentSkipListMap<K, V>();
  }
Output:
    
Input: public static <K, V> boolean doEquals(Map<K, V> m1, Object o2) {
    Set<Entry<K, V>> s1 = m1.entrySet();
    if (o2 == this
}