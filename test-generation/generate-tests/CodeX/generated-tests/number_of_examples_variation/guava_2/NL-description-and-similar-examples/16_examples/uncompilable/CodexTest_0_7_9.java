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


public class CodexTest_0_7_9 { 
  @Test
    public void testWriteBytesTo() {
    BitArray array = BitArray.createFromByteArray(new byte[] {0, 1, 2, 3, 4, 5, 6, 7});
    byte[] dest = new byte[4];
    int bytesWritten = array.writeBytesTo(dest, 0, dest.length);
    assertEquals(4, bytesWritten);
    assertEquals(new byte[] {0, 1, 2, 3}, dest);
  }
}