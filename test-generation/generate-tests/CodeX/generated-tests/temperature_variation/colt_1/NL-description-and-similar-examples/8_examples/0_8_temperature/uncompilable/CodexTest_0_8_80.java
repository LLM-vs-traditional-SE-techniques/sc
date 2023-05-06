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


public class CodexTest_0_8_80 { 
  @Test
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
			List<List<String>> res = new ArrayList<>();
			if(wordList == null || wordList.size() == 0) return res;
			Map<String, Integer> wordMap = new HashMap<>();
			for(int i = 0; i < wordList.size(); i++){
				wordMap.put(wordList.get(i),i);
			}
			if(!wordMap.containsKey(endWord)) return res;
			Map<String, List<String>> map = new HashMap<>();
			for(String word : wordList){
				char[] chars = word.toCharArray();
				for(int k = 0; k < word.length(); k++){
					char temp = chars[k];
					for(char ch = a; ch <= z; ch++){
						if(temp == ch) continue;
						chars[k] = ch;
						String newStr = new String(chars);
						if(wordList.contains(newStr)){
							if(map.containsKey(newStr)){
								map.get(newStr).add(word);
							}else{
								List<String> list = new ArrayList<>();
								list.add(word);
								map.put(newStr,list);
							}
						}
					}
					chars[k] = temp;
				}
			}
			Set<String> visited = new HashSet<>();
			Queue<String> queue
}