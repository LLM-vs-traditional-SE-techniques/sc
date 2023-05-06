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


public class CodexTest_0_7_7 { 
  @Test
  public void testHashCodeAsBytes() {
    HashCode hashCode = HashCode.fromLong(0x1234L);
    byte[] bytes = hashCode.asBytes();
    assertEquals(8, bytes.length);
    assertEquals((byte) 0x12, bytes[0]);
    assertEquals((byte) 0x34, bytes[1]);
    assertEquals((byte) 0x0, bytes[2]);
    assertEquals((byte) 0x0, bytes[3]);
    assertEquals((byte) 0x0, bytes[4]);
    assertEquals((byte) 0x0, bytes[5]);
    assertEquals((byte) 0x0, bytes[6]);
    assertEquals((byte) 0x0, bytes[7]);
  }
}