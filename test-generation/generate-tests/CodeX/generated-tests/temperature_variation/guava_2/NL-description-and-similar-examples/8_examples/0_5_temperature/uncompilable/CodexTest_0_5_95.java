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


public class CodexTest_0_5_95 { 
  @Test
  public void testToString() {
    String[] data = {
      "", "1", "-1", "0", "17", "-17",
      Integer.toString(Integer.MIN_VALUE),
      Integer.toString(Integer.MAX_VALUE),
      Long.toString(Long.MIN_VALUE),
      Long.toString(Long.MAX_VALUE),
      new BigInteger("1234567890987654321").toString(),
      new BigInteger("-1234567890987654321").toString(),
      new BigInteger(
        "123456789098765432112345678909876543211234567890987654321").toString(),
      new BigInteger(
        "-123456789098765432112345678909876543211234567890987654321").toString(),
    };
    for (String s : data) {
      assertEquals(s, UnsignedInteger.valueOf(s).toString());
    }
  }
}