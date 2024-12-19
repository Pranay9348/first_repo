class A8Q6a{
	public static void main(String args[]){
		int num=Integer.parseInt(args[0]);
		int k=0;
		for(int i=0;i<num;i++){
			for(int j=0; j<num; j++){

				// to print 1 above
				if(i==k && j==k || i==k && j==(num-1)-k)
					System.out.print(1+" ");

				//to print 1 below
				else if(j==(num-1)-k && i==(num-1)-k || j==k && i==(num-1)-k)
					System.out.print(1+" ");
				
				else
					System.out.print(0+" ");
			}	
			System.out.println();
			k++;
		}
	}
}\