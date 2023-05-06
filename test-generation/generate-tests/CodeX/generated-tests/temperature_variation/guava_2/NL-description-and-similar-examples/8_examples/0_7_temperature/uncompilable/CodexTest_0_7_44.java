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


public class CodexTest_0_7_44 { 
  @Test
  public void testAsByteArray() {
    for (int numBytes = 0; numBytes < 8; numBytes++) {
      for (int i = 0; i < (1 << (numBytes * 8)); i++) {
        long value = i;
        if (numBytes < 8) {
          value &= (1L << (numBytes * 8)) - 1;
        }
        LittleEndianByteArrayOutputStream out = new LittleEndianByteArrayOutputStream(numBytes);
        try {
          out.write(value);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
        byte[] expected = new byte[numBytes];
        for (int j = numBytes - 1; j >= 0; j--) {
          expected[j] = (byte) (value & 0xff);
          value >>= 8;
        }
        byte[] bytes = out.toByteArray();
        assertEquals(Arrays.toString(expected), Arrays.toString(bytes));
      }
    }
  }
}