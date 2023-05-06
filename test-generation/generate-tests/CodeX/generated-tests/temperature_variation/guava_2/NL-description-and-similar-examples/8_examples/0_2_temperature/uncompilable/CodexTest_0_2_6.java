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


public class CodexTest_0_2_6 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 2;
    int maxLength = 5;
    byte[] bytes = new byte[maxLength];
    for (int i = 0; i < maxLength; i++) {
      bytes[i] = (byte) i;
    }
    ByteArrayDataInput input = ByteStreams.newDataInput(bytes);
    BitArray bitArray = BitArray.fromBytes(input, maxLength);
    int written = bitArray.writeBytesTo(dest, offset, maxLength);
    assertEquals(maxLength, written);
    for (int i = 0; i < maxLength; i++) {
      assertEquals(bytes[i], dest[i + offset]);
    }
  }
}