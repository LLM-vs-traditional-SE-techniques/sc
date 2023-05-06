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


public class CodexTest_0_9_5 { 
  @Test
   public void testFromLong() {
    HashCode code = Hashing.murmur3_128().hashLong(42L);
    HashCode parsedCode = HashCode.fromLong(code.asLong());
    assertEquals(4748701948277069100L, parsedCode.asLong());
    assertTrue(Arrays.equals(new byte[] 
      {0, 0, 0, 0, 0, 0, -62, -112, -72, -101, 49, -83, 82, 60, -117, -5}, 
      parsedCode.asBytes()));
  }
}