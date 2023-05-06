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


public class CodexTest_0_5_97 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    HashCode hashCode = Hashing.sha1().hashString("foo", Charsets.US_ASCII);
    int writtenBytes = hashCode.writeBytesTo(dest, 0, dest.length);
    assertEquals(20, writtenBytes);
    assertEquals(
        "0beec7b5ea3f0fdbc95d0dd47f3c5bc275da8a33",
        HashCode.fromBytes(dest).toString());
  }
}