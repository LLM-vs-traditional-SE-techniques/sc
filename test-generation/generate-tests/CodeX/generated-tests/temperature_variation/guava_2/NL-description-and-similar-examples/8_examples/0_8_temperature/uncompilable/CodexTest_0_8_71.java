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


public class CodexTest_0_8_71 { 
  @Test
        public static void testPartialBytesTo() {
    byte[] bytes = new byte[32];
    for (int n = 0; n <= 32; n++) {
      byte[] bytesCopy = Arrays.copyOf(bytes, bytes.length);
      HashCode hc = fromBytesNoCopy(bytesCopy);
      byte[] expected = new byte[n];
      assertEquals(n, hc.writeBytesTo(expected, 0, n));
      byte[] actual = new byte[n];
      System.arraycopy(bytes, 0, actual, 0, n);
      assertTrue(Arrays.equals(expected, actual));
    }
  }

}