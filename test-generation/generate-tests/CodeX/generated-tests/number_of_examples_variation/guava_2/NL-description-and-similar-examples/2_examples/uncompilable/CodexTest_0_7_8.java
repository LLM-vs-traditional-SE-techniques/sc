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


public class CodexTest_0_7_8 { 
  @Test
    public void testWriteBytesTo() {
        byte[] dest = new byte[6];
        dest[0] = (byte) 1;
        dest[1] = (byte) 2;
        dest[2] = (byte) 3;
        dest[3] = (byte) 4;
        dest[4] = (byte) 5;
        dest[5] = (byte) 6;
        int index = 2;
        int length = 4;
        byte[] result = new byte[6];
        result[0] = (byte) 1;
        result[1] = (byte) 2;
        result[2] = (byte) 0;
        result[3] = (byte) 0;
        result[4] = (byte) 0;
        result[5] = (byte) 6;
        assertEquals(4, LongMath.writeBytesTo(0L, dest, index, length));
        assertArrayEquals(result, dest);
        dest[0] = (byte) 1;
        dest[1] = (byte) 2;
        dest[2] = (byte) 3;
        dest[3] = (byte) 4;
        dest[4] = (byte) 5;
        dest[5] = (byte) 6;
        index =
}