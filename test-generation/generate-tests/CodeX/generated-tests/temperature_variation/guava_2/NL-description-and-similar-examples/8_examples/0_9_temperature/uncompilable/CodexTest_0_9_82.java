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


public class CodexTest_0_9_82 { 
  @Test
  /**
   * Indicates that this Guava version explicitly supports Java 8 and above.
   *
   * <p>This constant exists to aid IDE auto-completion and to disambiguate Guava versions on
   * classpaths that include pre-Java 8 versions of Guava. For example,
   *
   * <i>Note:</i> This version of Guava is shipping as part of Android Oreo, and therefore omits
   * methods and classes introduced in Java 7 to make it more suitable for distribution to
   * Android API levels 9-27. See <a
   * href="https://github.com/google/guava/wiki/UseGuavaInAndroidApps">UseGuavaInAndroidApps</a>
   * for more details.
   *
   * <p>This value may be true even though Google Guava is running on a JRE without java.util.Objects
   * or java.util.Optional, so you cannot rely on this constant to detect that your app is running
   * on Java 8 or above.
   *
  public static final boolean isJava8OrLater() {
    return IS_JAVA8_OR_LATER;
  }
}
}