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


public class CodexTest_0_6_33 { 
  @Test
   public void testHashCodeExample() {
     // HashCode is a general purpose hash function.
     HashCode h1 = Hashing.sha1().hashLong(42);
     HashCode h2 = Hashing.sha1().hashLong(42);
     HashCode h3 = Hashing.sha1().hashLong(39);
     assertEquals(h1, h2);
     assertEquals(h1.hashCode(), h2.hashCode());
     assertNotEquals(h1, h3);
     assertNotEquals(h1.hashCode(), h3.hashCode());
   }
}