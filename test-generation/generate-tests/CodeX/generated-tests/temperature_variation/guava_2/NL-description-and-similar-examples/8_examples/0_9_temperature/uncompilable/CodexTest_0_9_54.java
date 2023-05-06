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


public class CodexTest_0_9_54 { 
  @Test
   public void testBase32EncoderAllCharsIncludingEquals() throws Exception {
    String base32 = decode("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
    assertEquals("126,126,126,126,126,126,126,126,126,126,126,126,126,126,"
        + "126,126,126,126,126,126,126,126,126,126,126,126,126,126,126,126,"
        + "126,126,126,126,126", base32ToDecimalString(base32));
  }
}