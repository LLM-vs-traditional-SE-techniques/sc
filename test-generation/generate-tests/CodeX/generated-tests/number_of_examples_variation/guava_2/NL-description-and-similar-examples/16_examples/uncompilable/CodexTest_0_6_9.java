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


public class CodexTest_0_6_9 { 
  @Test
    public void testWriteBytesTo() {
        byte[] dest = new byte[5];
        BitArray bits = new BitArray(12);
        bits.set(0);
        bits.set(3);
        bits.set(4);
        bits.set(5);
        bits.set(11);
        bits.writeBytesTo(dest, 0, 4);
        assertEquals(1, dest[0]);
        assertEquals(0x18, dest[1]);
        assertEquals(0x1, dest[2]);
        assertEquals(0, dest[3]);
        assertEquals(0, dest[4]);
    }
}