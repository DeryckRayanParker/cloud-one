import ua.princeton.lib.In;
import ua.princeton.lib.StdIn;



private class Tester {

	public static void main(String[] args) {
		In in = new In("dictionary.txt");
		SearchDictionary dictionary = new SearchDictionary();
		
		while (in.hasNextLine()) {
			String s = in.readLine();
			dictionary.addWord(s);
		}
		
		String query = "De*";
		for (String dict : dictionary.query(query))
			System.out.println(dict);

	}

}
