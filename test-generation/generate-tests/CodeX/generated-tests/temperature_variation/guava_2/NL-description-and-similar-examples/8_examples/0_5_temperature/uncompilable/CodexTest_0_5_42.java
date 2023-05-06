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


public class CodexTest_0_5_42 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[5];
    int bits = 32;
    BitArray bitArray = new BitArray(bits, new byte[] {(byte) 0xFF});
    int bytesWritten = bitArray.writeBytesTo(dest, 0, dest.length);
    assertEquals(4, bytesWritten);
    assertEquals((byte) 0xFF, dest[0]);
    assertEquals((byte) 0xFF, dest[1]);
    assertEquals((byte) 0xFF, dest[2]);
    assertEquals((byte) 0xFF, dest[3]);
    assertEquals((byte) 0x00, dest[4]);
  }
}