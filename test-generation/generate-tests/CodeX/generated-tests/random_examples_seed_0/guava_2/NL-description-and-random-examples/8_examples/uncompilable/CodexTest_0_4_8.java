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


public class CodexTest_0_4_8 { 
  @Test
  public void testWriteBytesTo() {
    int bits = new Random().nextInt(1000);
    int bytes = bits / 8 + (bits % 8 == 0 ? 0 : 1);
    byte[] expected = new byte[bytes];
    Random random = new Random();
    random.nextBytes(expected);
    byte[] actual = new byte[bytes];
    BitArray bits = BitArray.fromBytes(expected);
    int writtenBytes = bits.writeBytesTo(actual, 0, Integer.MAX_VALUE);
    assertThat(writtenBytes).isEqualTo(bytes);
    assertThat(actual).isEqualTo(expected);
  }
}