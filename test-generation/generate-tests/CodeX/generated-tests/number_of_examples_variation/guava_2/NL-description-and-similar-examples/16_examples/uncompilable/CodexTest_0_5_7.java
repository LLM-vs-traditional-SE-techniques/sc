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


public class CodexTest_0_5_7 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = new byte[20];
    int numBytes = hashCode.writeBytesTo(bytes, 2, 16);
    assertEquals(16, numBytes);
    byte[] expectedBytes = new byte[20];
    expectedBytes[2] = (byte) 0x12;
    expectedBytes[3] = (byte) 0x34;
    expectedBytes[4] = (byte) 0x56;
    expectedBytes[5] = (byte) 0x78;
    expectedBytes[6] = (byte) 0x9A;
    expectedBytes[7] = (byte) 0xBC;
    assertTrue(Arrays.equals(expectedBytes, bytes));
  }
}