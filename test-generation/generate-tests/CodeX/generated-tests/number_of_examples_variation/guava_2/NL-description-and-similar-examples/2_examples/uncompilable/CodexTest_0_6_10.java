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


public class CodexTest_0_6_10 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    byte[] dest = new byte[bytes.length + 2];
    BitArray ba = BitArray.fromBytes(bytes);
    ba.writeBytesTo(dest, 1, bytes.length);
    assertEquals(0, dest[0]);
    assertEquals(0, dest[dest.length - 1]);
    assertArrayEquals(bytes, Arrays.copyOfRange(dest, 1, dest.length - 1));
  }
```
}