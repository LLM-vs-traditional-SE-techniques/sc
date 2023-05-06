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


public class CodexTest_0_4_74 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[16];
    int offset = 1;
    int maxLength = 10;
    int actualLength = Hashing.sha256().hashInt(42).writeBytesTo(dest, offset, maxLength);
    assertEquals(maxLength, actualLength);
    byte[] expected = new byte[16];
    expected[0] = 0;
    expected[15] = 0;
    System.arraycopy(new byte[] {
        (byte) 0x6b, (byte) 0xc1, (byte) 0xbe, (byte) 0xe2,
        (byte) 0x2e, (byte) 0x40, (byte) 0x9f, (byte) 0x96,
        (byte) 0xe9, (byte) 0x3d, (byte) 0x7e, (byte) 0x11,
        (byte) 0x73, (byte) 0x93, (byte) 0x17, (byte) 0x2a
    }, 0, expected, 1, maxLength);
    assertTrue(Arrays.equals(expected, dest));
  }
}