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


public class CodexTest_0_6_8 { 
  @Test
  public void testHashCode() {
    long h = random.nextLong();
    assertEquals(h, HashCode.fromLong(h).asLong());
    assertEquals(h, HashCode.fromLong(h).hashCode());
    assertEquals(h,
        HashCode.fromLong(h).asBytes()[0] & 0xFFL
        | (HashCode.fromLong(h).asBytes()[1] & 0xFFL) << 8
        | (HashCode.fromLong(h).asBytes()[2] & 0xFFL) << 16
        | (HashCode.fromLong(h).asBytes()[3] & 0xFFL) << 24
        | (HashCode.fromLong(h).asBytes()[4] & 0xFFL) << 32
        | (HashCode.fromLong(h).asBytes()[5] & 0xFFL) << 40
        | (HashCode.fromLong(h).asBytes()[6] & 0xFFL) << 48
        | (HashCode.fromLong(h).asBytes()[7] & 0xFFL) << 56);
  }
}