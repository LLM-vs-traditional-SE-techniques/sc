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


public class CodexTest_0_2_62 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 2;
    int maxLength = 5;
    int bits = 10;
    BitArray bitArray = new BitArray(bits);
    bitArray.set(0, true);
    bitArray.set(1, false);
    bitArray.set(2, true);
    bitArray.set(3, false);
    bitArray.set(4, true);
    bitArray.set(5, false);
    bitArray.set(6, true);
    bitArray.set(7, false);
    bitArray.set(8, true);
    bitArray.set(9, false);
    int actual = bitArray.writeBytesTo(dest, offset, maxLength);
    assertEquals(5, actual);
    assertEquals((byte) 0b10101010, dest[2]);
    assertEquals((byte) 0b00000000, dest[3]);
    assertEquals((byte) 0b00000000, dest[4]);
    assertEquals((byte) 0b00000000, dest[5]);
    assertEquals((byte) 0b00000000, dest[6]);
    assertEquals((byte) 0b00000000, dest[7]);
    assertEquals((byte) 0b00000000, dest[8]);
    assertEquals((byte) 0b00000000, dest[9]);
  }
}