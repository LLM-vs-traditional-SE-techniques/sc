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


public class CodexTest_0_7_35 { 
  @Test
  public void testWriteBytesToWithOffset() {
    byte[] dest = new byte[10];
    dest[0] = 1;
    dest[9] = 1;
    byte[] expected = {1, 2, 3, 4, 5, 0, 0, 0, 0, 1};
    int len = hashCode.writeBytesTo(dest, 1, 5);
    assertEquals("length differs", 5, len);
    assertEquals("incorrect value", expected, dest);
  }
}