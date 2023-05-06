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


public class CodexTest_0_5_3 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[7];
    long[] data = {0x123456789abcdef0L, 0x23456789abcdef01L, 0x3456789abcdef012L};
    ImmutableBitArray b = ImmutableBitArray.create(data, 120);
    assertEquals(6, b.writeBytesTo(dest, 1, 6));
    assertEquals(0, dest[0]);
    assertEquals((byte) 0xf0, dest[1]);
    assertEquals((byte) 0xde, dest[2]);
    assertEquals((byte) 0xbc, dest[3]);
    assertEquals((byte) 0x9a, dest[4]);
    assertEquals((byte) 0x78, dest[5]);
    assertEquals(0, dest[6]);
  }
```
}