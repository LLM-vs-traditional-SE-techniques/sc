import cern.colt.matrix.*;
import cern.colt.list.DoubleArrayList;
import cern.colt.list.IntArrayList;
import cern.colt.matrix.impl.AbstractMatrix1D;

import hep.aida.bin.*;
import cern.colt.matrix.impl.*;
import cern.colt.function.DoubleDoubleFunction;
import cern.colt.function.DoubleFunction;
import cern.colt.list.IntArrayList;
import cern.colt.map.AbstractIntDoubleMap;
import cern.colt.map.OpenIntDoubleHashMap;
import cern.colt.matrix.DoubleFactory2D;
import cern.colt.matrix.DoubleMatrix1D;
import cern.colt.matrix.DoubleMatrix2D;
import cern.colt.matrix.DoubleMatrix3D;
import cern.colt.matrix.doublealgo.DoubleMatrix2DComparator;
import cern.colt.matrix.linalg.Algebra;
import cern.colt.matrix.linalg.LUDecompositionQuick;
import cern.colt.matrix.linalg.SeqBlas;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_6 { 
  @Test
    */	
    /**
     * 
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
		String inPath = null;
		String outPath = null;
		
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-inPath")) {
				inPath = args[++i];
			} else if (args[i].equals("-outPath")) {
				outPath = args[++i];
			}
		}
		
		if(inPath == null){
			System.out.println("Invalid params!");
			System.exit(0);
		}
		
		if(outPath == null){
			outPath = inPath;
		}		
		
		FileInputStream input = null;
		FileOutputStream output = null;		
		
		try {
			File dir = new File(inPath);
			String[] files = dir.list();
			
			for (int i = 0; i < files.length; i++) {
				if (files[i].endsWith(".java")) {
					input = new FileInputStream(inPath+"/"+files[i]);	
					output = new FileOutputStream(outPath+"/"+files[i]);
					
					BufferedReader reader= new BufferedReader(new InputStreamReader(input));			
					//PrintWriter writer = new PrintWriter(output);			
					String line = null;
					StringBuffer buffer = new StringBuffer();
					while((line = reader.readLine()) != null)
					{
						buffer.append(line);
				
}