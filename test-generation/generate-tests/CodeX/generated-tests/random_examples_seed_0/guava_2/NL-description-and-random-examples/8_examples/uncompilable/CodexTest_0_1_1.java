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


public class CodexTest_0_1_1 { 
  @Test
    public void testWriteBytesTo() {
        byte[] dest = new byte[10];
        BitArray bitArray = new BitArray(new byte[] {0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10});
        int offset = 1;
        int maxLength = 5;
        int length = bitArray.writeBytesTo(dest, offset, maxLength);
        assertEquals(5, length);
        assertEquals(0x01, dest[0]);
        assertEquals(0x02, dest[1]);
        assertEquals(0x03, dest[2]);
        assertEquals(0x04, dest[3]);
        assertEquals(0x05, dest[4]);
        assertEquals(0x00, dest[5]);
        assertEquals(0x00, dest[6]);
        assertEquals(0x00, dest[7]);
        assertEquals(0x00, dest[8]);
        assertEquals(0x00, dest[9]);
    }
}