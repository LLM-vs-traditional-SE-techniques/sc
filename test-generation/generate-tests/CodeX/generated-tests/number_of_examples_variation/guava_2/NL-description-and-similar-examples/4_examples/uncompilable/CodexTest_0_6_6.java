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


public class CodexTest_0_6_6 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 2;
    int maxLength = dest.length - offset;
    int length = writeBytesTo(dest, offset, maxLength);
    assertEquals(maxLength, length);
    for (int i = 0; i < offset; i++) {
      assertEquals(0, dest[i]);
    }
    for (int i = offset; i < dest.length; i++) {
      assertEquals((byte) i, dest[i]);
    }
  }
  public void testWriteBytesToEmpty() {
    byte[] dest = new byte[0];
    int offset = 0;
    int maxLength = dest.length - offset;
    int length = writeBytesTo(dest, offset, maxLength);
    assertEquals(0, length);
  }
  public void testWriteBytesToOutOfRange() {
    byte[] dest = new byte[10];
    int offset = 2;
    int maxLength = dest.length - offset + 1;
    int length = writeBytesTo(dest, offset, maxLength);
    assertEquals(dest.length - offset, length);
    for (int i = 0; i < offset; i++) {
      assertEquals(0, dest[i]);
    }
    for (int i = offset; i < dest.length; i++) {
      assertEquals((byte) i, dest[i]);
    }
  }
}