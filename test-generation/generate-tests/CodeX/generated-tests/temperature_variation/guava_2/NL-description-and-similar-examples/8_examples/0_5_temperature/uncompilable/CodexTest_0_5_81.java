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


public class CodexTest_0_5_81 { 
  @Test
      public void testWriteBytesTo() {
        byte[] dest = new byte[8];
        BitArray bits = new BitArray(new byte[] {0b10101010, 0b01010101, 0b11110000});
        bits.writeBytesTo(dest, 0, dest.length);
        assertEquals(0b10101010, dest[0]);
        assertEquals(0b01010101, dest[1]);
        assertEquals(0b11110000, dest[2]);
        assertEquals(0, dest[3]);
        assertEquals(0, dest[4]);
        assertEquals(0, dest[5]);
        assertEquals(0, dest[6]);
        assertEquals(0, dest[7]);
      }
}