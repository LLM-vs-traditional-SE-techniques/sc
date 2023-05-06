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


public class CodexTest_0_6_33 { 
  @Test
  public void testWriteBytesTo() {
    for (int i = 0; i < 100; i++) {
      byte[] bytes = new byte[i];
      Arrays.fill(bytes, (byte) 0xFF);
      byte[] expectedBytes = Arrays.copyOf(bytes, bytes.length);
      byte[] dest = new byte[bytes.length * 2];
      Arrays.fill(dest, (byte) 0xAB);
      BitArray bits = BitArray.create(bytes);
      int bytesWritten = bits.writeBytesTo(dest, 10, bytes.length);
      assertEquals(bytes.length, bytesWritten);
      assertTrue(Arrays.equals(expectedBytes, Arrays.copyOfRange(dest, 10, 10 + bytesWritten)));
      assertTrue(Arrays.equals(
          new byte[] {0xAB, 0xAB, 0xAB, 0xAB, 0xAB, 0xAB, 0xAB, 0xAB, 0xAB, 0xAB},
          Arrays.copyOfRange(dest, 0, 10)));
      assertTrue(Arrays.equals(
          new byte[] {0xAB, 0xAB, 0xAB, 0xAB, 0xAB, 0xAB, 0xAB, 0xAB, 0xAB, 0xAB},
          Arrays.copyOfRange(dest, 10 + bytesWritten, dest.length)));
    }
  }
}