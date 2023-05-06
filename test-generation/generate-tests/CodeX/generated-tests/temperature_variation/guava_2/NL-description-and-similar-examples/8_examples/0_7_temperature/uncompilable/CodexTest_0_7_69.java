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


public class CodexTest_0_7_69 { 
  @Test
  public void testToString() {
    assertEquals("0", ZERO.toString());
    assertEquals("1", ONE.toString());
    assertEquals("10", TEN.toString());
    assertEquals("2147483647", MAX_INT.toString());
    assertEquals("-2147483648", MIN_INT.toString());
    assertEquals("9223372036854775807", MAX.toString());
    assertEquals("-9223372036854775808", MIN.toString());
  }
}