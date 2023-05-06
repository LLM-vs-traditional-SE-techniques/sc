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


public class CodexTest_0_8_10 { 
  @Test
    public void testReadIntFromAllBytes() {
        final int numElements = 10;
        final int bitSize = 32;
        final int offset = 0;
        final int maxLength = numElements * bitSize;
        final byte[] source = new byte[maxLength];
        Random.nextBytes(source);
        final ByteBuffer buffer = ByteBuffer.wrap(source);
        final DynamicBitVector vector = new DynamicBitVector(buffer, numElements);
        final int[] ints = new int[numElements];
        vector.readIntsFromAllBytes(ints, offset);
        for ( int i = 0; i < numElements; i++ ) {
            final int value = i * bitSize;
            assertEquals(value, ints[i]);
        }
    }
Output:
    public void testReadBytesFromAllBytes() {
        final int numElements = 10;
        final int maxLength = numElements * 4;
        final byte[] source = new byte[maxLength];
        Random.nextBytes(source);
        final ByteBuffer buffer = ByteBuffer.wrap(source);
        final DynamicBitVector vector = new DynamicBitVector(buffer, numElements);
        final byte[] dest1 = new byte[maxLength];
        vector.readBytesFromAllBytes(dest1);
        assertArrayEquals(source, dest1);
        final byte[] dest2 = new byte[maxLength];
        vector.readBytesFromAllBytes(dest2, 0, numElements);
        assertArrayEquals(source, dest2);
    }
Output:
    public void testReadBitsFromAllBytes() {
        final int bitSize = 8;
        final int numElements = 10;
        final byte[] source = new byte[numElements * bitSize];
        Random.nextBytes(source);
        final ByteBuffer buffer = ByteBuffer.wrap(source);
        final DynamicBitVector vector = new DynamicBitVector(buffer, numElements);
        final byte[] dest1 = new byte[numElements * bitSize];
        vector.readBytesFromAllBytes(dest1);
        assertArrayEquals(source, dest1);
        final byte[] dest2 = new byte[numElements * bitSize];
        vector.readBytesFromAllBytes(dest2, 0, numElements);
        assertArrayEquals(source, dest2);
    }
Output:
    public void testReadBitsFromAllBytes() {
        final int bitSize = 8;
        final int numElements = 10;
        final byte[] source = new byte[numElements * bitSize];
        Random.nextBytes(source);
        final ByteBuffer buffer = ByteBuffer.wrap(source);
        final DynamicBitVector vector = new DynamicBitVector(buffer, numElements
}