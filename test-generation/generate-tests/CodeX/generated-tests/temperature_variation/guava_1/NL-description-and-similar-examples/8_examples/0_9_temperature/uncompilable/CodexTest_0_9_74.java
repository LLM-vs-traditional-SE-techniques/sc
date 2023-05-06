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


public class CodexTest_0_9_74 { 
  @Test
    public void testFromHashId() {
    HashIds hashIds = new HashIds() {
      @Override
      protected HashIds setSecurityLevel(HashIdsSecurityLevel securityLevel) {
        return this;
      }
    };
    hashIds.setSalt("this is my salt");
    long originalId = System.currentTimeMillis();
    if (originalId < 0) {
      originalId *= -1;
    }
    Date date = new Date(originalId);
    TimeUnit timeUnit = hashIds.decodeTime(hashIds.encodeTime(date));
    assertEquals(date.getTime(), timeUnit.getTime());
    final long id = hashIds.decode(hashIds.encode(originalId));
    assertEquals(originalId, id);
  }
}