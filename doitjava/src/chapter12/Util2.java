package chapter12;

public class Util2 {
	public static <K, V> boolean compare(Pair<K, V> pp, Pair<K, V> ppp) {
		boolean keyCompare = pp.getKey().equals(ppp.getKey());
		boolean valueCompare = pp.getValue().equals(ppp.getValue());
		return keyCompare && valueCompare;
	}
}
