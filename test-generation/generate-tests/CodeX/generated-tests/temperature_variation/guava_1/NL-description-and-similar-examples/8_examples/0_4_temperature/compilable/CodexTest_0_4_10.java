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


public class CodexTest_0_4_10 { 
  @Test
  public void testHashCode() {
    assertEquals(0, HashCode.fromLong(0L).hashCode());
    assertEquals(1, HashCode.fromLong(1L).hashCode());
    assertEquals(0x80000000, HashCode.fromLong(0x80000000L).hashCode());
    assertEquals(0x80000001, HashCode.fromLong(0x80000001L).hashCode());
    assertEquals(0xffffffff, HashCode.fromLong(0xffffffffL).hashCode());
    assertEquals(0x100000000L, HashCode.fromLong(0x100000000L).hashCode());
    assertEquals(0x100000001L, HashCode.fromLong(0x100000001L).hashCode());
    assertEquals(0x1ffffffffL, HashCode.fromLong(0x1ffffffffL).hashCode());
    assertEquals(0x200000000L, HashCode.fromLong(0x200000000L).hashCode());
    assertEquals(0x200000001L, HashCode.fromLong(0x200000001L).hashCode());
    assertEquals(0x7fffffffffffffffL, HashCode.fromLong(0x7fffffffffffffffL).hashCode());
    assertEquals(0x8000000000000000L, HashCode.fromLong(0x8000000000000000L).hashCode());
    assertEquals(0x8000000000000001L, HashCode.fromLong(0x8000000000000001L).hashCode());
    assertEquals(0xffffffffffffffffL, HashCode.fromLong(0xffffffffffffffffL).hashCode());
  }
}