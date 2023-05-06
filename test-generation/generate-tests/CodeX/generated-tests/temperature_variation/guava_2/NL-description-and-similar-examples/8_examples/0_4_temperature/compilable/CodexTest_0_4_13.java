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


public class CodexTest_0_4_13 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    HashCode hashCode = Hashing.sha1().hashString("foo", Charsets.US_ASCII);
    int bytesWritten = hashCode.writeBytesTo(dest, 1, 6);
    assertEquals(6, bytesWritten);
    assertEquals(0, dest[0]);
    assertEquals(0, dest[7]);
    byte[] expected = {
      (byte) 0xda, (byte) 0x39, (byte) 0xa3, (byte) 0xee, (byte) 0x5e, (byte) 0x6b,
      (byte) 0x4b, (byte) 0x0d, (byte) 0x32, (byte) 0x55, (byte) 0xbf, (byte) 0xef,
      (byte) 0x95, (byte) 0x60, (byte) 0x18, (byte) 0x90, (byte) 0xaf, (byte) 0xd8,
      (byte) 0x07, (byte) 0x09
    };
    assertTrue(Arrays.equals(expected, dest));
  }

}