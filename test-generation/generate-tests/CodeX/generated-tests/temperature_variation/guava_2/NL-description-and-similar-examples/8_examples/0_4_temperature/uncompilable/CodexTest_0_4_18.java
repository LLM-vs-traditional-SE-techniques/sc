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


public class CodexTest_0_4_18 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[20];
    byte[] bytes = {(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x9A,
        (byte) 0xBC, (byte) 0xDE, (byte) 0xF0};
    int numBytes = Longs.BYTES;
    long input = Longs.fromBytes(bytes[0], bytes[1], bytes[2], bytes[3], bytes[4], bytes[5],
        bytes[6], bytes[7]);
    MutableBitArray bitArray = MutableBitArray.create(input, numBytes * 8);
    int writtenBytes = bitArray.writeBytesTo(dest, 0, numBytes);
    assertEquals(numBytes, writtenBytes);
    for (int i = 0; i < numBytes; i++) {
      assertEquals(bytes[i], dest[i]);
    }
  }
}