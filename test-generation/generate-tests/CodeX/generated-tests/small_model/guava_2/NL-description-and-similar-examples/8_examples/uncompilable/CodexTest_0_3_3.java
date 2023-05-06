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


public class CodexTest_0_3_3 { 
  @Test
    public static void testWriteBytesTo() {
        byte[] bytes = new byte[10];
        int offset = 0;
        int maxLength = bytes.length;
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength));
        assertEquals(0, new BitVector(0).writeBytesTo(bytes, offset, maxLength));
        assertEquals(0, new BitVector(0).writeBytesTo(bytes, offset, 0));
        assertEquals(0, new BitVector(0).writeBytesTo(bytes, offset, -1));
        assertEquals(0, new BitVector(0).writeBytesTo(bytes, offset, 1));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength + 1));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength - 1));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength + 1));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength - 1));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength + 1));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength - 1));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength + 1));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength - 1));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength + 1));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes, offset, maxLength));
        assertEquals(10, new BitVector(10).writeBytesTo(bytes
}