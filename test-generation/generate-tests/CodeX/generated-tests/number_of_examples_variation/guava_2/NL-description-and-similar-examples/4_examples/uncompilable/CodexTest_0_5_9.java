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


public class CodexTest_0_5_9 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[5];
    byte[] source = new byte[] {0, 1, 2, 3, 4, 5, 6};
    assertEquals(5, new ByteArrayBitArray(source).writeBytesTo(dest, 0, dest.length));
    assertEquals(new byte[] {0, 1, 2, 3, 4}, dest);
    assertEquals(5, new ByteArrayBitArray(source).writeBytesTo(dest, 0, 5));
    assertEquals(new byte[] {0, 1, 2, 3, 4}, dest);
    assertEquals(3, new ByteArrayBitArray(source).writeBytesTo(dest, 0, 3));
    assertEquals(new byte[] {0, 1, 2, 3, 4}, dest);
    assertEquals(2, new ByteArrayBitArray(source).writeBytesTo(dest, 1, 2));
    assertEquals(new byte[] {0, 1, 2, 3, 4}, dest);
    assertEquals(1, new ByteArrayBitArray(source).writeBytesTo(dest, 4, 1));
    assertEquals(new byte[] {0, 1, 2, 3, 4}, dest);
  }
```
}