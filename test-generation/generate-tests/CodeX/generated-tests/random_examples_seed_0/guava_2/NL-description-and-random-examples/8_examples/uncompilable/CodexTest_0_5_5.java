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


public class CodexTest_0_5_5 { 
  @Test
    public void testWriteBytesTo1() {
        BitArray bits = BitArray.create(new int[] {0b10101010, 0b11110000});
        byte[] bytes = new byte[4];
        bits.writeBytesTo(bytes, 1, 2);
        assertEquals(0b00000000, bytes[0]);
        assertEquals(0b10101010, bytes[1]);
        assertEquals(0b11110000, bytes[2]);
        assertEquals(0b00000000, bytes[3]);
    }
}