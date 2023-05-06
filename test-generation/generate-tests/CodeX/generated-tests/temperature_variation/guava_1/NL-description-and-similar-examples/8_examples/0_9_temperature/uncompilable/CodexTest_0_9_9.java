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


public class CodexTest_0_9_9 { 
  @Test
     public void testHash() {
        LongHashCode h1 = LongHashCode.fromLong(0x1234567887654321L);
        LongHashCode h2 = LongHashCode.fromLong(0x1234567887654321L);
        assertEquals(h1.hashCode(), h2.hashCode());
        assertEquals(h1.asLong(), h2.asLong());
        assertEquals(h1, h2);
        assertEquals("1234567887654321", h1.toString());
    }

}