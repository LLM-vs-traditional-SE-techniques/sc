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


public class CodexTest_0_1_52 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 2;
    int maxLength = 5;
    int bits = bits();
    int expectedLength = Ints.min(maxLength, bits / 8);
    int expectedOffset = offset + expectedLength;
    int expectedBits = bits - expectedLength * 8;
    int actualLength = bitArray.writeBytesTo(dest, offset, maxLength);
    assertEquals(expectedLength, actualLength);
    assertEquals(expectedOffset, bitArray.getPosition());
    assertEquals(expectedBits, bitArray.bits());
  }
}