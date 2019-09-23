class method
{
	public static void add(int a,int b){
		System.out.println("Method A");
		System.out.println("The Sum is" +(a+b));
				}
		
		
		public static void add(double a ,double b){
	    System.out.println("Method B");
		System.out.println("The Sum is" +(a+b));
				}
		
}
        class ace {
			
		public static void main (String args[]){
		method obj = new method();
		obj.add(2,5);
		obj.add(3.4,6.6);}
		
		}