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


public class CodexTest_0_9_7 { 
  @Test
  public void testHashCode32() {
    HashCode hash = HashCode.fromLong(0x123456789ABCDEFL);
    assertEquals((byte) 0x12, hash.asBytes()[0]);
    assertEquals((byte) 0x34, hash.asBytes()[1]);
    assertEquals((byte) 0x56, hash.asBytes()[2]);
    assertEquals((byte) 0x78, hash.asBytes()[3]);
    assertEquals((byte) 0x9A, hash.asBytes()[4]);
    assertEquals((byte) 0xBC, hash.asBytes()[5]);
    assertEquals((byte) 0xDE, hash.asBytes()[6]);
    assertEquals((byte) 0xF0, hash.asBytes()[7]);
    assertEquals(8, hash.bits());
    assertEquals(64, hash.asBytes().length * Byte.SIZE);
  }
}