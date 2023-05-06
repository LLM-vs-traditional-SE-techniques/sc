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


public class CodexTest_0_8_50 { 
  @Test
  public void testDecodeIntsLittleEndian() {
    for (int i = 0; i < 2000; i++) {
      byte[] bytes = new byte[4 * (1 + RANDOM.nextInt(100))];
      Random random = new Random(i);
      random.nextBytes(bytes);
      ByteArrayDataInput in = ByteStreams.newDataInput(bytes);
      int[] expected = new int[bytes.length / 4];
      for (int j = 0; j < expected.length; j++) {
        expected[j] = in.readInt();
      }
      ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
      int[] actual = UnsignedInts.toArray(UnsignedInts.decode(bais));
      assertThat(actual).isEqualTo(expected);
    }
  }
}