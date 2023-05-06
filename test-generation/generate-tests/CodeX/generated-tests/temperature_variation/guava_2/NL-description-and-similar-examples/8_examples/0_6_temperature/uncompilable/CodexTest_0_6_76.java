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


public class CodexTest_0_6_76 { 
  @Test
  public void testWriteBytesToLargeArray() {
    byte[] dest = new byte[4096];
    int offset = 200;
    int length = 25;
    int maxLength = length * 8;
    int bytesWritten = bitArray.writeBytesTo(dest, offset, maxLength);
    assertEquals(length, bytesWritten);
    for (int i = 0; i < length; i++) {
      assertEquals(bitArray.byteAt(i), dest[offset + i]);
    }
  }
}