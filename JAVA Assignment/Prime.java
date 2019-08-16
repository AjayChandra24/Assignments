
public class Prime 
{
	//@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] inp = { 2, 4, 6, 11, 12, 23 };
		int c = 0;
		int i1 = 0;
		int i2 = 0;
		int sum = 0;
		int c1 = 0;
		
        for( int i = 0; i < inp.length; i++ ){
            if( inp[i] == 2){

                System.out.println(inp[i]);
            }
            else {
            	for( int j = 3; j <= Math.sqrt(inp[i]); j++ ) {
            		if( inp[i]%j != 0 ) {
            			if( c == 0 ) {
            				if( inp[1] <= 9 ) {
            					System.out.println(inp[i]);
            				}
            				else {
            				i1 = inp[i]%10;
            				int a = inp[i];
            				a = a/10;
            				i2 = a;
            				sum = i1 + i2;
            				if( sum == 2 ) {
            				System.out.println(inp[i]);
            				}
            				else {
            					for( int k = 3; k <= Math.sqrt(sum); k++ ) {
            						if( sum%k != 0 ) {
            							
            								System.out.println(sum);
            								
            							
            						}
            					
            					}
            				}
            			}
            			c = 1;
            			}
            		}
            		c = 0;
            	}
            }
        }
	}
}
