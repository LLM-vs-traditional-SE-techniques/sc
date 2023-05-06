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


public class CodexTest_0_4_30 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[4];
    BitSet bs = new BitSet(32);
    bs.set(0);
    bs.set(1);
    bs.set(2);
    bs.set(3);
    bs.set(4);
    bs.set(5);
    bs.set(6);
    bs.set(7);
    bs.set(8);
    bs.set(9);
    bs.set(10);
    bs.set(11);
    bs.set(12);
    bs.set(13);
    bs.set(14);
    bs.set(15);
    bs.set(16);
    bs.set(17);
    bs.set(18);
    bs.set(19);
    bs.set(20);
    bs.set(21);
    bs.set(22);
    bs.set(23);
    bs.set(24);
    bs.set(25);
    bs.set(26);
    bs.set(27);
    bs.set(28);
    bs.set(29);
    bs.set(30);
    bs.set(31);
    assertEquals(4, bs.writeBytesTo(dest, 0, 4));
    assertEquals(0, dest[0]);
    assertEquals(-1, dest[1]);
    assertEquals(-1, dest[2]);
    assertEquals(-1, dest[3]);
    assertEquals(4, bs.writeBytesTo(dest, 0, 5));
    assertEquals(0, dest[0]);
    assertEquals(-1, dest[1]);
    assertEquals(-1, dest[2]);
    assertEquals(-1, dest[3]);
    assertEquals(3, bs.writeBytesTo(dest, 1, 3));
    assertEquals(-1, dest[1]);
    assertEquals(-1,
}