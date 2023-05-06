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


public class CodexTest_0_1_6 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 2;
    int maxLength = 5;
    int bits = bits();
    int bytes = bits / 8;
    int length = Ints.min(maxLength, bytes);
    assertEquals(length, writeBytesTo(dest, offset, maxLength));
    assertEquals(0, dest[0]);
    assertEquals(0, dest[1]);
    assertEquals(0, dest[length + offset]);
    assertEquals(0, dest[length + offset + 1]);
    assertEquals(0, dest[length + offset + 2]);
    assertEquals(0, dest[length + offset + 3]);
    assertEquals(0, dest[length + offset + 4]);
    assertEquals(0, dest[length + offset + 5]);
    assertEquals(0, dest[length + offset + 6]);
    assertEquals(0, dest[length + offset + 7]);
    assertEquals(0, dest[length + offset + 8]);
    assertEquals(0, dest[length + offset + 9]);
  }
}