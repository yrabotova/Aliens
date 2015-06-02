import java.util.Scanner;


public class aliens {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.print("Numbers of test:");
		int test = sca.nextInt();
		for (int j = 0; j < test; j++) {
			if (test > 40) {
				System.out
						.println("Not fulfill the condition!");
				break;
			} else {
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the word:");
				String word = input.nextLine();
				if ((word.length() < 2) || (word.length() > 100000)) {
					System.out.println("Not fulfill the condition!");
				} else {
					System.out
							.print("Enter text:");
					String text = input.nextLine();
					if ((text.length() < word.length())
							|| (text.length() > 100000)) {
						System.out.println("Not fulfill the condition!");
					} else {
						String quote = text;
						int index = quote.indexOf(word);
						int lastIndex = 0;
						int count = 0;
						while ((lastIndex = text.indexOf(word, lastIndex)) != -1) {
							count++;
							lastIndex = lastIndex + word.length() - 1;
						}

						System.out.println("Enter the word is repeated exactly "
								+ count + ".");
						{
							if (count == 0) {
								System.out.print("");
							} else {

								System.out
										.print("Enter the word starts indices ¹:");
							}
							while (index != -1) {
								System.out.print(" " + index);
								index = quote.indexOf(word, index + 1);
							}
							{
								System.out.println();
							}
						}
					}
				}
			}
		}
	}
}
