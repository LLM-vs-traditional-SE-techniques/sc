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


public class CodexTest_0_8_96 { 
  @Test
    public void testWriteBytesTo() {
        byte[] bytes = new byte[32];
        MutableBitArray b = new MutableBitArray(new byte[] { (byte) 0x81, 0x29 });
        int numBytesWritten = b.writeBytesTo(bytes, 0, 10);
        assertEquals(3, numBytesWritten);
        assertEquals((byte) 0x81, bytes[0]);
        assertEquals((byte) 0x29, bytes[1]);
        assertEquals((byte) 0x00, bytes[2]);
        assertEquals((byte) 0x00, bytes[3]);
        assertEquals((byte) 0x00, bytes[4]);
    }
}