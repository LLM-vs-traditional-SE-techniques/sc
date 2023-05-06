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


public class CodexTest_0_7_6 { 
  @Test
  public void testWriteBytesTo() {
    int bytes = Ints.min(4, bits() / 8);
    byte[] dest = new byte[bytes + 1];
    int written = writeBytesTo(dest, 1, bytes);
    assertEquals(bytes, written);
    for (int i = 0; i < written; i++) {
      assertEquals(getByte(i), dest[i + 1]);
    }
  }
}