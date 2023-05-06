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


public class CodexTest_0_9_69 { 
  @Test
  public void testWriteBytesTo() {
    assertEquals(0, Bits.Ints.zero().writeBytesTo(new byte[0], 0, 0));
    assertEquals(0, Bits.Ints.zero().writeBytesTo(new byte[0], 0, 1337));
    assertEquals(0, Bits.Ints.zero().writeBytesTo(new byte[0], 0, MAX_POWER_OF_TWO + 1));
    assertEquals(1, Bits.Ints.zero().writeBytesTo(new byte[1], 0, 1));
    assertEquals(1, Bits.Ints.zero().writeBytesTo(new byte[1], 0, MAX_POWER_OF_TWO));
    assertEquals(0, Bits.Ints.zero().writeBytesTo(new byte[1], 1, 0));
    assertEquals(0, Bits.Ints.zero().writeBytesTo(new byte[1], 1, MAX_POWER_OF_TWO));
    try {
      Bits.Ints.zero().writeBytesTo(new byte[1], 0, MAX_POWER_OF_TWO + 1);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
    try {
      Bits.Ints.zero().writeBytesTo(new byte[1], -1, 0);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
    try {
      Bits.Ints.zero().writeBytesTo(new byte[1], -1, 1337);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
    try {
      Bits.Ints.zero().writeBytesTo(new byte[1], -1, MAX_POWER_OF_TWO);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
    try {
      Bits.Ints.zero().writeBytesTo(new byte[1], -1, MAX_POWER_OF_TWO + 1);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
}