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


public class CodexTest_0_6_46 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[3];
    int bits = 10;
    int bytes = bits / 8;
    int maxLength = bytes + 1;
    int offset = 1;
    BitArray bitArray = new BitArray(bits);
    bitArray.set(0, bits);
    bitArray.writeBytesTo(dest, offset, maxLength);
    byte[] expected = new byte[3];
    expected[0] = 0;
    expected[1] = (byte) 0xff;
    expected[2] = (byte) 0xf0;
    assertArrayEquals(expected, dest);
  }
}