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


public class CodexTest_0_9_37 { 
  @Test
    public void testWriteLongHashCodeToByteArray() {
        byte expectedBytes[] = {(byte) 0x01, (byte) 0x02, (byte) 0x03,
                (byte) 0x04, (byte) 0x05, (byte) 0x06, (byte) 0x07,
                (byte) 0x08, (byte) 0x09, (byte) 0x0a, (byte) 0x0b,
                (byte) 0x0c, (byte) 0x0d, (byte) 0x0e, (byte) 0x0f,
                (byte) 0x10};
        HashCode hashCode = HashCode.fromLong(0x000102030405060708090a0b0c0d0e0f10L);
        byte actualBytes[] = new byte[hashCode.bits() / 8];
        int bytesWritten = hashCode.writeBytesTo(actualBytes, 0, actualBytes.length);
        assertEquals("16 bytes expected", expectedBytes.length, bytesWritten);
        assertEquals("16 bytes expected", expectedBytes.length, hashCode.writeBytesTo(actualBytes, 0, actualBytes.length));
        assertArrayEquals("16 bytes expected", expectedBytes, actualBytes);
}