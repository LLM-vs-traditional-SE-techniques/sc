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


public class CodexTest_0_9_4 { 
  @Test
    public void testWriteBytesToImpl() {
    byte[] dest = new byte[3];
    byte[] src = new byte[] {0, 1, -1, 0}; // last byte not used
    BitArray array = new BitArray(src);
    assertEquals(3, array.writeBytesTo(dest, 0, 3));
    assertEquals(0, dest[0]);
    assertEquals(1, dest[1]);
    assertEquals(-1, dest[2]);
  }
}