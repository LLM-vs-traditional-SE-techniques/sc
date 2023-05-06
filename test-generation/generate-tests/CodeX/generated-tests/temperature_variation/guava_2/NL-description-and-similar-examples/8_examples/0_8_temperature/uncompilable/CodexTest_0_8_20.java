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


public class CodexTest_0_8_20 { 
  @Test
  public void testHashBytes() {
    final HashFunction hf = Hashing.murmur3_32();
    final byte[] bytes = new byte[hf.bits() / 8];
    final HashCode hc = hf.newHasher().putLong(0L).putLong(0L).hash();
    hc.writeBytesTo(bytes, 0, bytes.length);
    assertEquals(hc, HashCode.fromBytesNoCopy(bytes));
  }
}