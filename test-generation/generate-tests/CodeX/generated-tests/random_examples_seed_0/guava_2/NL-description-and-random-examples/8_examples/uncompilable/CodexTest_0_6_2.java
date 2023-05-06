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


public class CodexTest_0_6_2 { 
  @Test
    public void testWriteBytesToWithOffset() {
      for (int numBytes = 0; numBytes < 8; numBytes++) {
        for (int offset = 0; offset < 8; offset++) {
          MutableBitArray array = new MutableBitArray(numBytes * 8);
          byte[] expected = new byte[offset + numBytes];
          Arrays.fill(expected, (byte) 0);
          Arrays.fill(expected, offset, offset + numBytes, (byte) 0xFF);
          array.writeBytesTo(expected, offset, numBytes);
          assertBytes(expected, array);
        }
      }
    }
}