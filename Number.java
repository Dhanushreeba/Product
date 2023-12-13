public class Number{
public static void main(String[] args){
 int[] numbersArray={4,1,12,42,15,17,87,78,19,20,61,56,93,70,65,66,10,34,23,26};
 char[] lettersInName={'c','h','a','n','d','r','a','s','h','e','k','a','r','g','o','w','d','a','b','a'};
 float[] percentage={62.34f,78.56f,26.78f,87.3f,52.68f,65.1f,69.08f,79.0f,86.23f,95.09f,49.56f,69.9f,38.52f,35.98f,34.7f,67.90f,78.23f,98.0f,87.50f,81.0f};
 double[] doubleArray={5.098,76.987,2.341,8.965,9.6641,6.8635,8.7560,1.0745,5.9564,7.8453,9.8455,4.657,3.076,4.875,6.105,5.082,7.234,2.9726,6.453,5.756};
 byte[] batteryPercentage={(byte)76,(byte)89,(byte)45,(byte)56,(byte)83,(byte)98,(byte)10,(byte)23,(byte)67,(byte)83,(byte)94,(byte)99,(byte)87,(byte)54,(byte)62,(byte)90,(byte)27,(byte)96,(byte)54,(byte)36};
 long[] adharNumber={764543255l,844657687l,98466065l,3242698906l,837274435l,92746476l,2746546l,7438296l,43347816l,91765472l,6298908l,6476473l,8456383l,6537938l,7346608l,76497812l,45658679l,87567823l,766533807l,83456479l};
 short[] rollNumber={(short)243,(short)356,(short)100,(short)102,(short)765,(short)897,(short)435,(short)832,(short)7554,(short)321,(short)987,(short)4567,(short)9540,(short)654,(short)1987,(short)5678,(short)5439,(short)406,(short)4557,(short)987};
 boolean[] taskCompleted={true,false,false,false,true,true,false,true,false,true,true,true,true,false,false,true,false,false,false,true};
for(int i=0;i<20;i++){
System.out.println(numbersArray[i]);
System.out.println(lettersInName[i]);
System.out.println(percentage[i]);
System.out.println(doubleArray[i]);
System.out.println(batteryPercentage[i]);
System.out.println(adharNumber[i]);
System.out.println(rollNumber[i]);
System.out.println(taskCompleted[i]);
}
}
}