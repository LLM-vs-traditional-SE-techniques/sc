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


public class CodexTest_0_9_3 { 
  @Test
  public void testReading() throws IOException {
    byte[] array = {
          // not enough bytes
        0, 2, 3, 4,
          // readable
        0, 0, 18, 5,
          // readable and extra
        1, 1, 3, 5,
          // readable (maxLength = 2)
        1, 1, 4, 5,
          // readable (maxLength = 0)
        1, 1, 4, 5,
        1, 1, 4, 5,
          // not enough bytes
        0, 2,
    };
    ByteArrayInputStream inputStream = new ByteArrayInputStream(array);
}