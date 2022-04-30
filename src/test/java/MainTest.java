import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

	String test = "Joe, Group, 12345";
	String test1 = test;
	String test2 = "JohnJohn";
	String test3 = "John, AnotherGroup, 23456";


	@Test
	@DisplayName("Проверка распознавания студентов")
	void makeAStudent() {
		assertEquals("Студент добавлен в базу", Main.makeAStudent(test));
		assertEquals("Студент добавлен в базу", Main.makeAStudent(test3));
		assertEquals("Студент уже есть в базе", Main.makeAStudent(test1));
		assertEquals("Значения вводить следует через запятую, разделяя пробелом", Main.makeAStudent(test2));
	}
}