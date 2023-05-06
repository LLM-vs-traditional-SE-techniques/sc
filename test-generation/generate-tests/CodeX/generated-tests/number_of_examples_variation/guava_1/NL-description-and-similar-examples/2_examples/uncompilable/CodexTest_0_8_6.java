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


public class CodexTest_0_8_6 { 
  @Test
        public void testLongHashCodeHashCode() {
            HashCode hashCode1 = HashCode.fromLong(42L);
            assertEquals(42L, hashCode1.longValue());
            assertEquals(42, hashCode1.hashCode());
            HashCode hashCode2 = HashCode.fromLong(42L);
            assertEquals(42L, hashCode2.longValue());
            assertEquals(42, hashCode2.hashCode());
            assertEquals(hashCode1, hashCode2);
            assertEquals(hashCode1.hashCode(), hashCode2.hashCode());
        }
}