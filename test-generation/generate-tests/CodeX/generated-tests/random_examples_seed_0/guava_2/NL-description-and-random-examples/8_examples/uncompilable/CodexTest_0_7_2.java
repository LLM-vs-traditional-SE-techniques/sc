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


public class CodexTest_0_7_2 { 
  @Test
    public void testWriteBytesTo_twoBytes() {
        List<Integer> values = Arrays.asList(0xC, 0xD, 0xE);
        ImmutableBitArray bitArray = new ImmutableBitArray(values);
        byte[] dest = new byte[4];
        int numBytesWritten = bitArray.writeBytesTo(dest, 1, 2);
        assertEquals(2, numBytesWritten);
        assertEquals(0, dest[0]);
        assertEquals(0x0C, dest[1]);
        assertEquals(0x0D, dest[2]);
        assertEquals(0, dest[3]);
    }
}