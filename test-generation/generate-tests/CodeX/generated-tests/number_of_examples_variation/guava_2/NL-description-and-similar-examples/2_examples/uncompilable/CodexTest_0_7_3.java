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


public class CodexTest_0_7_3 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = new byte[4];
    BitArray array = new BitArray(16);
    array.set(1, true);
    array.set(15, true);
    assertEquals(4, array.writeBytesTo(bytes, 2, 4));
    assertArrayEquals(new byte[] {0, 0, 0, 2}, bytes);
  }
```
}