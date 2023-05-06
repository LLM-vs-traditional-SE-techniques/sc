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


public class CodexTest_0_4_8 { 
  @Test
    public void testHashCode() {
    assertEquals(0, HashCode.fromLong(0).hashCode());
    assertEquals(1, HashCode.fromLong(1).hashCode());
    assertEquals(Integer.MAX_VALUE, HashCode.fromLong(Integer.MAX_VALUE).hashCode());
    assertEquals(Integer.MIN_VALUE, HashCode.fromLong(Integer.MIN_VALUE).hashCode());
    assertEquals(Integer.MIN_VALUE + 1, HashCode.fromLong(Integer.MIN_VALUE + 1).hashCode());
    assertEquals(Integer.MAX_VALUE - 1, HashCode.fromLong(Integer.MAX_VALUE - 1).hashCode());
    assertEquals(0x12345678, HashCode.fromLong(0x12345678L).hashCode());
    assertEquals(0x92345678, HashCode.fromLong(0x92345678L).hashCode());
  }
}