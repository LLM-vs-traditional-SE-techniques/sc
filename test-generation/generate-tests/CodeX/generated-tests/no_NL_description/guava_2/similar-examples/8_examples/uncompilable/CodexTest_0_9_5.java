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


public class CodexTest_0_9_5 { 
  @Test
  public void testWriteBytesTo() {
    int N = 8 * h1.bits() - 1;  // Assume there are some unused trailing bits.
    byte[] bytes = new byte[N / 8 + 1];
    bytes[N / 8] = (byte) (1 << (h1.bits() % 8));
    int numCopied = h1.writeBytesTo(bytes, 0, bytes.length);
}