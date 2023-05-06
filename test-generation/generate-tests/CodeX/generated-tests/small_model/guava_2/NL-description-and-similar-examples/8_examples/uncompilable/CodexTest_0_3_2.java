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


public class CodexTest_0_3_2 { 
  @Test
  public void testWriteBytesTo() {
    int bits = 32;
    BitVector bv = new BitVector(bits);
    bv.set(0);
    bv.set(1);
    bv.set(2);
    bv.set(3);
    bv.set(4);
    bv.set(5);
    bv.set(6);
    bv.set(7);
    bv.set(8);
    bv.set(9);
    bv.set(10);
    bv.set(11);
    bv.set(12);
    bv.set(13);
    bv.set(14);
    bv.set(15);
    bv.set(16);
    bv.set(17);
    bv.set(18);
    bv.set(19);
    bv.set(20);
    bv.set(21);
    bv.set(22);
    bv.set(23);
    bv.set(24);
    bv.set(25);
    bv.set(26);
    bv.set(27);
    bv.set(28);
    bv.set(29);
    bv.set(30);
    bv.set(31);
    byte[] dest = new byte[32 / 8];
    int offset = 0;
    int maxLength = dest.length;
    int result = bv.writeBytesTo(dest, offset, maxLength);
    assertEquals(32 / 8, result);
    assertEquals(0x01, dest[0]);
    assertEquals(0x02, dest[1]);
    assertEquals(0x04, dest[2]);
    assertEquals(0x08, dest[3]);
    assertEquals(0x10, dest[4]);
    assertEquals(0x20, dest[5]);
    assertEquals(0x40, dest[6]);
    assertEquals(0x80, dest[7]);
    assertEquals(0x00, dest[8]);
    assertEquals(0x00, dest[9]);
    assertEquals(0x00, dest[10]);
    assertEquals(0x00, dest[11]);
    assertEquals(0x00, dest[12]);
    assertEquals(0x00, dest[13]);
    assertEquals(0x00, dest[14]);
    assertEquals(0x00, dest[15]);
    assertEquals(0x00, dest[16]);
    assertEquals(0x00, dest[17]);
    assertEquals(0x00, dest[18]);
    assertEqu
}