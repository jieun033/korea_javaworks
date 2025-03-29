package types;

public class CharType {

	public static void main(String[] args) {
		System.out.println("***** 문자 자료형 *****");
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1); // 아스키 코드값
		 System.out.println(ch1);
	        System.out.println((int)ch1); //아스키 코드값 (int)-명사적 형변환
	        
	        char ch2 =67;
//	        int ch2 = 67;
	        System.out.println(ch2);
	        
	       char kor1 = '가';
	     
	    	   
		    char kor2 = '\uAC00';
		    //유니코드
		    System.out.println(kor2);
		    System.out.println("***** 문자 자료형 *****");
		    String jdk = "jdk";
		    int version = 21;
		    String java = jdk + version;
		    
		    
		    System.out.println(jdk);
		    System.out.println(version);
		    
		    String cart = "라면";
		    System.out.println(cart);
		    
            //배열 -여러개의 자료저장
		    String carts[] = {"라면","빵","생수","화장지"};
		    
		    System.out.println(carts[0]);
		    System.out.println(carts[1]);
		    System.out.println(carts[2]);
		    System.out.println(carts[3]);
		    
	}       
    
}
		    
		    

      
	    
	    
	 
	    
       
