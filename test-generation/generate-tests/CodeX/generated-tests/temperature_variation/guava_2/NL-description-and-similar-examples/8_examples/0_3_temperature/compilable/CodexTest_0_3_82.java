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


public class CodexTest_0_3_82 { 
  @Test
    public void testWriteBytesTo() {
        byte[] expected = new byte[] {(byte) 0xab, (byte) 0xcd, (byte) 0xef, (byte) 0x01};
        byte[] dest = new byte[4];
        HashCode hashCode = HashCode.fromInt(0x01efcdab);
        int bytesWritten = hashCode.writeBytesTo(dest, 0, 4);
        assertEquals(4, bytesWritten);
        assertTrue(Arrays.equals(expected, dest));
    }
}