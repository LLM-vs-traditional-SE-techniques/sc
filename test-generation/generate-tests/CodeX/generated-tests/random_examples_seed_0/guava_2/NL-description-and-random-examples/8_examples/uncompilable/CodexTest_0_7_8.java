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


public class CodexTest_0_7_8 { 
  @Test
      public void testWriteBytesTo() {
        Random random = new Random(0);
        for (int length = 0; length < 512; length++) {
          byte[] expected = new byte[length];
          random.nextBytes(expected);
          for (int offset = 0; offset <= length; offset++) {
            for (int maxLength = 0; maxLength <= length; maxLength++) {
              byte[] actual = new byte[offset + length + maxLength];
              System.arraycopy(expected, 0, actual, offset + maxLength, length);
              ByteArrayBitArray bits =
                  new ByteArrayBitArray(actual, offset, length * 8);
              bits.writeBytesTo(actual, offset, maxLength);
              assertBytesEqual(actual, offset, length, expected);
              assertBytesEqual(actual, offset + maxLength, length, expected);
              assertBytesEqual(actual, 0, offset, new byte[offset]);
              assertBytesEqual(actual, offset + length, maxLength, new byte[maxLength]);
            }
          }
        }
      }
}