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


public class CodexTest_0_9_3 { 
  @Test
    {
      "name": "testObjectHashCode(long)",
      "codeparts": [
        {
          "position": {
            "start": {
              "line": "151",
              "column": "9"
            }
          },
          "code": "assertEquals(42, HashCode.fromLong(42).hashCode());"
        }
      ],
      "code": "public void testObjectHashCode(long) {\n\tassertEquals(42, HashCode.fromLong(42).hashCode());\n}"
    }
}