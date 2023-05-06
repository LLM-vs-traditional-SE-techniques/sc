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


public class CodexTest_0_9_61 { 
  @Test
    public void testLongHashCode() {
      for (long i = 0; i <= (1L << 16); i++) {
        HashCode hashCode = HashCode.fromLong(i);
        assertEquals(1, hashCode.bits());
        assertEquals(4, hashCode.asBytes().length);
        assertEquals(i, hashCode.asLong());
        assertEquals(i, hashCode.asInt());
        assertEquals(i, hashCode.padToLong());
      }
    }
}