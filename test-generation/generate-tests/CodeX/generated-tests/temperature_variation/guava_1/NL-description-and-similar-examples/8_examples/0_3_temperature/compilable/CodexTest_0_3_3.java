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


public class CodexTest_0_3_3 { 
  @Test
  public void testHashCode() {
    assertEquals(0, HashCode.fromLong(0).hashCode());
    assertEquals(1, HashCode.fromLong(1).hashCode());
    assertEquals(0x80000000, HashCode.fromLong(0x80000000L).hashCode());
    assertEquals(0x80000001, HashCode.fromLong(0x80000001L).hashCode());
    assertEquals(0x7fffffff, HashCode.fromLong(0x7fffffffL).hashCode());
    assertEquals(0x7ffffffe, HashCode.fromLong(0x7ffffffeL).hashCode());
    assertEquals(0x7ffffffe, HashCode.fromLong(-2).hashCode());
    assertEquals(0x7fffffff, HashCode.fromLong(-1).hashCode());
  }
}