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


public class CodexTest_0_9_71 { 
  @Test
        public void testFromLong() {
            String value = "new StringHashCode.fromLong(42)";
            HashCode hashCode = HashCode.fromLong(42);
            assertEquals(value, 42, hashCode.asInt());
            assertEquals(value, 42L, hashCode.asLong());
            assertEquals(value, hashCode.hashCode(), hashCode.asInt());
            assertEquals(value, hashCode, HashCode.fromInt(hashCode.asInt()));
            assertEquals(value, hashCode, HashCode.fromLong(hashCode.asLong()));
        }

}