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


public class CodexTest_0_5_67 { 
  @Test
    public void testWriteBytesTo() {
    byte[] dest = new byte[4];
    int writtenBytes = new BitArray(new long[] {0x123456789abcdef0L}, 64).writeBytesTo(dest, 1, 3);
    assertEquals(3, writtenBytes);
    assertEquals((byte) 0x45, dest[1]);
    assertEquals((byte) 0x67, dest[2]);
    assertEquals((byte) 0x89, dest[3]);
  }
}