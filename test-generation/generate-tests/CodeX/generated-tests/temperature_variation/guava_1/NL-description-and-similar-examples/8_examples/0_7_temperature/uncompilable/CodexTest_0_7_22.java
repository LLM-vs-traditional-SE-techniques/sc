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


public class CodexTest_0_7_22 { 
  @Test
        public void testLongHashCode() {
            HashCode hashCode42 = HashCode.fromLong(42);
            assertEquals(42, hashCode42.asLong());
            assertEquals(Bytes.toBytes(42), hashCode42.asBytes());
            assertEquals("000000000000000000000000000000000000000000000000000000000000002a", hashCode42.toString());
            assertEquals(42, hashCode42.hashCode());
        }
}