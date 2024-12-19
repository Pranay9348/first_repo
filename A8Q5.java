class A8Q5
      {
	public static void main(String args[]){
		int n=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		for(int a=n; a<=m; a++){
			int flag=1;
			for(int i=2;i<=(int)a/2;i++){
				if(a%i==0){
					flag=0;
					break;
				}
			}
			if(flag==1){
				int sum=0, temp=a;
				while(temp!=0){
					sum=sum+(int)temp%10;
					temp=(int)temp/10;
				}				
				int flag_1=1;
				for(int j=2;j<=(int)sum/2;j++){
					if(sum%j==0){
						flag_1=0;
						break;
					}
				}
				if(flag_1==1)
					System.out.println(a);
			}
		}
	}
}