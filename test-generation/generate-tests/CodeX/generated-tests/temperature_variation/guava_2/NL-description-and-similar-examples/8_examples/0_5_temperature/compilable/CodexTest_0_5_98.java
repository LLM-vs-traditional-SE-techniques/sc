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


public class CodexTest_0_5_98 { 
  @Test
   public void testWriteBytesTo() {
    byte[] dest = new byte[2];
    dest[0] = -1;
    dest[1] = -1;
    HashCode hash = Hashing.sha1().hashBytes(new byte[] {1, 2, 3});
    int written = hash.writeBytesTo(dest, 0, 2);
    assertEquals(2, written);
    assertEquals(0xda, dest[0] & 0xff);
    assertEquals(0x39, dest[1] & 0xff);
  }
}