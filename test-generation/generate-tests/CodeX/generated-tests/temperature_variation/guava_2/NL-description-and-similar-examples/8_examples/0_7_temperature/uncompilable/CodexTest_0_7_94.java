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


public class CodexTest_0_7_94 { 
  @Test
  public void testWriteBytesTo() {
    for (String value : Arrays.asList("", "0", "1", "10", "11", "01")) {
      BitArray ba = BitArray.from(value);
      byte[] bytes = new byte[ba.bits() / 8];
      ba.writeBytesTo(bytes, 0, bytes.length);
      assertEquals(
          BitArray.from(new BigInteger(1, bytes)),
          ba);
    }
  }
}