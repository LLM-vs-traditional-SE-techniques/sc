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


public class CodexTest_0_9_52 { 
  @Test
            public void testForEachByte() {
            int value = 0xC3455DC7;
            int bitOffset = 2;
            int bitLength = 30;
            int bitCount = bitLength * 2;
            for (int i = 0; i < bitCount; i++) {
            ByteProcessor processor = new AssertProcessor((i % 8) + bitOffset);
            Bits.forEachByte(value, i, processor);
            assertEquals("Loop " + i, 8, processor.byteCount());
            }
            }
}