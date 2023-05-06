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


public class CodexTest_0_6_78 { 
  @Test
  public static void testBitLength() {
    ImmutableBitSet bitSet = ImmutableBitSet.builder().setBit(0).setBit(2).setBit(8).setBit(63).setBit(64).build();
    assertEquals(65, bitSet.bitLength());
    assertEquals(9, bitSet.byteLength());
    byte[] bytes = new byte[bitSet.byteLength()];
    bitSet.writeBytesTo(bytes, 0, bytes.length);
    assertEquals(0b0000_0001, bytes[0]);
    assertEquals(0b0000_0000, bytes[1]);
    assertEquals(0b0000_0100, bytes[2]);
    assertEquals(0b0000_0000, bytes[3]);
    assertEquals(0b0000_0000, bytes[4]);
    assertEquals(0b0000_0000, bytes[5]);
    assertEquals(0b0000_0000, bytes[6]);
    assertEquals(0b0000_0000, bytes[7]);
    assertEquals(0b0000_0000, bytes[8]);
  }
}