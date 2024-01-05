public class Train{

public static void main(String args[])
{
	String value="Language";
	char[] arr=value.toCharArray();
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}

	Train result = new Train();
	int val=result.compare(arr,'u');
	System.out.println(val);


}

  int compare(char[] arr,char ch)
{
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==ch)
		{
			count++;
		}
	}
	return count;
}

}
