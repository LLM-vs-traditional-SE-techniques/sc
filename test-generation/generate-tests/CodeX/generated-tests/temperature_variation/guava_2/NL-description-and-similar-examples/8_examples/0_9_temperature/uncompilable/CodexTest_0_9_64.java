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


public class CodexTest_0_9_64 { 
  @Test
  public void testPartialCreateInt() {
    int offset = 5;
    int length = 5;
    OffsetBitString test = new OffsetBitString(new ConciseSet().add(0, 8).add(30, 40).getFactory(), offset, length);
    assertEquals("third", 0, test.nextSetBit(0));
    assertEquals("fourth", 2, test.nextSetBit(1));
    assertEquals("fifth", 8, test.nextSetBit(3));
    assertEquals("fifth", 19, test.nextSetBit(9));
    assertEquals("fifth", 29, test.nextSetBit(20));
  }
```
}