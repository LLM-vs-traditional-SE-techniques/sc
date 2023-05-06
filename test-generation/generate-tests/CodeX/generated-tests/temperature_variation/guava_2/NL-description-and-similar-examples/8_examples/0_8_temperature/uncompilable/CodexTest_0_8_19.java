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


public class CodexTest_0_8_19 { 
  @Test
   public void testCopyBytesTo() {
    byte[] bytes = { 5, -1, -1, -1, -1, -1, -1, -1, -1 };
    byte[] dest = new byte[10];
    int writtenLength = new IntHashCode(5).writeBytesTo(dest, 0, dest.length);
    assertEquals(4, writtenLength);
    assertTrue(Arrays.equals(new byte[]{5, 0, 0, 0, 0, 0, 0, 0, 0, 0}, dest));
  }
}