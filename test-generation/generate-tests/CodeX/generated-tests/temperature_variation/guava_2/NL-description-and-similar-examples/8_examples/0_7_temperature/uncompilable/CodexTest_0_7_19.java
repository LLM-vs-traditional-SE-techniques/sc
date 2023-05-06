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


public class CodexTest_0_7_19 { 
  @Test
    public void testWriteBytesTo() {
    byte[] dest = new byte[11];
    byte[] src = new byte[8];
    byte[] expected = {0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1};
    Longs.fromBytes(-1L, 0, src, 0, 8);
    BitArray bitArray = BitArray.fromBytes(src);
    bitArray.writeBytesTo(dest, 0, 8);
    assertTrue(Arrays.equals(expected, dest));
  }
}