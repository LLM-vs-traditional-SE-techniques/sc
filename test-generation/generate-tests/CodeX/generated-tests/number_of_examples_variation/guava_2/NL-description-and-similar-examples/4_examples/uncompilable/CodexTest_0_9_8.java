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


public class CodexTest_0_9_8 { 
  @Test
  public void testSlowWriteBytesToLong() {
    BitArray a = new BitArray();
    a.set(168);
    a.set(172);
    a.set(174);
    long[] values = new long[2];
    assertEquals(16, a.writeBytesToImpl(values, 0, 16));
    assertEquals(0x4040404040404040L, values[0]);
    assertEquals(0x4040404040404040L, values[1]);
}