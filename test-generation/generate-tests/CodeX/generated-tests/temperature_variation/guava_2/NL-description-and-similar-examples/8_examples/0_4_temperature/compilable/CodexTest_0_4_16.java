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


public class CodexTest_0_4_16 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[5];
    int maxLength = 5;
    int offset = 0;
    byte[] bytes = new byte[5];
    bytes[0] = (byte) 0xFF;
    bytes[1] = (byte) 0xFF;
    bytes[2] = (byte) 0xFF;
    bytes[3] = (byte) 0xFF;
    bytes[4] = (byte) 0xFF;
    HashCode hashCode = HashCode.fromBytes(bytes);
    int result = hashCode.writeBytesTo(dest, offset, maxLength);
    assertEquals(5, result);
    assertEquals(0xFF, dest[0]);
    assertEquals(0xFF, dest[1]);
    assertEquals(0xFF, dest[2]);
    assertEquals(0xFF, dest[3]);
    assertEquals(0xFF, dest[4]);
  }
}