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


public class CodexTest_0_1_1 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[4];
    HashCode hash = HashCode.fromInt(0x01020304);
    int written = hash.writeBytesTo(dest, 0, dest.length);
    assertEquals(4, written);
    assertEquals(0x01, dest[0]);
    assertEquals(0x02, dest[1]);
    assertEquals(0x03, dest[2]);
    assertEquals(0x04, dest[3]);
  }
}