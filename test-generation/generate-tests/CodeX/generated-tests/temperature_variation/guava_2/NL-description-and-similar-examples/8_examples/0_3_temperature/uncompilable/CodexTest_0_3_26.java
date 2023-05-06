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


public class CodexTest_0_3_26 { 
  @Test
  public void testWriteBytesTo_lessThanOneByte() {
    byte[] dest = new byte[1];
    int offset = 0;
    int maxLength = 1;
    int bits = 0;
    int expected = 0;
    assertEquals(expected, new BloomFilter(bits, 0).writeBytesTo(dest, offset, maxLength));
  }
}