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


public class CodexTest_0_6_6 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[4];
    byte[] expected = new byte[] {0, 0, 0, 0};
    assertEquals(4, BitArray.fromBitMask(new long[] {0}).writeBytesTo(dest, 0, 4));
    assertTrue(Arrays.equals(expected, dest));
    assertEquals(4, BitArray.fromBitMask(new long[] {1}).writeBytesTo(dest, 0, 4));
    expected = new byte[] {1, 0, 0, 0};
    assertTrue(Arrays.equals(expected, dest));
    assertEquals(4, BitArray.fromBitMask(new long[] {0, 2}).writeBytesTo(dest, 0, 4));
    expected = new byte[] {0, 1, 0, 0};
    assertTrue(Arrays.equals(expected, dest));
    assertEquals(4, BitArray.fromBitMask(new long[] {0, 0, 0, 4}).writeBytesTo(dest, 0, 4));
    expected = new byte[] {0, 0, 1, 0};
    assertTrue(Arrays.equals(expected, dest));
    assertEquals(4, BitArray.fromBitMask(new long[]
}