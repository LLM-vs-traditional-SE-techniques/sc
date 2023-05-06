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


public class CodexTest_0_5_7 { 
  @Test
    public void testWriteBytesTo() {
        byte[] bytes = new byte[3];
        BitSet bs = new BitSet(16);
        bs.set(1);
        bs.set(3);
        bs.set(5);
        bs.set(6);
        bs.set(8);
        bs.set(9);
        bs.set(10);
        bs.set(12);
        bs.set(13);
        bs.set(14);
        bs.set(15);
        bs.writeBytesTo(bytes, 0, 3);
        assertEquals(0b01110101, bytes[0]);
        assertEquals(0b11010101, bytes[1]);
        assertEquals(0b01010000, bytes[2]);
    }
}