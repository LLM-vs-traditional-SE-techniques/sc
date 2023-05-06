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


public class CodexTest_0_8_53 { 
  @Test
    public void testToByteArray() {
        BitArray ba = BitArray.createBitArray(10);
        ba.put(0, true); // 0001
        ba.put(1, true); // 0011
        ba.put(2, true); // 0111
        ba.put(3, true); // 1111
        ba.put(4, true); //1111 1111
        ba.put(5, true); //1111 1111 1111 1111
        ba.put(6, true); //1111 1111 1111 1111 1111 1111
        ba.put(7, true); //1111 1111 1111 1111 1111 1111 1111 1111
        byte[] a = ba.toByteArray();
        assertEquals(0xff, a[0]);
        assertEquals(0xff, a[1]);
        assertEquals(0xff, a[2]);
        assertEquals(0xff, a[3]);
        assertEquals(0xf0, a[4]);
        assertEquals(0x00, a[5]);
    }
}