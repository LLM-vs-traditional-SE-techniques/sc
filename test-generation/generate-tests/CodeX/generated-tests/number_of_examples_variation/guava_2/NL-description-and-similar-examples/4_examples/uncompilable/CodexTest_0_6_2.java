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


public class CodexTest_0_6_2 { 
  @Test
  public void testWriteBytesTo() throws Exception {
    byte[] dest = new byte[5];
    BitArray array = new BitArray(new byte[] {(byte) 0b10101010, (byte) 0b11110000}, 12);
    assertEquals(4, array.writeBytesTo(dest, 1, 4));
    assertEquals((byte) 0b00000000, dest[0]);
    assertEquals((byte) 0b01010101, dest[1]);
    assertEquals((byte) 0b01111000, dest[2]);
    assertEquals((byte) 0b00000000, dest[3]);
    assertEquals((byte) 0b00000000, dest[4]);
  }
}