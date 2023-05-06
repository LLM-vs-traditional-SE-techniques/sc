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


public class CodexTest_0_8_76 { 
  @Test
    public void testRainbowTable() throws Exception {
        long seed = 42;
        int length = 10;
        int numTests = 100;
        Random random = new Random(seed);
        for (int i = 0; i < numTests; i++) {
            int bytesToWrite = random.nextInt(length) + 1;
            byte[] expected = new byte[bytesToWrite];
            random.nextBytes(expected);
            byte[] dest = new byte[length];
            HashCode hc = HashCode.fromBytes(expected);
            int actualBytesWritten = hc.writeBytesTo(dest, 0, length);
            assertEquals(bytesToWrite, actualBytesWritten);
            assertThat(Arrays.copyOf(dest, bytesToWrite)).isEqualTo(expected);
        }
    }
}