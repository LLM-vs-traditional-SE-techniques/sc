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


public class CodexTest_0_9_6 { 
  @Test
  public void testRandomData() {
    byte[] bytes = new byte[20];
    for (int h = 0; h < 100; h++) {
      for (int i = 0; i < bytes.length; i++) {
        bytes[i] = 0;
      }
      int expectedOutputSize = SimpleRandom.getRandomGeometric(0.5);
      SimpleRandom random = new SimpleRandom(bytes);
      int actualOutputSize = random.nextBytes(bytes, 0, bytes.length);
      assertThat(actualOutputSize, greaterThanOrEqualTo(expectedOutputSize));
      assertThat(actualOutputSize, lessThanOrEqualTo(bytes.length));
    }
  }
}