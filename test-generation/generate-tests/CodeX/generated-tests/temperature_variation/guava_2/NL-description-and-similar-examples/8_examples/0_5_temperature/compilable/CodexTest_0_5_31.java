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


public class CodexTest_0_5_31 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[5];
    dest[0] = (byte) 0x12;
    dest[1] = (byte) 0x34;
    dest[2] = (byte) 0x56;
    dest[3] = (byte) 0x78;
    dest[4] = (byte) 0x9a;
    assertEquals(3, HashCode.fromInt(0x12345678).writeBytesTo(dest, 1, 3));
    assertEquals((byte) 0x12, dest[0]);
    assertEquals((byte) 0x34, dest[1]);
    assertEquals((byte) 0x56, dest[2]);
    assertEquals((byte) 0x78, dest[3]);
    assertEquals((byte) 0x9a, dest[4]);
  }
}