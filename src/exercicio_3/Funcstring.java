package exercicio_3;

public class Funcstring {

	public static void main(String[] args) {
		
		String original = "abcdr FGHIJ ABC abc DEFG";
		String s = "potato apple lemon";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xz");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		String[] vect = s.split(" ");
		/*String word 1 = vect[0];
		String word 2 = vect[1];
		String word 3 = vect[2];*/
		
		System.out.println("Original: - " + original);
		System.out.println("toLowerCase: - " + s01);
		System.out.println("toUpperCase: - " + s02);
		System.out.println("Trim: - " + s03);
		System.out.println("substring(2) - " + s04);
		System.out.println("Substring(2, 9) - " + s05);
		System.out.println("Replace: - " + s06);
		System.out.println("replace: - " + s07);
		System.out.println("Index Of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
		System.out.println("Parte 1: " + vect[0]);
		System.out.println("Parte 2: " + vect[1]);
		System.out.println("Parte 3: " + vect[2]);
	}

}
