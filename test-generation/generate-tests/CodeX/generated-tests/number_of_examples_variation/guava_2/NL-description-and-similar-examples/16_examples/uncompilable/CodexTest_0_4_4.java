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


public class CodexTest_0_4_4 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int written = new BitArray(new int[] {0x12345678}).writeBytesTo(dest, 1, 4);
    assertEquals(4, written);
    assertEquals(0x12, dest[1] & 0xFF);
    assertEquals(0x34, dest[2] & 0xFF);
    assertEquals(0x56, dest[3] & 0xFF);
    assertEquals(0x78, dest[4] & 0xFF);
    assertEquals(0, dest[0] & 0xFF);
    assertEquals(0, dest[5] & 0xFF);
    assertEquals(0, dest[6] & 0xFF);
    assertEquals(0, dest[7] & 0xFF);
    assertEquals(0, dest[8] & 0xFF);
    assertEquals(0, dest[9] & 0xFF);
  }
}