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


public class CodexTest_0_8_57 { 
  @Test
    public void testObjectHashCode() {
      HashCode hashCode42 = HashCode.fromLong(42L);
      assertEquals(42, hashCode42.hashCode());
    }
    public void testHashCodeLong() {
      HashCode hash1 = Hashing.murmur3_128().hashLong(0x123456780L);
      HashCode hash2 = Hashing.murmur3_128().hashLong(0x123456780L);
      HashCode hash3 = Hashing.murmur3_128().hashLong(0x123456781L);
      assertEquals(hash1, hash2);
      assertFalse(hash1.equals(hash3));
    }
}