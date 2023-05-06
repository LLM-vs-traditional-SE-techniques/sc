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


public class CodexTest_0_7_62 { 
  @Test
  public void testWriteBytesTo_WithOffset() {
    byte[] dest = new byte[100];
    Arrays.fill(dest, (byte) 0xFF);
    BitArray arr = new BitArray(LEN, true);
    int writeBytesTo = arr.writeBytesTo(dest, 20, LEN / 8);
    assertEquals(LEN / 8, writeBytesTo);
    for (int i = 0; i < 20; i++) {
      assertEquals(0xFF, dest[i]);
    }
    for (int i = 20; i < 20 + LEN / 8; i++) {
      assertEquals(-1, dest[i]);
    }
    for (int i = 20 + LEN / 8; i < 100; i++) {
      assertEquals(0xFF, dest[i]);
    }
  }
}