package pkg2;



 class Nod{
		 Nod[] children;
		boolean eow;
		
		Nod(){
			this.children=new Nod[26];
			for(int i=0;i<26;i++) {
				 children[i]=null;
		
			}
			
		}
	}
