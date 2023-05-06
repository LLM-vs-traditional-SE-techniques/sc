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
  public void testWriteBytesTo() throws Exception {
    byte[] dest = new byte[2048];
    Random r = new Random();
    byte[] internal = new byte[100];
    r.nextBytes(internal);
    BitSet bitset = BitSet.valueOf(internal);
    assertEquals(bitset.length() / 8, bitset.writeBytesTo(dest, 0, 2048));
    byte[] bytes = Arrays.copyOfRange(dest, 0, bitset.length() / 8);
    assertTrue(Arrays.equals(internal, bytes));
  }

}