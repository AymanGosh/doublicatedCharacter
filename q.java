public static int doublicatedCharacter(String str){
		Map<String, Integer> map = new HashMap<>(); 
		int counter=0;
		for(int i=0 ; i<str.length();i++) {
			String c=str.charAt(i)+" ";
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1); 
				if( map.get(c)==2) 
					 counter++;
			}else
				map.put(c,1);
				
		}
		return counter ; 
	}
	public static void main(String[] args) {
		
		System.out.println(doublicatedCharacter("abbab"));
        
	}
