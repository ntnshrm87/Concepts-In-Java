package enum_itrs_litrs;


enum fruits{
	apple, banana, litchi, orange, mango, melon
}

public class enum_basic {
	public static void main(String[] args) {
	fruits buy_item;
	System.out.println("**********welcome to Kisaan fruit Mandi...*************");
	fruits[] al = fruits.values();
	System.out.println("Froots in the mandi are: ");
	for (fruits fr : al) {
		System.out.println(fr);
	}
	buy_item = fruits.valueOf("apple");
	System.out.println("We went there to buy: "+buy_item);
	}
}
