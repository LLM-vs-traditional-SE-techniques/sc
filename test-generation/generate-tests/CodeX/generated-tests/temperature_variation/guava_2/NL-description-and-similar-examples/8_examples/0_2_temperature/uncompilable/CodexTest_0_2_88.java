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


public class CodexTest_0_2_88 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    int offset = 2;
    int maxLength = 4;
    byte[] expected = new byte[8];
    expected[2] = 0x12;
    expected[3] = 0x34;
    expected[4] = 0x56;
    expected[5] = 0x78;
    BitArray bitArray = BitArray.fromHexString("12345678");
    bitArray.writeBytesTo(dest, offset, maxLength);
    assertArrayEquals(expected, dest);
  }
}