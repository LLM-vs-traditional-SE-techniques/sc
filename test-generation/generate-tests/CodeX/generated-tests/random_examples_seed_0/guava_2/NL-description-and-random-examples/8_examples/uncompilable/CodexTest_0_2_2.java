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


public class CodexTest_0_2_2 { 
  @Test
    public void testWriteBytesTo() {
        byte[] dest = new byte[10];
        BitArray array = new BitArray(10);
        array.set(3, true);
        array.set(4, true);
        array.set(5, true);
        array.set(6, true);
        array.set(7, true);
        array.set(8, true);
        array.set(9, true);
        array.writeBytesTo(dest, 0, 10);
        assertEquals(0, dest[0]);
        assertEquals(0, dest[1]);
        assertEquals(0, dest[2]);
        assertEquals(0, dest[3]);
        assertEquals(0, dest[4]);
        assertEquals(0, dest[5]);
        assertEquals(0, dest[6]);
        assertEquals(0, dest[7]);
        assertEquals(0, dest[8]);
        assertEquals(0, dest[9]);
    }
}