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


public class CodexTest_0_5_6 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = new byte[8];
    BitArray bits = new BitArray(64);
    bits.set(0, 64, true);
    bits.writeBytesTo(bytes, 0, bytes.length);
    for (byte b : bytes) {
      assertEquals(0xff, b & 0xff);
    }
    bits.writeBytesTo(bytes, 0, bytes.length - 1);
    assertEquals(0xff, bytes[0] & 0xff);
    assertEquals(0x80, bytes[1] & 0xff);
    for (int i = 2; i < bytes.length; i++) {
      assertEquals(0x00, bytes[i] & 0xff);
    }
  }
}