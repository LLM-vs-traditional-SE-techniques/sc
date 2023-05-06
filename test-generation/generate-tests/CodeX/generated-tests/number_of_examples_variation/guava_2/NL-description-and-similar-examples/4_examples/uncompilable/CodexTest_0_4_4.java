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


public class CodexTest_0_4_4 { 
  @Test
   public void testWriteBytesToImpl() {
    byte[] dest = new byte[5];
    int offset = 1;
    int maxLength = 3;
    byte[] expected = {0, 1, 2, 3, 0};
    byte[] actual = new byte[5];
    System.arraycopy(dest, 0, actual, 0, 5);
    BitArray ba = new BitArray(8);
    ba.set(0, true);
    ba.set(1, false);
    ba.set(2, true);
    ba.set(3, false);
    ba.set(4, true);
    ba.set(5, false);
    ba.set(6, true);
    ba.set(7, false);
    ba.writeBytesToImpl(actual, offset, maxLength);
    assertTrue(Arrays.equals(expected, actual));
  }
```
}