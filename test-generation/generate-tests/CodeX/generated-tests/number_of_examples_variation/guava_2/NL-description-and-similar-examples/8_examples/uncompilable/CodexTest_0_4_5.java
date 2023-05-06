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


public class CodexTest_0_4_5 { 
  @Test
    public void testWriteBytesTo_maxLengthShorterThanBitLength() {
    byte[] dest = new byte[3];
    int maxLength = 2;
    int offset = 1;
    int numBytesWritten = bitArray.writeBytesTo(dest, offset, maxLength);
    assertEquals(maxLength, numBytesWritten);
    byte[] expected = {0, (byte) 0b1100_0000, 0};
    assertArrayEquals(expected, dest);
  }
}