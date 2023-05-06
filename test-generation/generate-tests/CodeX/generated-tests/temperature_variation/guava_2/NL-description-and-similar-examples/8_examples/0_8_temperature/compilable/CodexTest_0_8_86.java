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


public class CodexTest_0_8_86 { 
  @Test
    public void testWriteBytesTo() {
    byte[] dest = new byte[37];
    HashCode hash = Hashing.sha1().hashString("foo", Charsets.US_ASCII);
    hash.writeBytesTo(dest, 0, 0);
    assertEquals(0, dest[35]);
    hash.writeBytesTo(dest, 0, 20);
    assertEquals(-120, dest[35]);
    assertEquals(-107, dest[36]);
  }
}