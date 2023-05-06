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


public class CodexTest_0_9_8 { 
    @Test
    public void testfromLong() {
        long l0 = 0L;
        HashCode h0 = HashCode.fromLong(l0);
        assertEquals(8, h0.bits());
        assertEquals(l0, h0.asLong());
        assertEquals(0, h0.asInt());
        assertEquals(0, h0.asBytes()[0]);
        assertEquals(0, h0.asBytes()[1]);
        assertEquals(0, h0.asBytes()[2]);
        assertEquals(0, h0.asBytes()[3]);
        assertEquals(0, h0.asBytes()[4]);
        assertEquals(0, h0.asBytes()[5]);
        assertEquals(0, h0.asBytes()[6]);
        assertEquals(0, h0.asBytes()[7]);
    }
}