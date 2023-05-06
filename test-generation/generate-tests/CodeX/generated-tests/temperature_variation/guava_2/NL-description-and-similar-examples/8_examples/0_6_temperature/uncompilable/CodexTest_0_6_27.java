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


public class CodexTest_0_6_27 { 
  @Test
    public void testWriteBytesTo_OneByte() {
    byte[] dest = new byte[4];
    BitArray bits = new BitArray(Byte.SIZE + 1);
    bits.set(Byte.SIZE);
    int numBytesWritten = bits.writeBytesTo(dest, Byte.SIZE / 8, dest.length);
    byte[] expected = new byte[] { (byte) 0x80, 0x00, 0x00, 0x00 };
    assertEquals(1, numBytesWritten);
    assertTrue(Arrays.equals(expected, dest));
  }
}