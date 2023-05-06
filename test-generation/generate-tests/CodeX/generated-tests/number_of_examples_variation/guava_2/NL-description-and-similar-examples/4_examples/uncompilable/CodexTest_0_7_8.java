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
    public void testSerialization() {
        LongArrayBitArray bitArray = new LongArrayBitArray(64);
        bitArray.set(0, 64);
        byte[] bytes = bitArray.toByteArray();
        LongArrayBitArray deserialized = LongArrayBitArray.from(bytes);
        assertArrayEquals(bitArray.m_Array, deserialized.m_Array);
    }
```
}