import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_31 { 
  @Test
    HashCode hash1 = Hashing.sha1().hashString("foo", Charsets.US_ASCII);
    HashCode hash2 = HashCode.fromBytes(BaseEncoding.base16().lowerCase().decode(hash1.toString()));
    assertEquals(hash1, hash2);
  }
}