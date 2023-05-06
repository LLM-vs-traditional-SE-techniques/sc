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


public class CodexTest_0_8_48 { 
  @Test
  public void testWriteBytesMaxLength() {
    byte[] data = new byte[2048];
    Random random = new Random(0);
    random.nextBytes(data);
    for (int i = 0; i < 1000; i++) {
      byte[] bytes = Arrays.copyOf(data, i);
      ByteSource source = ByteSource.wrap(bytes);
      byte[] dest = new byte[i];
      int read = source.read(dest);
      assertEquals(i, read);
      assertTrue(Arrays.equals(bytes, dest));
    }
  }

}