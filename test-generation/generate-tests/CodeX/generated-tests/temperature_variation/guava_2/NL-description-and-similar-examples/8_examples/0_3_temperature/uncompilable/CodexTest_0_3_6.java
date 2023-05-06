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


public class CodexTest_0_3_6 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 3;
    int maxLength = 4;
    int bits = bits();
    int bytes = bits / 8;
    int length = Math.min(maxLength, bytes);
    HashCode hashCode = newHashCode(bits);
    assertEquals(length, hashCode.writeBytesTo(dest, offset, maxLength));
    byte[] expected = new byte[10];
    System.arraycopy(hashCode.asBytes(), 0, expected, offset, length);
    assertTrue(Arrays.equals(expected, dest));
  }
}