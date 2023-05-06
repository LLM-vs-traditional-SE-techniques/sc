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


public class CodexTest_0_5_8 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
	"@RELATION test\n" +
	"@ATTRIBUTE one NUMERIC\n" +
	"@ATTRIBUTE two NUMERIC\n" +
	"@ATTRIBUTE three NUMERIC\n" +
	"@ATTRIBUTE four NUMERIC\n" +
	"@ATTRIBUTE five NUMERIC\n" +
	"@ATTRIBUTE six NUMERIC\n" +
	"@ATTRIBUTE seven NUMERIC\n" +
	"@ATTRIBUTE eight NUMERIC\n" +
	"@ATTRIBUTE nine NUMERIC\n" +
	"@ATTRIBUTE ten NUMERIC\n" +
	"@ATTRIBUTE eleven NUMERIC\n" +
	"@ATTRIBUTE twelve NUMERIC\n" +
	"@ATTRIBUTE thirteen NUMERIC\n" +
	"@ATTRIBUTE fourteen NUMERIC\n" +
	"@ATTRIBUTE fifteen NUMERIC\n" +
	"@ATTRIBUTE sixteen NUMERIC\n" +
	"@ATTRIBUTE seventeen NUMERIC\n" +
	"@ATTRIBUTE eighteen NUMERIC\n" +
	"@ATTRIBUTE nineteen NUMERIC\n" +
	"@ATTRIBUTE twenty NUMERIC\n" +
	"@ATTRIBUTE class {one,two,three,four,five,six,seven,eight,nine,ten}\n" +
	"@DATA\n" +
	"1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,one\n" +
	"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,two\n" +
	"
}