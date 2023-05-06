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


public class CodexTest_0_4_6 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances model = new Instances(new BufferedReader(new StringReader(
	"@relation test\n" +
	"@attribute a numeric\n" +
	"@attribute b numeric\n" +
	"@attribute c numeric\n" +
	"@attribute d numeric\n" +
	"@attribute e numeric\n" +
	"@attribute f numeric\n" +
	"@attribute g numeric\n" +
	"@attribute h numeric\n" +
	"@attribute i numeric\n" +
	"@attribute j numeric\n" +
	"@attribute k numeric\n" +
	"@attribute l numeric\n" +
	"@attribute m numeric\n" +
	"@attribute n numeric\n" +
	"@attribute o numeric\n" +
	"@attribute p numeric\n" +
	"@attribute q numeric\n" +
	"@attribute r numeric\n" +
	"@data\n" +
	"1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20\n" +
	"1,
}