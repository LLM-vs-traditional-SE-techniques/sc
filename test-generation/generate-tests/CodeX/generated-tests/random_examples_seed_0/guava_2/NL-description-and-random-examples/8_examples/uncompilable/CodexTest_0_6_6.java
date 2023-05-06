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


public class CodexTest_0_6_6 { 
  @Test
    public void testWriteBytesTo() {
        byte[] dest = new byte[LENGTH];
        int written = new BitArray(LENGTH).writeBytesTo(dest, 0, LENGTH);
        assertEquals(LENGTH, written);
        for (int i = 0; i < LENGTH; i++) {
            assertEquals(0, dest[i]);
        }
        written = new BitArray(LENGTH).writeBytesTo(dest, LENGTH / 2, LENGTH / 2);
        assertEquals(LENGTH / 2, written);
        for (int i = 0; i < LENGTH / 2; i++) {
            assertEquals(0, dest[i + LENGTH / 2]);
        }
        written = new BitArray(LENGTH).writeBytesTo(dest, LENGTH / 2, LENGTH);
        assertEquals(LENGTH / 2, written);
        for (int i = 0; i < LENGTH / 2; i++) {
            assertEquals(0, dest[i + LENGTH / 2]);
        }
    }
}