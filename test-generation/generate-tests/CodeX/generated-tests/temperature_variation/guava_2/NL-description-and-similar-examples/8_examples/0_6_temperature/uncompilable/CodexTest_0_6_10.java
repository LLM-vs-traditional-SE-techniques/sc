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


public class CodexTest_0_6_10 { 
  @Test
    public void testWriteBytesTo() {
        byte[] dest = new byte[4];
        BitArray bits = BitArray.fromBitString("1011");
        int n = bits.writeBytesTo(dest, 0, 2);
        assertEquals(2, n);
        assertEquals(0b10110000, dest[0]);
        assertEquals(0b00000000, dest[1]);
        assertEquals(0b00000000, dest[2]);
        assertEquals(0b00000000, dest[3]);
    }
}