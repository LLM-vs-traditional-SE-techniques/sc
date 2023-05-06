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


public class CodexTest_0_6_1 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[20];
    HashCode hash1 = Hashing.sha1().hashString("foo", Charsets.US_ASCII);
    int written = hash1.writeBytesTo(dest, 7, 3);
    assertEquals(3, written);
    assertEquals(hash1.asBytes()[0], dest[7]);
    assertEquals(hash1.asBytes()[1], dest[8]);
    assertEquals(hash1.asBytes()[2], dest[9]);
    assertEquals(0, dest[10]);
  }
}