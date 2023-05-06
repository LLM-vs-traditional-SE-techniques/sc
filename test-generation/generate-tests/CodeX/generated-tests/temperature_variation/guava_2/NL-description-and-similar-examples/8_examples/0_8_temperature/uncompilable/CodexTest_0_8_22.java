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


public class CodexTest_0_8_22 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = BitArray.fromHexString("f0e0d0c0").toByteArray();
    assertEquals(5, bytes.length);
  
    byte[] dest = new byte[5];
    assertEquals(4, BitArray.fromHexString("f0e0d0c0").writeBytesTo(dest, 0, 4));
    assertHexEquals("f0e0d0c0", dest);
  }
}