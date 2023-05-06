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


public class CodexTest_0_3_28 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[20];
    int offset = 5;
    int maxLength = 10;
    byte[] bytes = new byte[10];
    for (int i = 0; i < bytes.length; i++) {
      bytes[i] = (byte) i;
    }
    BitArray bits = BitArray.fromBytes(bytes);
    int numBytesWritten = bits.writeBytesTo(dest, offset, maxLength);
    assertEquals(maxLength, numBytesWritten);
    for (int i = 0; i < bytes.length; i++) {
      assertEquals(bytes[i], dest[offset + i]);
    }
  }
}