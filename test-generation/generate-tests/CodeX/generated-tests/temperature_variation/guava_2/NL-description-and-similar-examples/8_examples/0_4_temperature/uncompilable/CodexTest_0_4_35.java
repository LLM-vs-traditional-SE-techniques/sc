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


public class CodexTest_0_4_35 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[3];
    BitArray ba = new BitArray(new byte[] {(byte) 0xF0, (byte) 0x0F}, 12);
    assertEquals(3, ba.writeBytesTo(dest, 0, 3));
    assertEquals((byte) 0xFF, dest[0]);
    assertEquals((byte) 0xFF, dest[1]);
    assertEquals((byte) 0x0F, dest[2]);
  }
}