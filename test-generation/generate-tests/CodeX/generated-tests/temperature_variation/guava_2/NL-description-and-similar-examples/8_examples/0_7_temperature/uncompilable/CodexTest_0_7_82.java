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


public class CodexTest_0_7_82 { 
  @Test
    public void testWriteBytesTo() {
    BitArray ba = new BitArray(32);
    ba.set(0, 1);
    ba.set(1, 1);
    ba.set(2, 1);
    ba.set(3, 1);
    ba.set(4, 1);
    ba.set(5, 1);
    ba.set(6, 1);
    ba.set(7, 1);
    byte[] dest = new byte[4];
    ba.writeBytesTo(dest, 0, 4);
    assertEquals(127, dest[0]);
    assertEquals(0, dest[1]);
    assertEquals(0, dest[2]);
    assertEquals(0, dest[3]);
  }
}