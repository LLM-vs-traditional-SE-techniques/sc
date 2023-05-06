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


public class CodexTest_0_9_1 { 
  @Test
  public void testWriteBytesTo() {
    byte[] expected = new byte[20];
    for (int i = 0; i < expected.length; i++) {
      expected[i] = (byte) i;
    }
    byte[] dest = new byte[20];
    assertEquals(10, HashCode.fromBytes(expected).writeBytesTo(dest, 0, 10));
    assertEquals(new ByteArrayInputStream(expected, 0, 10),
        new ByteArrayInputStream(dest, 0, 10));
  }
```
}