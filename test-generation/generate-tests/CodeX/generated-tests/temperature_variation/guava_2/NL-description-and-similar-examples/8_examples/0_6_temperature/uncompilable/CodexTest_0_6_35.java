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


public class CodexTest_0_6_35 { 
  @Test
    public void testWriteBytesToImpl() {
    byte[] dest = new byte[4];
    HashCode hash = Hashing.sha256().hashBytes(new byte[] {0xde, 0xad, 0xbe, 0xef});
    hash.writeBytesToImpl(dest, 0, 4);
    assertEquals(hash, HashCode.fromBytes(dest));
  }
}