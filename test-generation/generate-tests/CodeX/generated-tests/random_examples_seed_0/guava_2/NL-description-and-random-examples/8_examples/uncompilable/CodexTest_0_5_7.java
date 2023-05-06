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


public class CodexTest_0_5_7 { 
  @Test
  public static void testWriteBytesTo() {
    byte[] bytes = new byte[2];
    bytes[0] = 1;
    bytes[1] = 2;
    BitArray bitArray = BitArray.fromBytes(bytes);
    byte[] dest = new byte[2];
    int offset = 0;
    int maxLength = 2;
    int length = bitArray.writeBytesTo(dest, offset, maxLength);
    assertEquals(2, length);
    assertEquals(1, dest[0]);
    assertEquals(2, dest[1]);
  }
}