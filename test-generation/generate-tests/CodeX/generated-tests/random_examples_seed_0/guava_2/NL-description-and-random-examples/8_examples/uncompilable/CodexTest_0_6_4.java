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


public class CodexTest_0_6_4 { 
  @Test
    public static void testWriteBytesTo() {
        byte[] expected = new byte[3];
        expected[0] = (byte) 0x80;
        expected[1] = 0x01;
        expected[2] = (byte) 0x80;
        byte[] dest = new byte[expected.length];
        BitArray ba = new BitArray(new byte[] { (byte) 0x80, 0x01, (byte) 0x80 });
        assertEquals(expected.length, ba.writeBytesTo(dest, 0, dest.length));
        assertArrayEquals(expected, dest);
    }
}