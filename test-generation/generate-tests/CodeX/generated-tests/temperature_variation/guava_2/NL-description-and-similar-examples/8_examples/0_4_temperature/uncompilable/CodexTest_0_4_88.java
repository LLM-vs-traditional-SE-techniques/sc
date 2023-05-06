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


public class CodexTest_0_4_88 { 
  @Test
  public void testWriteBytesTo() {
    int bits = random.nextInt(1000) + 1;
    BitArray array = BitArray.create(bits);
    for (int i = 0; i < bits; i++) {
      array.set(i, random.nextBoolean());
    }
    byte[] expected = new byte[bits / 8 + 1];
    for (int i = 0; i < bits; i++) {
      expected[i / 8] |= (array.get(i) ? 1 : 0) << (i % 8);
    }
    byte[] actual = new byte[bits / 8 + 1];
    int written = array.writeBytesTo(actual, 0, actual.length);
    assertEquals(bits / 8 + 1, written);
    assertEquals(bits, array.bits());
    assertEquals(bits, written * 8);
    assertEquals(bits, array.bits());
    assertEquals(bits / 8 + 1, actual.length);
    assertEquals(bits, actual.length * 8);
    assertEquals(bits, array.bits());
    assertEquals(bits / 8 + 1, expected.length);
    assertEquals(bits, expected.length * 8);
    assertEquals(bits, array.bits());
    assertArrayEquals(expected, actual);
    assertEquals(bits, array.bits());
  }
}