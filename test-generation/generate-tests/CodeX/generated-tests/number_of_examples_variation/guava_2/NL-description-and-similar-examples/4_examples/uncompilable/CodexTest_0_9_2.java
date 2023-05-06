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


public class CodexTest_0_9_2 { 
  @Test
  
Input: public String toString(int radix) {
    checkValidRadix(radix);
    int bitLen = bits();
    int charLen = (bitLen + (radix - 1)) / radix;
    char[] chars = new char[charLen];
    boolean isNegative = isNegative();
    int i = bitLen;
    if (i == 0) {
      return "0";
    } else if (isNegative) {
      i = bitLen % radix;
      if (i == 0) {
        i = radix;
      }
    } else {
      i = 1;
    }
    chars[0] = BigInteger.digitToChar(get(--bitLen / radix), radix, !isNegative);
    while (i < charLen) {
      chars[i++] = BigInteger.digitToChar(get(--bitLen / radix), radix, true);
    }
    return new String(chars);
  }
Output:
}