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


public class CodexTest_0_8_77 { 
  @Test
  public void testWriteBytesTo() {
    int maxLength = 2;
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    
    long numberToWrite = 0x1034;
    int expectedLength = 2;
    BitStream bitStream = new BitStream(numberToWrite, expectedLength);
    assertEquals(expectedLength,
        bitStream.writeBytesTo(outputStream.toByteArray(), 0, maxLength));
    assertEquals(numberToWrite, BitStream.byteArrayToLong(outputStream.toByteArray(), 0,
        expectedLength));
  }
}