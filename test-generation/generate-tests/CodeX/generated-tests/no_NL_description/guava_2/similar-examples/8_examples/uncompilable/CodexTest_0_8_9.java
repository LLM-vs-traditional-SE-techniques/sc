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


public class CodexTest_0_8_9 { 
  @Test
  public void testWriteBytesTo() {
    byte[] input = {(byte) 0xAB, (byte) 0xCD, (byte) 0xEF, (byte) 0x01};
    int offset = 1;
    int maxLength = 3;
    BitArray bits = BitArray.fromBitList(Arrays.asList(true, false, true, false, true, false, true, false));
    bits.writeBytesTo(input, offset, maxLength);
    assertEquals(0xAB, input[0] & 0xff);
    assertEquals(0xB8, input[1] & 0xff);
    assertEquals(0xEF, input[2] & 0xff);
    assertEquals(0x01, input[3] & 0xff);
  }
}