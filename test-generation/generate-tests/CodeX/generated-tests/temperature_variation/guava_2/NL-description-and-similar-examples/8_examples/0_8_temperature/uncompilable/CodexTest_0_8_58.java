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


public class CodexTest_0_8_58 { 
  @Test
  public void testWriteBytesTo() {
    byte[] payload = {a,b,c,d,e,f,g,h,i,j,k,l,m};
    byte[] expected = {a,b,c,d,e,f,g,h};
    byte[] dest = new byte[8];
    BitArray b = BitArray.createFromArray(payload, 0, 8);
    b.writeBytesTo(dest, 0, expected.length);
    assertEquals(Hashing.sha1().hashBytes(expected), Hashing.sha1().hashBytes(dest));
  }
}