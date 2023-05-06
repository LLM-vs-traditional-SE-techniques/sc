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


public class CodexTest_0_8_3 { 
  @Test
     public void testToByteArrayPartial() {
        byte[] testData = new byte[8];
        assertEquals(3, h3.writeBytesTo(testData, 1, 3));
        assertEquals((byte) 0x4c, testData[1]);
        assertEquals((byte) 0xcd, testData[2]);
        assertEquals((byte) 0x4c, testData[3]);
        // ... same for h1
    }
    public void testToByteArrayAll() {
        byte[] testData = new byte[32];
        assertEquals(32, h3.writeBytesTo(testData, 0, 32));
        // verify contents of testData ..
    }
     public void testToByteArrayPartial() throws Exception {
        byte[] testData = new byte[8];
        assertEquals(5, h1.writeBytesTo(testData, 1, 5));
        assertEquals((byte) 0xa4, testData[1]);
        assertEquals((byte) 0x71, testData[2]);
        assertEquals((byte) 0x75, testData[3]);
        assertEquals((byte) 0x41, testData[4]);
        assertEquals((byte) 0x0d, testData[5]);
}