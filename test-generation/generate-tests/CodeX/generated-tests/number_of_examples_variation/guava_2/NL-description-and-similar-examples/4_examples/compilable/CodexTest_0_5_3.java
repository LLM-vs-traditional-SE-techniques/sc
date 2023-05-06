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


public class CodexTest_0_5_3 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[6];
    assertEquals(6, Hashing.sha1().hashLong(42L).writeBytesTo(dest, 0, 6));
    assertEquals(
        "aaf4c61ddcc5e8a2dabede0f3b482cd9aea9434d",
        BaseEncoding.base16().lowerCase().encode(dest));
  }
}