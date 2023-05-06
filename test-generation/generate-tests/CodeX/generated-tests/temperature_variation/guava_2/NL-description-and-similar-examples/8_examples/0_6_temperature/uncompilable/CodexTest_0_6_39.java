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


public class CodexTest_0_6_39 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    int numBytes = bitVector.writeBytesTo(dest, 0, 8);
    assertEquals(numBytes, 8);
    assertEquals(dest[0], (byte) 0xF8);
    assertEquals(dest[1], (byte) 0xFF);
    assertEquals(dest[2], (byte) 0xFF);
    assertEquals(dest[3], (byte) 0xFF);
    assertEquals(dest[4], (byte) 0xFF);
    assertEquals(dest[5], (byte) 0xFF);
    assertEquals(dest[6], (byte) 0xFF);
    assertEquals(dest[7], (byte) 0xFF);
  }
}