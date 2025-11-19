public class Practice {
	public static void main(String[] args){
		String s = "KiKoroTumi??";
		String s2 = "hello";
		
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		System.out.println(s.indexOf('o'));
		System.out.println(s.substring(3,7));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.isEmpty());
		System.out.println(s.compareTo(s2));
		System.out.println(s.equals(s2));
	}
}