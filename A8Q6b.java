class A8Q6b{
	public static void main(String args[]){
		int num=Integer.parseInt(args[0]);
		for(int i=0;i<num;i++){
			for(int j=num; j>i; j--)	
				System.out.print(j+" ");
			System.out.println();
		}
	}
}