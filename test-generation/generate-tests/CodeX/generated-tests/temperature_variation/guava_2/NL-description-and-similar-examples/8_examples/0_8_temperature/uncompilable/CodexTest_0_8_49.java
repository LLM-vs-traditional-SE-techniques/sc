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


public class CodexTest_0_8_49 { 
  @Test
   public void testBigEndian() {
    byte[] in = new byte[] { (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78,
        (byte) 0x90, (byte) 0xab, (byte) 0xcd, (byte) 0xef };
    byte[] out = new byte[in.length];
    ByteBuffer.wrap(out).order(ByteOrder.BIG_ENDIAN).putLong(0x1234567890abcdefL);
    assertEquals(Arrays.toString(out), Arrays.toString(in));
  }
```
## Notes
}