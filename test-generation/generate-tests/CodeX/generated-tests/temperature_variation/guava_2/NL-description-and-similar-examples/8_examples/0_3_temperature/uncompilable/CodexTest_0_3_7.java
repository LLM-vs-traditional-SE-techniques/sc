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


public class CodexTest_0_3_7 { 
  @Test
  public void testWriteBytesToImpl() {
    byte[] dest = new byte[4];
    dest[0] = 0x12;
    dest[1] = 0x34;
    dest[2] = 0x56;
    dest[3] = 0x78;
    int offset = 1;
    int maxLength = 2;
    int expectedLength = 2;
    int expectedOffset = offset + expectedLength;
    int expectedDest0 = 0x12;
    int expectedDest1 = 0x34;
    int expectedDest2 = 0x78;
    int expectedDest3 = 0x78;
    BitArray bitArray = new BitArray(new byte[]{(byte) 0xAB, (byte) 0xCD, (byte) 0xEF, (byte) 0x01});
    int length = bitArray.writeBytesToImpl(dest, offset, maxLength);
    assertEquals(expectedLength, length);
    assertEquals(expectedOffset, offset);
    assertEquals(expectedDest0, dest[0] & 0xFF);
    assertEquals(expectedDest1, dest[1] & 0xFF);
    assertEquals(expectedDest2, dest[2] & 0xFF);
    assertEquals(expectedDest3, dest[3] & 0xFF);
  }
}