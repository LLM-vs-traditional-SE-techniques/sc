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


public class CodexTest_0_8_38 { 
  @Test
  public void testVarargsConstructor() {
    HashFunction hf = Hashing.crc32().newHasher(1);
    hf.putInt(42);
    HashCode hc = HashCode.fromLong(hf.hash().asLong());
    HashCode hc2 = new HashCode(hc.asBytes());
    assertEquals(hc, hc2);
    assertEquals(hc2, hc);
    assertEquals(hc.asLong(), hc2.asLong());
  }
}