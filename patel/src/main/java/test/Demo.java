package test;


class Demo
{
public static void main(String ar[])
{
int arr[]={1,2,3,4,5,6,7,8,9,10};

int a;

for(int i=0; i<arr.length; i++)
{
	for(int j=0; j<arr.length; j++)
	{
		if(arr[i]>arr[j])
		{
		a=arr[i];
		arr[i]=arr[j];
		arr[j]=a;
		}
	}
}

	for(int aaa:arr)
	{
		System.out.println(aaa);
	}

}
}
