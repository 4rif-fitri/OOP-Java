class TestMultiCatch {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[6] = 30 / 1;

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array tak muat");

		} catch (ArithmeticException e) {
			System.out.println("bahagi zero");
		}

		catch (Exception e) {
			System.out.println("commnet error");
		}

		System.out.println("rest of the code....");

	}
}