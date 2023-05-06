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


public class CodexTest_0_7_23 { 
  @Test
  public void testWriteBytesToSmall() {
    byte[] dest = new byte[10];
    HashCode hash = Hashing.sha1().hashBytes(new byte[100]);
    int written = hash.writeBytesTo(dest, 0, 5);
    assertEquals(5, written);
    byte[] truncated = Arrays.copyOf(hash.asBytes(), 5);
    assertEquals(hash.asBytes()[0], dest[0]);
    assertEquals(hash.asBytes()[4], dest[4]);
  }
}