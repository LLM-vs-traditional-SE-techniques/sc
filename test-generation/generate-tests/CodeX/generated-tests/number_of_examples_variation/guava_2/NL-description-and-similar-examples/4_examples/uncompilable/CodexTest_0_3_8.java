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


public class CodexTest_0_3_8 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    for (int i = 0; i < dest.length; i++) {
      dest[i] = (byte) 0xFF;
    }
    BitArray bits = new BitArray(64);
    bits.set(0, 64);
    bits.writeBytesTo(dest, 0, 8);
    for (int i = 0; i < dest.length; i++) {
      assertEquals((byte) 0xFF, dest[i]);
    }
    bits.writeBytesTo(dest, 0, 7);
    for (int i = 0; i < dest.length - 1; i++) {
      assertEquals((byte) 0xFF, dest[i]);
    }
    assertEquals((byte) 0x7F, dest[7]);
  }
}