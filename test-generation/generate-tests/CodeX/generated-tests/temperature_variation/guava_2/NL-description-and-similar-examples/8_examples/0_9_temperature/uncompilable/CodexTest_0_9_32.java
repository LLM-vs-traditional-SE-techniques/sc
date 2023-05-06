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


public class CodexTest_0_9_32 { 
  @Test
  public void testWriteBytesToDestOffsetFewerThanMaxLength() {
    byte[] expectedBytes = new byte[] {0x12, 0x34, (byte) 0xab, (byte) 0x9d};
    byte[] dest = new byte[5];
    dest[0] = (byte) ~expectedBytes[0]; // writeBytesTo must not change dest[0]
    BitArray array = new BitArray(expectedBytes.length * 8);
    array.writeBytesTo(expectedBytes, 0, expectedBytes.length * 8);
    int written = array.writeBytesTo(dest, 1, 2);
    assertEquals(2, written);
    assertEquals(~expectedBytes[0], dest[0]);
    assertEquals(expectedBytes[0], dest[1]);
    assertEquals(expectedBytes[1], dest[2]);
    assertEquals(0, dest[3]);
    assertEquals(0, dest[4]);
  }
  */
}