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


public class CodexTest_0_9_84 { 
    @Test
    public void testGuavaHashCode() {
        assertEquals("The hash value should be the same.",
                Hashing.sha1().newHasher().putString("Simplify.java", Charset.forName("UTF-8")).hash()
                        .writeBytesTo(new byte[20], 0, 1),
                Hashing.sha1().newHasher().putString("Simplify.java", Charset.forName("UTF-8")).hash().asBytes()[0]
        );
        assertEquals("The hash value should not be the same",
                Hashing.sha1().newHasher().putString("Simplify.java", Charset.forName("UTF-8")).hash()
                        .writeBytesTo(new byte[20], 0, 2),
                Hashing.sha1().newHasher().putString("Simplify.java", Charset.forName("UTF-8")).hash()
                        .writeBytesTo(new byte[20], 0, 1)
        );
    }
}