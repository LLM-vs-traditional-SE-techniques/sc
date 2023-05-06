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


public class CodexTest_0_8_8 { 
  @Test
    public void testNull() {
        HashCode hashCode = null;
        assertEquals(0, hashCode.asInt());
        assertEquals(0L, hashCode.asLong());
        assertEquals(ByteBuffer.allocate(8).putLong(0L).array(), hashCode.asBytes());
        assertEquals(BitSet.valueOf(ByteBuffer.allocate(8).putLong(0L).array()), hashCode.bits());
        assertEquals("0000000000000000000000000000000000000000", hashCode.toString());
    }
}