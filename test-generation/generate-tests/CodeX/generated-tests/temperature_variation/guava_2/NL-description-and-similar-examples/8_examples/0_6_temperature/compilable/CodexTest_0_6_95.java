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


public class CodexTest_0_6_95 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    HashCode code = Hashing.sha1().hashLong(42);
    assertEquals(20, code.writeBytesTo(dest, 0, dest.length));
    assertEquals("d2516ee1acfa5baf33dfc1c471e438449ef134c8",
        BaseEncoding.base16().lowerCase().encode(dest));
    assertEquals(8, code.writeBytesTo(dest, 0, 8));
    assertEquals("d2516ee1acfa5baf",
        BaseEncoding.base16().lowerCase().encode(dest));
  }
}