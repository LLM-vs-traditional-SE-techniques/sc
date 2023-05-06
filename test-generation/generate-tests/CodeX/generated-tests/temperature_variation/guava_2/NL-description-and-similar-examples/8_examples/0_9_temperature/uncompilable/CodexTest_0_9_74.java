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


public class CodexTest_0_9_74 { 
  @Test
  public void testEncodeOnlyAcceptableInputCharacters() {
    encoding.encode("000".getBytes(US_ASCII), encodingBuffer);
    // filling the buffer with random ASCII character is uniform, so chances are high that all characters are invalid
    for (int i = encodingBuffer.position(); i < encodingBuffer.limit(); i++) {
      byte randomChar = (byte) randomAsciiOfLengthBetween(1, 8).charAt(0);
      encodingBuffer.put(i, randomChar);
    }
    try {
      encoding.decode(encodingBuffer);
      fail("Original code should be preserved in every case");
    } catch (IllegalArgumentException e) {
      assertEquals("Illegal character in base32", e.getMessage());
    }
  }
}