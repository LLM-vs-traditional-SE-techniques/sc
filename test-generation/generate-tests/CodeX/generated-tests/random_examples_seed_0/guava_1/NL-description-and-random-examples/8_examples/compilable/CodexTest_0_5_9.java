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


public class CodexTest_0_5_9 { 
  @Test
    public void testFromLong() {
        HashCode hc = HashCode.fromLong(0x123456789abcdef0L);
        assertEquals(0x12, hc.asBytes()[0]);
        assertEquals(0x34, hc.asBytes()[1]);
        assertEquals(0x56, hc.asBytes()[2]);
        assertEquals(0x78, hc.asBytes()[3]);
        assertEquals(0x9a, hc.asBytes()[4]);
        assertEquals(0xbc, hc.asBytes()[5]);
        assertEquals(0xde, hc.asBytes()[6]);
        assertEquals((byte) 0xf0, hc.asBytes()[7]);
    }
}