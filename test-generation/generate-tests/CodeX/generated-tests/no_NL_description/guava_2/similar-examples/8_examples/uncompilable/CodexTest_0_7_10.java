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


public class CodexTest_0_7_10 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[4];
    byte[] expected = new byte[4];
    expected[0] = (byte) 0x5a;
    expected[1] = (byte) 0xa5;
    expected[2] = (byte) 0x00;
    expected[3] = (byte) 0x00;
    bits.writeBytesTo(dest, 0, 4);
    assertArrayEquals(expected, dest);
  }
}