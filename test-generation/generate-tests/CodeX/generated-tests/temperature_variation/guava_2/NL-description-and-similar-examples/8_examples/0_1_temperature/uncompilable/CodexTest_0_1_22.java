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


public class CodexTest_0_1_22 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 2;
    int maxLength = 5;
    int bits = bits();
    int bytes = bits / 8;
    int length = Math.min(maxLength, bytes);
    int expectedLength = length;
    int expectedOffset = offset + length;
    int expectedDestLength = offset + length;
    int expectedBits = bits;
    int expectedBytes = bytes;
    int expectedBitsPerByte = 8;
    int expectedBitsPerLong = 64;
    int expectedBitsPerInt = 32;
    int expectedBitsPerShort = 16;
    int expectedBitsPerChar = 16;
    int expectedBitsPerByteMask = 0xFF;
    int expectedBitsPerLongMask = 0xFFFFFFFF;
    int expectedBitsPerIntMask = 0xFFFF;
    int expectedBitsPerShortMask = 0xFF;
    int expectedBitsPerCharMask = 0xFF;
    int expectedBitsPerByteLog2 = 3;
    int expectedBitsPerLongLog2 = 6;
    int expectedBitsPerIntLog2 = 5;
    int expectedBitsPerShortLog2 = 4;
    int expectedBitsPerCharLog2 = 4;
    int expectedBitsPerByteLog2Mask = 0x7;
    int expectedBitsPerLongLog2Mask = 0x3F;
    int expectedBitsPerIntLog2Mask = 0x1F;
    int expectedBitsPerShortLog2Mask = 0xF;
    int expectedBitsPerCharLog2Mask = 0xF;
    int expectedBitsPerByteLog2Mask = 0x7;
    int expectedBitsPerLongLog2Mask = 0x3F;
    int expectedBitsPerIntLog2Mask = 0x1F;
    int expectedBitsPerShortLog2Mask = 0xF;
    int expectedBitsPerCharLog2Mask = 0xF;
    int expectedBitsPerByteLog2Mask = 0x7;
    int expectedBitsPerLongLog2Mask = 0x3F;

}