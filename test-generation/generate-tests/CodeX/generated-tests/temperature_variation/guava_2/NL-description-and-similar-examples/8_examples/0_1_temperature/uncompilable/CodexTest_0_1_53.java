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


public class CodexTest_0_1_53 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 1;
    int maxLength = 5;
    int bits = bits();
    int minLength = Math.min(maxLength, bits / 8);
    int length = minLength;
    int end = offset + length;
    assertEquals(length, writeBytesTo(dest, offset, maxLength));
    assertEquals(bits, bits());
    assertEquals(length, end - offset);
    assertEquals(0, dest[offset - 1]);
    assertEquals(0, dest[end]);
    assertEquals(0, dest[end + 1]);
    assertEquals(0, dest[end + 2]);
    assertEquals(0, dest[end + 3]);
    assertEquals(0, dest[end + 4]);
    assertEquals(0, dest[end + 5]);
    assertEquals(0, dest[end + 6]);
    assertEquals(0, dest[end + 7]);
    assertEquals(0, dest[end + 8]);
    assertEquals(0, dest[end + 9]);
  }
}