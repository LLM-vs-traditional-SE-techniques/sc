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


public class CodexTest_0_4_75 { 
  @Test
  public void testWriteBytesToImpl() {
    byte[] dest = new byte[8];
    byte[] expected = {(byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04,
        (byte) 0x05, (byte) 0x06, (byte) 0x07, (byte) 0x08};
    long value = 0x0102030405060708L;
    int bits = 64;
    int offset = 0;
    int maxLength = 8;
    BitArray bitArray = new BitArray(bits, value);
    bitArray.writeBytesToImpl(dest, offset, maxLength);
    assertArrayEquals(expected, dest);
  }
}