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


public class CodexTest_0_8_33 { 
  @Test
      public void testGetClassLoader() {
            ClassLoader myLoader = new ClassLoader() {};
            ClassLoader myLoader2 = new ClassLoader() {};
            Thread current = Thread.currentThread();
            ClassLoader oldLoader = current.getContextClassLoader();
            current.setContextClassLoader(myLoader);
            try {
              assertSame(myLoader, MoreObjects.firstNonNull(current.getContextClassLoader(), myLoader2));
              assertSame(myLoader, MoreObjects.firstNonNull(null, myLoader));
            } finally {
              current.setContextClassLoader(oldLoader);
            }
          }
}