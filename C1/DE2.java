public class DE2{
	
	static int x = 15;
	
	public static void main(String[] x){
		x = 200;
		System.out.println(x);
	}
}

///nao compila
/*
DE2.java:6: error: incompatible types: int cannot be converted to String[]
                x = 200;
                    ^
1 error
*/