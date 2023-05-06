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


public class CodexTest_0_8_66 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
    byte[] dest = new byte[bytes.length * 3];
    IntArray bitArray = IntArray.fromBytes(bytes);
    int offset = bytes.length;
    int maxLength = bytes.length * 2;
    bitArray.writeBytesTo(dest, offset, maxLength);
    for (int i = 0; i < bytes.length; i++) {
      assertEquals(dest[offset + i + bytes.length], bytes[i]);
    }
    assertEquals(dest[offset + maxLength], 0);
    assertEquals(dest[offset + maxLength + 1], 0);
  }
}