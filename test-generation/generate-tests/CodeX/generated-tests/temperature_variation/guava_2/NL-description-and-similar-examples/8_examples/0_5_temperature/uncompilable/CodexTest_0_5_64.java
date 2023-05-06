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


public class CodexTest_0_5_64 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[4];
    for (int i = 0; i < 4; i++) {
      dest[i] = (byte) 0xFF;
      assertEquals(i, bits.writeBytesTo(dest, 0, i));
      for (int j = 0; j < i; j++) {
        assertEquals(j + "th byte in " + i + " byte output",
            (byte) 0xFF, dest[j]);
      }
      for (int j = i; j < 4; j++) {
        assertEquals(j + "th byte in " + i + " byte output",
            (byte) 0x00, dest[j]);
      }
    }
  }
}