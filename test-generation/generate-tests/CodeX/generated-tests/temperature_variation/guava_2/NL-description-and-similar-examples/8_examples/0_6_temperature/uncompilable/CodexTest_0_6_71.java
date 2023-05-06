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


public class CodexTest_0_6_71 { 
  @Test
  public void testWriteBytesTo() {
      for (int i = 0; i <= 4; i++) {
        for (int j = 0; j <= 4; j++) {
          byte[] dest = new byte[j];
          BitArray bits = new BitArray(i);
          int written = bits.writeBytesTo(dest, 0, dest.length);
          assertEquals(Math.min(j, i / 8), written);
          assertEquals(j, dest.length);
        }
      }
    }
}