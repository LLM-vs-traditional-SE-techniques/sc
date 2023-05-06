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


public class CodexTest_0_8_98 { 
  @Test
  public void testWriteBytesToMethod() {
    byte[] dest = new byte[4];
    for (int n = 0; n <= 4; n++) {
      for (int length = 0; length <= n; length++) {
        HashCode hashCode = HashCode.fromInt(n);
        int bytesWritten = hashCode.writeBytesTo(dest, 0, length);
        assertEquals(Math.min(length, 4), bytesWritten);
        byte[] expected = new byte[4];
        System.arraycopy(hashCode.asBytes(), 0, expected, 0, bytesWritten);
        assertTrue(Arrays.equals(expected, dest));
      }
    }
  }
}