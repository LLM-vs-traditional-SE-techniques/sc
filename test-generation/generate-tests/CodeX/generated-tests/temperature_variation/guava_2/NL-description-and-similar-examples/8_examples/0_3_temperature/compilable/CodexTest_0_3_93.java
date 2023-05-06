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


public class CodexTest_0_3_93 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    HashCode hash = Hashing.sha1().hashBytes(new byte[20]);
    int written = hash.writeBytesTo(dest, 2, 4);
    assertEquals(4, written);
    assertEquals(0, dest[0]);
    assertEquals(0, dest[1]);
    assertEquals(hash.asBytes()[0], dest[2]);
    assertEquals(hash.asBytes()[1], dest[3]);
    assertEquals(hash.asBytes()[2], dest[4]);
    assertEquals(hash.asBytes()[3], dest[5]);
    assertEquals(0, dest[6]);
    assertEquals(0, dest[7]);
  }
}