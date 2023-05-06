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


public class CodexTest_0_5_93 { 
  @Test
    public void testWriteBytesTo() {
    byte[] dest = new byte[6];
    BitSet bs = new BitSet(64);
    bs.set(0, 64);
    bs.set(63, false);
    bs.set(62, false);
    bs.writeBytesTo(dest, 0, dest.length);
    byte[] expected = {-1, -1, -1, -1, 0, 0};
    assertTrue(Arrays.equals(dest, expected));
  }
}