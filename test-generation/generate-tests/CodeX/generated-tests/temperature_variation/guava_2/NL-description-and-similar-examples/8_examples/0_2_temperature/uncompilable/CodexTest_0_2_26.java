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


public class CodexTest_0_2_26 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[20];
    int offset = 5;
    int maxLength = 10;
    int bits = bits();
    int bytes = bits / 8;
    int length = Ints.min(maxLength, bytes);
    HashCode hashCode = HashCode.fromInt(42);
    int written = hashCode.writeBytesTo(dest, offset, maxLength);
    assertEquals(length, written);
    byte[] expected = new byte[offset + length];
    System.arraycopy(hashCode.asBytes(), 0, expected, offset, length);
    assertTrue(Arrays.equals(expected, dest));
  }
}