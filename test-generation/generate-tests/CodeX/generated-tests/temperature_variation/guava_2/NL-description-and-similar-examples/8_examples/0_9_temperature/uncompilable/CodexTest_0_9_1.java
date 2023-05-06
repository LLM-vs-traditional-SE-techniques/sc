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


public class CodexTest_0_9_1 { 
  @Test
        String url = "http://www.something.com";
        String url2 = "http://www.something2.com";
        String highVersion = "2.0";
        String mediumVersion = "1.0";
        String lowVersion = "0.4";
        List<Strategy> strategies = new ArrayList<Strategy>();
        strategies.add(new DynamicStrategy());
        strategies.add(new DefaultStrategy());
        ConfigurationImpl one = new ConfigurationImpl(url, new MediaType(), mediumVersion, strategies,
                Collections.<String>emptyList(), Collections.<String>emptyList(), Collections.<String>emptyList());
        Configuration oneResponse = new Configuration(one, Response.Status.OK);
}