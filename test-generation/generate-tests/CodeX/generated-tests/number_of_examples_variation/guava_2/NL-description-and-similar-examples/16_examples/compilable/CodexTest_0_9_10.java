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


public class CodexTest_0_9_10 { 
  @Test
    public void testWriteBytesTo_middleOfDestinationBufferSmallHashSize() {
    HashFunction hashFunction = Hashing.sha256();
    Hasher hasher = hashFunction.newHasher();
    hasher.putByte((byte) 0);
    HashCode hash = hasher.hash();
    byte[] dest = new byte[hash.bits() / 8 + 1];
    hash.writeBytesTo(dest, 1 /* offset */, 4 /* maxLength */);
    assertEquals("11000000000000000000000000000000",
        BaseEncoding.base16().lowerCase().encode(dest));
  }
}