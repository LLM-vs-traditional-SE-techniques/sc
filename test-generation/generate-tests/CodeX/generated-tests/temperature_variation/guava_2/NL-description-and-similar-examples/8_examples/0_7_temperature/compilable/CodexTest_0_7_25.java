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


public class CodexTest_0_7_25 { 
    /**
     * Test method for {@link com.google.common.primitives.Ints#ensureCapacity(int[], int, int)}.
     */
    @Test
    public void testEnsureCapacity() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        array = Ints.ensureCapacity(array, 7, 10);
        Assert.assertArrayEquals("Array not filled correctly with default value", new int[]{1, 2, 3, 4, 5, 0, 0},
                array);
        array = Ints.ensureCapacity(array, 7, 10);
        Assert.assertArrayEquals("Array not filled correctly with default value", new int[]{1, 2, 3, 4, 5, 0, 0},
                array);
        array = Ints.ensureCapacity(array, 2, 10);
        Assert.assertArrayEquals("Array not filled correctly with default value", new int[]{1, 2, 3, 4, 5, 0, 0},
                array);
        array = Ints.ensureCapacity(array, 17, 10);
        Assert.assertArrayEquals("Array not filled correctly with default value",
                new int[]{1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, array);
    }
}