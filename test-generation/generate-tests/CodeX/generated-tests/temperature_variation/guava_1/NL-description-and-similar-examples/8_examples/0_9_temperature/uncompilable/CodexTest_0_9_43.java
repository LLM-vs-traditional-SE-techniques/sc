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


public class CodexTest_0_9_43 { 
  @Test
        public void testHashLong() {
          HashCode hash1 = Hashing.goodFastHash(64).newHasher();
          HashCode hash2 = Hashing.goodFastHash(64).newHasher();
          hash1.putInt(0);
          hash2.putInt(0).putInt(0);
          assertEquals(hash2, hash1.putLong(0L));
          hash1.putInt(0).putInt(0).putLong(1L);
          hash2.putLong(1L);
          assertEquals(hash2, hash1);
        }
}