import com.google.common.hash.*;
import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;
import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedInts;
import java.io.Serializable;

import static com.google.common.io.BaseEncoding.base16;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.io.BaseEncoding;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_4 { 
  @Test
  public void testHashCode() {
    assertEquals(0, HashCode.fromLong(0).hashCode());
    assertEquals(1, HashCode.fromLong(1).hashCode());
    assertEquals(31, HashCode.fromLong(31).hashCode());
    assertEquals(32, HashCode.fromLong(32).hashCode());
    assertEquals(63, HashCode.fromLong(63).hashCode());
    assertEquals(64, HashCode.fromLong(64).hashCode());
    assertEquals(127, HashCode.fromLong(127).hashCode());
    assertEquals(128, HashCode.fromLong(128).hashCode());
    assertEquals(Integer.MAX_VALUE, HashCode.fromLong(Integer.MAX_VALUE).hashCode());
    assertEquals(Integer.MIN_VALUE, HashCode.fromLong(Integer.MIN_VALUE).hashCode());
    assertEquals(-1, HashCode.fromLong(-1).hashCode());
    assertEquals(-32, HashCode.fromLong(-32).hashCode());
    assertEquals(-63, HashCode.fromLong(-63).hashCode());
    assertEquals(-64, HashCode.fromLong(-64).hashCode());
    assertEquals(-127, HashCode.fromLong(-127).hashCode());
    assertEquals(-128, HashCode.fromLong(-128).hashCode());
    assertEquals(-129, HashCode.fromLong(-129).hashCode());
    assertEquals(-Integer.MAX_VALUE, HashCode.fromLong(-Integer.MAX_VALUE).hashCode());
    assertEquals(-Integer.MIN_VALUE, HashCode.fromLong(-Integer.MIN_VALUE).hashCode());
  }
}