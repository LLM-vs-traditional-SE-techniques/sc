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


public class CodexTest_0_2_10 { 
  @Test
    public void testWriteBytesTo() {
        byte[] dest = new byte[10];
        dest[0] = (byte) 0xFF;
        dest[1] = (byte) 0xFF;
        dest[2] = (byte) 0xFF;
        dest[3] = (byte) 0xFF;
        dest[4] = (byte) 0xFF;
        dest[5] = (byte) 0xFF;
        dest[6] = (byte) 0xFF;
        dest[7] = (byte) 0xFF;
        dest[8] = (byte) 0xFF;
        dest[9] = (byte) 0xFF;
        BitSet bs = new BitSet(64);
        bs.set(0, 64);
        bs.writeBytesTo(dest, 2, 8);
        assertEquals((byte) 0xFF, dest[0]);
        assertEquals((byte) 0xFF, dest[1]);
        assertEquals((byte) 0xFF, dest[2]);
        assertEquals((byte) 0xFF, dest[3]);
        assertEquals((byte) 0xFF, dest[4]);
        assertEquals((byte) 0xFF, dest[5]);
        assertEquals((byte) 0xFF, dest[6]);
        assertEquals((byte) 0xFF, dest[7]);
        assertEquals((byte) 0xFF, dest[8]);
        assertEquals((byte) 0xFF, dest[9]);
    }
}