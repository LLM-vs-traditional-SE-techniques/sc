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


public class CodexTest_0_6_49 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[Longs.BYTES];
    long val = 0x0123456789ABCDEFL;
    int numBytes = Longs.BYTES - 1;
    Longs.writeBytes(val, dest, 1, numBytes);
    byte[] expected = new byte[Longs.BYTES];
    expected[0] = 0;
    for (int i = 0; i < numBytes; i++) {
      expected[i + 1] = (byte) (val >> ((Longs.BYTES - i - 1) * 8));
    }
    assertTrue(Arrays.equals(expected, dest));
  }
}