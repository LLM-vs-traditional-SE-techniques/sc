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


public class CodexTest_0_8_100 { 
  @Test
  public void testWriteBytesTo() {
    for (int numBytes = 0; numBytes < 16; numBytes++) {
      byte[] dest = new byte[numBytes];
      byte[] expected = new byte[Math.min(numBytes, 8)];
      byte[] expectedLong = new byte[Math.min(numBytes, 16)];
      System.arraycopy(BYTES, 16 - numBytes, expected, 0, expected.length);
      System.arraycopy(BYTES, 8 - numBytes, expectedLong, 0, expectedLong.length);
}