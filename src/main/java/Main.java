import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	private static HashSet<Student> students = new HashSet<>();
	private static Scanner scan = new Scanner(System.in);

	protected static String makeAStudent(String line) {
		try {
			String[] income = line.split(", ");
			Student newbie = new Student(income[0], income[1], income[2]);
			if (students.contains(newbie)) {
				return "Студент уже есть в базе";
			} else {
				students.add(newbie);
				return "Студент добавлен в базу";
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			return "Значения вводить следует через запятую, разделяя пробелом";
		}
	}

	private static void showAList() {
		Iterator<Student> i = students.iterator();

		System.out.println("Список студентов: ");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

	public static void main(String[] args) {

		System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");

		while (true) {

			String input = scan.nextLine();

			if (input.equals("end")) {
				break;
			} else {
				System.out.println(makeAStudent(input));
			}
			System.out.println("Введите информацию о студенте: (для выхода введите end)");
		}
		showAList();
	}
}
