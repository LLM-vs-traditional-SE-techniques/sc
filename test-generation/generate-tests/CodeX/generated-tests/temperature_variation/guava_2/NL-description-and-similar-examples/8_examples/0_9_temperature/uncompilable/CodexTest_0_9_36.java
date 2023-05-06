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


public class CodexTest_0_9_36 { 
  @Test
  public void testRoundTripByteArray_offset_len() {
    byte[] bytes = new byte[30];
    int offset = 8;
    int len = 20;
    random.nextBytes(bytes);
    BytesHashFunction hf = Hashing.md5();
    HashCode hc = hf.hashBytes(bytes, offset, len);
    byte[] result = hc.asBytes();
    assertEquals(hc.bits() / 8, result.length);
    checkNotZeros(bytes, result);
    assertEquals(
        "Expected hash function to return the same result when called with the same bytes",
        hc,
        hf.hashBytes(bytes, offset, len));
  }
}