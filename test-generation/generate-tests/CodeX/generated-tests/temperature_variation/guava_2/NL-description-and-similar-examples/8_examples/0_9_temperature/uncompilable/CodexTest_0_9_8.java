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


public class CodexTest_0_9_8 { 
  @Test
  public void testPackLength8() {
    LongPacker packer = new LongPacker(8, 4);
    byte[] packed = new byte[4];
    packer.pack32Values(0x03030303L, 0x05050505L,
      0x0a0a0a0aL, 0x0b0b0b0bL, packed, 0);
    byte[] expected = {3, 5, n, 013};
    Assert.assertTrue(Arrays.equals(packed, expected));
  }
}