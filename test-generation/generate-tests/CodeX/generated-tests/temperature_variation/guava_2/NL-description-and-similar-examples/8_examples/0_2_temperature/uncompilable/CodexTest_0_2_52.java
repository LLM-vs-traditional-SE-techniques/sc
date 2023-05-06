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


public class CodexTest_0_2_52 { 
  @Test
  public void testWriteBytesTo_maxLengthTooSmall() {
    byte[] dest = new byte[10];
    int offset = 5;
    int maxLength = 5;
    int bits = bits();
    int bytes = bits / 8;
    int expectedLength = Ints.min(maxLength, bytes);
    int expectedReturn = expectedLength;
    int expectedWritten = expectedLength;
    int expectedRemaining = bytes - expectedLength;
    long expectedValue = value >>> (expectedRemaining * 8);
    int expectedDestOffset = offset + expectedLength;
    int actualReturn = bitArray.writeBytesTo(dest, offset, maxLength);
    assertEquals(expectedReturn, actualReturn);
    assertEquals(expectedWritten, actualReturn);
    assertEquals(expectedValue, ByteBuffer.wrap(dest, offset, expectedWritten).getLong());
    assertEquals(0, ByteBuffer.wrap(dest, expectedDestOffset, dest.length - expectedDestOffset).getLong());
  }
}