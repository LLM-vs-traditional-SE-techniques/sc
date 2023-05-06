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


public class CodexTest_0_5_19 { 
  @Test
    public void testWriteBytesTo() {
    byte[] expected = {(byte) 0xab, (byte) 0xcd, (byte) 0xef, (byte) 0x01};
    byte[] dest = new byte[4];
    BitArray bitArray = BitArray.fromBytes(expected);
    int length = bitArray.writeBytesTo(dest, 0, 4);
    assertEquals(4, length);
    assertTrue(Arrays.equals(expected, dest));
  }
}