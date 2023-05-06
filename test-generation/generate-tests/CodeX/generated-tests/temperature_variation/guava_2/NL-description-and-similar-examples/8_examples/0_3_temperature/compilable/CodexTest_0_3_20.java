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


public class CodexTest_0_3_20 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    int offset = 1;
    int maxLength = 4;
    HashCode hash = Hashing.sha1().hashLong(42);
    int bytesWritten = hash.writeBytesTo(dest, offset, maxLength);
    assertEquals(maxLength, bytesWritten);
    assertEquals(0, dest[0]);
    assertEquals(0, dest[5]);
    assertEquals(0, dest[6]);
    assertEquals(0, dest[7]);
    byte[] expected = new byte[4];
    System.arraycopy(hash.asBytes(), 0, expected, 0, 4);
    assertTrue(Arrays.equals(expected, Arrays.copyOfRange(dest, offset, offset + maxLength)));
  }
}