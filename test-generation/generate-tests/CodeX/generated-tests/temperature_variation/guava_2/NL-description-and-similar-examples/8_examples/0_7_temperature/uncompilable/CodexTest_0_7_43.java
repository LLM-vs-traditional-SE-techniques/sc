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


public class CodexTest_0_7_43 { 
  @Test
  public void testWriteBytesTo() {
    Random random = new Random(0);
    for (int numBytes = 0; numBytes < 50; numBytes++) {
      for (int offset = 0; offset < 50; offset++) {
        byte[] dest = new byte[offset + numBytes + 50];
        for (int i = 0; i < dest.length; i++) {
          dest[i] = (byte) random.nextInt();
        }
        byte[] bytes = new byte[numBytes];
        random.nextBytes(bytes);
        System.arraycopy(bytes, 0, dest, offset, bytes.length);
        BitArray bitArray = BitArray.fromByteArray(bytes);
        int writtenBytes = bitArray.writeBytesTo(dest, offset, numBytes + 1000);
        assertEquals(bytes.length, writtenBytes);
        byte[] expected = new byte[dest.length];
        System.arraycopy(bytes, 0, expected, offset, bytes.length);
        assertTrue(Arrays.equals(dest, expected));
      }
    }
  }
}