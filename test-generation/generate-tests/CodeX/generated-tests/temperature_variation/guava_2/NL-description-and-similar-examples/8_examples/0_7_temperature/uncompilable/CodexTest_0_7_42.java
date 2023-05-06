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


public class CodexTest_0_7_42 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[1000];
    Random random = new Random(0);
    for (int i = 0; i < 100; i++) {
      int numBits = random.nextInt(Integer.SIZE - 1) + 1;
      BitArray bitArray = BitArray.create(numBits);
      random.nextBytes(bitArray.getBits());
      random.nextBytes(dest);
      int offset = random.nextInt(dest.length - numBits / 8 + 1);
      int maxLength = random.nextInt(dest.length - offset + 1);
      int actualMaxLength = bitArray.writeBytesTo(dest, offset, maxLength);
      assertThat(actualMaxLength).isEqualTo(Ints.min(maxLength, numBits / 8));
      byte[] expected = bitArray.toByteArray();
      byte[] actual = new byte[offset + actualMaxLength];
      System.arraycopy(dest, 0, actual, 0, offset + actualMaxLength);
      assertThat(actual).isEqualTo(expected);
    }
  }
}