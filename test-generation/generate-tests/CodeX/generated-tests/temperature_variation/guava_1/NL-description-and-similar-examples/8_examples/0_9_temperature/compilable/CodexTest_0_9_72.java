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


public class CodexTest_0_9_72 { 
  @Test
    public void testHash64Bit() {
        assertEquals(Long.MAX_VALUE, HashCode.fromLong(Long.MAX_VALUE).padToLong());
        assertEquals(0L, HashCode.fromLong(0).padToLong());
        assertEquals(1L, HashCode.fromLong(1).padToLong());
        assertEquals(Long.MIN_VALUE, HashCode.fromLong(Long.MIN_VALUE).padToLong());
        assertEquals(1L << 32, HashCode.fromLong(1L << 32).padToLong());
    }
}