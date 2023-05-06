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


public class CodexTest_0_5_3 { 
  @Test
  
Input: public static HashCode fromInt(int hash) {
    return new IntHashCode(hash);
  }
Output:
  
Input: public static HashCode fromString(CharSequence chars) {
    byte[] bytes = new byte[chars.length()];
    for (int i = 0; i < chars.length(); i++) {
      bytes[i] = (byte) chars.charAt(i);
    }
    return fromBytesNoCopy(bytes);
  }
Output: public void testHashCodeFromString() {
    HashCode hash = HashCode.fromString("hello");
    assertEquals("9578fd922e9f829497f173d22168924c8c504f07", hash.toString());
  }
}