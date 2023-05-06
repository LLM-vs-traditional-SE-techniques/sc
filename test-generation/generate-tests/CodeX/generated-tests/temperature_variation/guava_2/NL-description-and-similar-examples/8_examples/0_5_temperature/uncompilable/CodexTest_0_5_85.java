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


public class CodexTest_0_5_85 { 
  @Test
    public void testWriteBytesTo() {
    byte[] bytes = new byte[20];
    int numBytesWritten = hashCode.writeBytesTo(bytes, 0, bytes.length);
    assertEquals(hashCode.bits() / 8, numBytesWritten);
    assertArrayEquals(hashCode.asBytes(), Arrays.copyOf(bytes, numBytesWritten));
  }
```
}