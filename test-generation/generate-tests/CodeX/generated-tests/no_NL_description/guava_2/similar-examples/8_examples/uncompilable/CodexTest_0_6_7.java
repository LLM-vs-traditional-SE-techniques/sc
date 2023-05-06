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


public class CodexTest_0_6_7 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = new byte[] {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
        (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
        (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
        (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
        (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
        (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
        (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
        (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
    BitArray bits = new BitArray(bytes);
    byte[] dest = new byte[32];
    assertEquals(32, bits.writeBytesTo(dest, 0, 32));
    assertEquals(new BitArray(dest), bits);
    assertEquals(16, bits.writeBytesTo(dest, 0, 16));
    for (int i = 0; i < 16; i++) {
      assertEquals(bytes[i], dest[i]);
    }
    for (int i = 16; i < 32; i++) {
      assertEquals(0, dest[i]);
    }
    assertEquals(16, bits.writeBytesTo(dest, 16, 16));
    for (int i = 0; i < 32; i++) {
      assertEquals(bytes[i], dest[i]);
    }
  }
}