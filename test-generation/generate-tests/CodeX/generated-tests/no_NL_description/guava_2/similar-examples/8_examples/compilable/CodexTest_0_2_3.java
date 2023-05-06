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


public class CodexTest_0_2_3 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[5];
    HashCode hash = Hashing.sha1().hashBytes(new byte[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
    int written = hash.writeBytesTo(dest, 1, 3);
    assertEquals(3, written);
    assertEquals(0, dest[0]);
    assertEquals(0, dest[4]);
    assertEquals(hash.asBytes()[0], dest[1]);
    assertEquals(hash.asBytes()[1], dest[2]);
    assertEquals(hash.asBytes()[2], dest[3]);
  }
}