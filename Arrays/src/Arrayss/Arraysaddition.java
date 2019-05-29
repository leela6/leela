package Arrayss;
public class Arraysaddition {
	public static void main(String[] args) {
		int a[][]={{1,2,3},{3,3,3},{3,3,3}};
int b[][]={{2,2,2},{0,0,0},{1,1,0}};
for(int i = 0;i<a.length;i++)
{
	for(int j=0;j<a.length;j++)
	{
		System.out.print(+(a[i][j]+b[i][j]));
		//System.out.print(+(a[i][j]*b[i][j]));
}
System.out.println( );
	}
	}
}
