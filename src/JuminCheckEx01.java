
public class JuminCheckEx01 {
	public static void main(String[] args) {
		
		if( args.length != 1 ) {
			System.out.println( "Java 클래스명 xxxxxx-xxxxxxx 형식으로 입력해주세요." );
		} else {
			String strJumin = args[0].replaceAll( "-", "" );
			
			int [] bits = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
			int sum = 0;
			for( int i=0; i<bits.length; i++ ) {
				sum += Integer.parseInt( strJumin.substring( i, i+1 ) ) * bits[i];
			}
			int lastNum = Integer.parseInt( strJumin.substring( 12, 13 ) );
			int resultNum = ( 11 - ( sum % 11 ) ) % 10;
			
			if( lastNum == resultNum ) {
				System.out.println( "주민등록번호 형식이 맞음" );
			} else {
				System.out.println( "주민등록번호 형식이 틀림" );				
			}
		}
		
	}
}
