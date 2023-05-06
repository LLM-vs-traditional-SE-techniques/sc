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


public class CodexTest_0_6_9 { 
  @Test
  public static void testFromLong() {
    assertEquals(new LongHashCode(0), HashCode.fromLong(0));
    assertEquals(new LongHashCode(-1), HashCode.fromLong(-1));
    assertEquals(new LongHashCode(1), HashCode.fromLong(1));
    assertEquals(new LongHashCode(Integer.MAX_VALUE + 1L),
        HashCode.fromLong(Integer.MAX_VALUE + 1L));
    assertEquals(new LongHashCode(Long.MAX_VALUE), HashCode.fromLong(Long.MAX_VALUE));
  }
}