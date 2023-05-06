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


public class CodexTest_0_8_2 { 
  @Test
  public void testGetBytes_fewerBytesThanBits() {
    byte[] bits = getBitPattern(0, 0, 0);
    byte[] bytes = getBitPattern(0, 0, 4);
    int numBytes = ByteBuffer.wrap(bytes).getInt();
    int numBits = ByteBuffer.wrap(bits).getInt();
    BitArray b = BitArray.fromBytes(bytes);
    assertEquals(numBytes, b.getBytes().length);
    byte[] expectedBytes = new byte[numBytes];
    byte[] actualBytes = new byte[numBytes];
    System.arraycopy(bytes, 4, expectedBytes, 0, numBytes);
    b.writeBytesTo(actualBytes, 0, numBytes);
    assertArrayEquals(expectedBytes, actualBytes);
  }
}