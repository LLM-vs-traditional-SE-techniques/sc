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


public class CodexTest_0_8_7 { 
  @Test
      public void testWriteBytesTo() {
    byte[] dest = new byte[12];
    BitSet source = new BitSet(96);
    source.set(32, 64);
    source.set(80);
    assertEquals(12, source.writeBytesTo(dest, 0, Integer.MAX_VALUE));
    assertEquals(new byte[] {0, 0, 0, 0, 0, 0, 0, 0, -128, 0, 0, 0}, dest);
    Arrays.fill(dest, (byte) 0);
    assertEquals(6, source.writeBytesTo(dest, 0, 6));
    assertEquals(new byte[] {0, 0, 0, 0, 0, 0, -128, 0, 0, 0, 0, 0}, dest);
    Arrays.fill(dest, (byte) 0);
    assertEquals(5, source.writeBytesTo(dest, 0, 5));
    assertEquals(new byte[] {0, 0, 0, 0, 0, 0, -128, 0, 0, 0, 0, 0}, dest);
    Arrays.fill(dest, (byte) 0);
    assertEquals(4, source.writeBytesTo(dest, 0, 4));
    assertEquals(new byte[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, dest);
    Arrays.fill(dest, (byte) 0);
    assertEquals(3, source.writeBytesTo(dest, 0, 3));
    assertEquals(new byte[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, dest);
    Arrays.fill(dest, (byte) 0);
    assertEquals(2, source.writeBytesTo(dest, 0, 2));
    assertEquals(new byte[] {0, 0, 0, 0, 0, 0, 0, 0, -128, 0, 0, 0}, dest);
    Arrays.fill(dest, (byte) 0);
    assertEquals(1, source.writeBytesTo(dest, 0, 1));
   
}