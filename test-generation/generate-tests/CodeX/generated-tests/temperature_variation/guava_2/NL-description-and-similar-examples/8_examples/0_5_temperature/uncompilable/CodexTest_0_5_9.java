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


public class CodexTest_0_5_9 { 
  @Test
  public void testGetBytes_smallBuffer_largeBitArray() {
    int numBytes = 10;
    byte[] bytes = new byte[numBytes];
    int numBits = bytes.length * 8 + 1;
    BitArray bitArray = new BitArray(numBits);
    Random random = new Random(0x5eed);
    for (int i = 0; i < numBits; i++) {
      bitArray.set(i, random.nextBoolean());
    }
    int numBytesWritten = bitArray.getBytes(bytes, 0, bytes.length);
    assertEquals(numBytes, numBytesWritten);
    for (int i = 0; i < numBytes; i++) {
      assertEquals(bitArray.getByte(i), bytes[i]);
    }
  }
}