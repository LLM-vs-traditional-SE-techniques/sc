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


public class CodexTest_0_6_26 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[12];
    byte[] orig = new byte[] {0x12, 0x34, 0x56, 0x78, (byte) 0x9a, (byte) 0xbc,
        (byte) 0xde, (byte) 0xf0, (byte) 0x11, (byte) 0x22, (byte) 0x33, (byte) 0x44};
    HashCode hashCode = fromBytes(orig);
    int written = hashCode.writeBytesTo(dest, 2, 12);
    assertEquals(10, written);
    assertEquals(0, dest[0]);
    assertEquals(0, dest[1]);
    for (int i = 0; i < 10; i++) {
      assertEquals(orig[i], dest[i + 2]);
    }
    assertEquals(0, dest[12]);
  }
}