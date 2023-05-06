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


public class CodexTest_0_7_4 { 
  @Test
    public void testHashBytes() {
      HashFunction hf = Hashing.goodFastHash(3);
      HashCode hc = hf.newHasher()
          .putByte((byte) 0x12).putByte((byte) 0x34).putByte((byte) 0x56).putByte((byte) 0x78)
          .putByte((byte) 0x9a).putByte((byte) 0xbc).putByte((byte) 0xde).putByte((byte) 0xf0)
          .hash();
      assertEquals(0xbc9a78563412f0deL, hc.asLong());
    }
}