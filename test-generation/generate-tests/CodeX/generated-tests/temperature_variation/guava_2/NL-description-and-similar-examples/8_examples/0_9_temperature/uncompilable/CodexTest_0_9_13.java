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


public class CodexTest_0_9_13 { 
  @Test
  public void testRangeOfWriteBytesTo() {
    Bits1 bits = new Bits1(32);
    for (int i = 0; i < 32; i++) {
      bits.set(i);
    }
    byte[] dest = new byte[32];
    int result = bits.writeBytesTo(dest, 0, dest.length);
    assertTrue(result > 0);
  }
}