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


public class CodexTest_0_9_6 { 
  @Test
   public void testAdd() {
     HashCode h1 = Hashing.md5().hashLong(1);
     HashCode h2 = Hashing.md5().hashLong(2);
     assertNotEquals(h1, h2);
     HashCode h3 = h1.add(h2);
     HashCode h4 = h2.add(h1);
     assertEquals(h3, h4);
     assertEquals("h1 + h2 -> h3", h1.toString() + h2.toString(), h3.toString());
   }
}