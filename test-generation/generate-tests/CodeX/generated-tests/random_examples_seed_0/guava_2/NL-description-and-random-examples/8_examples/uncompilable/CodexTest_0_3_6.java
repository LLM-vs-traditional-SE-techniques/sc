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


public class CodexTest_0_3_6 { 
  @Test
    public void testWriteBytesTo() {
        for (int i = 0; i < 100; i++) {
            BitArray a = randomBitArray(i);
            byte[] bytes = new byte[i / 8 + 1];
            int written = a.writeBytesTo(bytes, 0, bytes.length);
            assertEquals(i / 8 + 1, written);
            BitArray b = BitArray.fromBytes(bytes);
            assertEquals(a, b);
        }
    }
}