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


public class CodexTest_0_9_4 { 
  @Test
    public void testWriteBytes() {
        int[] bitLengths = {1, 2, 4, 8, 15, 24, 56, 64, 255, 256, 300};
        for (int bitLength : bitLengths) {
            BitArray bits = new BitArray();
            int numBytes = bits.bits() / 8;
            Random rnd = new Random(bitLength);
            for (int i = 0; i < numBytes; i++) {
                int rand = rnd.nextInt();
                rand >>= rand & (1 << (Byte.SIZE - 1)); // clear the MSB
                if (rand < 0) {
                    rand += (1 << Byte.SIZE);
                }
                bits.appendByte((byte) rand);
            }
            byte[] bytes = new byte[12];
            Arrays.fill(bytes, (byte) 0xff);
            bytes[bytes.length - 1] = 0;
            int cnt = bits.writeBytesTo(bytes, 0, bytes.length);
            assertTrue("Too few bytes written", cnt <= bytes.length);        
        }
    }
}