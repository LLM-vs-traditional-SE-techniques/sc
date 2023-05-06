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


public class CodexTest_0_7_7 { 
  @Test
  public void testHashCode() {
    assertEquals(0, HashCode.fromLong(0).hashCode());
    assertEquals(0, HashCode.fromLong(0x00000000FFFFFFFFL).hashCode());
    assertEquals(2, HashCode.fromLong(0x0000000000000002L).hashCode());
    assertEquals(2, HashCode.fromLong(0x0000000000000002L).hashCode());
    assertEquals(3, HashCode.fromLong(0x0000000000000003L).hashCode());
    assertEquals(0x7FFFFFFF, HashCode.fromLong(0x7FFFFFFF00000000L).hashCode());
    assertEquals(0x7FFFFFFF, HashCode.fromLong(0x7FFFFFFFFFFFFFFFL).hashCode());
    assertEquals(0x80000000, HashCode.fromLong(0x8000000000000000L).hashCode());
    assertEquals(0x80000000, HashCode.fromLong(0x8000000FFFFFFFFFL).hashCode());
    assertEquals(0x80000001, HashCode.fromLong(0x8000000100000000L).hashCode());
    assertEquals(0x80000001, HashCode.fromLong(0x80000001FFFFFFFFL).hashCode());
    assertEquals(0xFFFFFFFF, HashCode.fromLong(0xFFFFFFFF00000000L).hashCode());
    assertEquals(0xFFFFFFFF, HashCode.fromLong(0xFFFFFFFFFFFFFFFFL).hashCode());
  }

}