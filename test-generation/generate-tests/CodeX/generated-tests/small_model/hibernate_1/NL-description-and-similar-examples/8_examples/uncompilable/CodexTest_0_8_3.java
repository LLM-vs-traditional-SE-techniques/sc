import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_3 { 
  @Test
    public final boolean isTrue(char c) {
    if (c == T || c == t || c == Y || c == y)
      return true;
    if (c == F || c == f || c == N || c == n)
      return false;
    throw new IllegalArgumentException("Unexpected value  + c +  for boolean.");
  }
}