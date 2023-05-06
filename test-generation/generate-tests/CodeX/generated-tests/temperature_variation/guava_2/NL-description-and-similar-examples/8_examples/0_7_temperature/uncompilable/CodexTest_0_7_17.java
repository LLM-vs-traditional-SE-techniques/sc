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


public class CodexTest_0_7_17 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[4];
    dest[0] = (byte) 0xAB;
    dest[1] = (byte) 0xCD;
    dest[2] = (byte) 0xEF;
    dest[3] = (byte) 0x42;
    int len = Ints.checkedCast(Math.ceil(5.5));
    BitArray bits = new BitArray(5);
    bits.set(0);
    bits.set(2);
    bits.set(4);
    bits.writeBytesTo(dest, 1, len);
    assertEquals(0xAB, dest[0] & 0xFF);
    assertEquals(0xA3, dest[1] & 0xFF);
    assertEquals(0xEF, dest[2] & 0xFF);
    assertEquals(0x42, dest[3] & 0xFF);
  }
}