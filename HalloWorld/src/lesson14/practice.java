
//	string型の配列を作成し、アルファベットa～jまでを格納してください。
//	brake文を使用し、a～dまで表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	          
//	cotinue文を使用し、i以外を表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	           e
//	           f
//	           g
//	           h
//	           j

package lesson14;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] str = {"a","b","c","d","e","f","g","h","i","j"};
//		格納確認
//		System.out.println(str[4]);
		for(String alphabet : str) {
			if(alphabet.equals("e")) { 
			break;
			}		
		System.out.println(alphabet);
		}
//		cotinue文
		for(String alphabet : str) {
			if(alphabet.equals("i")) { 
			continue;
			}		
		System.out.println(alphabet);
		}
	}

}
