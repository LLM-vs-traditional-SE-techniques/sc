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


public class CodexTest_0_4_3 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = new byte[LENGTH];
    Arrays.fill(bytes, (byte) 0xFF);
    byte[] expected = new byte[LENGTH];
    Arrays.fill(expected, (byte) 0xFF);
    expected[0] = (byte) 0x80;
    expected[LENGTH - 1] = (byte) 0x01;
    BitArray.from(expected).writeBytesTo(bytes, 0, LENGTH);
    assertArrayEquals(expected, bytes);
  }
}