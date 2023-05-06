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


public class CodexTest_0_4_2 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = new byte[10];
    for (int i = 0; i < 10; i++) {
      bytes[i] = (byte) i;
    }
    BitArray bitArray = BitArray.fromByteArray(bytes);
    byte[] dest = new byte[10];
    int len = bitArray.writeBytesTo(dest, 0, 10);
    assertEquals(10, len);
    for (int i = 0; i < 10; i++) {
      assertEquals(bytes[i], dest[i]);
    }
  }
}