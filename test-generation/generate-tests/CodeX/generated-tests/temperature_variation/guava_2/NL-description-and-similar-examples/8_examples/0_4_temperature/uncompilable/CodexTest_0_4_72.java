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


public class CodexTest_0_4_72 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[5];
    int offset = 1;
    int maxLength = 3;
    byte[] expected = new byte[5];
    expected[0] = 0;
    expected[1] = (byte) 0x80;
    expected[2] = (byte) 0x01;
    expected[3] = (byte) 0x02;
    expected[4] = 0;
    BitArray bits = new BitArray(new byte[] {(byte) 0x80, (byte) 0x01, (byte) 0x02});
    int length = bits.writeBytesTo(dest, offset, maxLength);
    assertEquals(3, length);
    assertEquals(expected, dest);
  }
}