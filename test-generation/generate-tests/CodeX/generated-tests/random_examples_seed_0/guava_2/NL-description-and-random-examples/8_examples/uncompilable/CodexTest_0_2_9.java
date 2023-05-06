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


public class CodexTest_0_2_9 { 
  @Test
    public void testWriteBytesTo() {
        byte[] dest = new byte[10];
        int offset = 3;
        int maxLength = 4;
        int bits = 32;
        int bytes = bits / 8;
        int length = Math.min(maxLength, bytes);
        int expectedLength = length;
        int expectedOffset = offset + length;
        byte[] expectedDest = new byte[10];
        System.arraycopy(dest, 0, expectedDest, 0, offset);
        System.arraycopy(new byte[length], 0, expectedDest, offset, length);
        BitArray bitArray = new BitArray(bits);
        bitArray.writeBytesTo(dest, offset, maxLength);
        assertEquals(expectedLength, bitArray.writeBytesTo(dest, offset, maxLength));
        assertArrayEquals(expectedDest, dest);
    }
}