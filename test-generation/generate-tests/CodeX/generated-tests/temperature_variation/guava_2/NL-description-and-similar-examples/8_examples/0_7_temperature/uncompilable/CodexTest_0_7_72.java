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


public class CodexTest_0_7_72 { 
  @Test
  public void testGetInt()
  {
    byte[] bytes = new byte[4];
    Random rnd = new Random();
    int num = rnd.nextInt();
    byte[] b = Bytes.toBytes(num);
    for (int i = 0; i < 4; i++) {
      bytes[i] = b[i];
    }
    ByteBuffer buffer = ByteBuffer.wrap(bytes);
    int ret = buffer.getInt();
    assertEquals(num, ret);
  }
}