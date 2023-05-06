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


public class CodexTest_0_6_32 { 
  @Test
        public void testWriteBytesTo() {
            byte[] dest = new byte[15];
            BitArray ba = new BitArray(new boolean[]{true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false});
            int maxLength = ba.writeBytesTo(dest, 0, dest.length);
            byte[] expected = {(byte) 0x55};
            byte[] result = new byte[maxLength];
            System.arraycopy(dest, 0, result, 0, maxLength);
            assertArrayEquals(expected, result);
        }
}