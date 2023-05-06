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


public class CodexTest_0_8_1 { 
  @Test
  public void testHashCodeXorIgnoresOrder() {
    HashFunction hf = Hashing.md5();
    HashCode h1 = hf.hashBytes(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
    HashCode h2 = hf.hashBytes(new byte[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
    assertEquals(h1, h2);
  }
}