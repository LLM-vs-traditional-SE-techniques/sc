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


public class CodexTest_0_7_4 { 
  @Test
  public void testWriteBytesTo() {
    Random random = new Random(0);
    for (int offset = 0; offset <= 10; offset++) {
      for (int maxLength = 0; maxLength <= 10; maxLength++) {
        byte[] dest = new byte[offset + maxLength];
        byte[] randomBytes = new byte[offset + maxLength];
        random.nextBytes(randomBytes);
        System.arraycopy(randomBytes, 0, dest, 0, offset);
        for (int i = 0; i < numBits(); i++) {
          BitArray bitArray = createInstance(i);
          bitArray.writeBytesTo(dest, offset, maxLength);
          for (int j = 0; j < offset; j++) {
            assertEquals(randomBytes[j], dest[j]);
          }
          for (int j = 0; j < maxLength; j++) {
            assertEquals(bitArray.getByte(j, maxLength), dest[offset + j]);
          }
          for (int j = offset + maxLength; j < dest.length; j++) {
            assertEquals(randomBytes[j], dest[j]);
          }
        }
      }
    }
  }

}