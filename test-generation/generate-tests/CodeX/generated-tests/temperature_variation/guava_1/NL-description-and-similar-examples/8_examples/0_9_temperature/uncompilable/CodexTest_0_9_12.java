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


public class CodexTest_0_9_12 { 
  @Test
  public void testSameHashCodeFromLongs() {
    HashCode hash1 = HashCodes.fromLong(42L);
    HashCode hash2 = HashCodes.fromLong(42L);
    assertEquals(42L, hash1.asLong());
    assertEquals(42L, hash2.asLong());
    assertTrue(hash1.equals(hash2));
    assertTrue(hash1.hashCode() == hash2.hashCode());
  }
}