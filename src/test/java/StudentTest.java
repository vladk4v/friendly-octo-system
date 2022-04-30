import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
	Student test1 = new Student("John", "SomeGroup", "123456");
	Student test2 = test1;
	Student test3 = new Student("Jane", "OtherGroup", "987654");

	@Test
	@DisplayName("Проверка имен")
	void getName() {
		assertEquals("John", test1.getName());
		assertEquals("Jane", test3.getName());
		assertNotEquals("Jon", test2.getName());
	}

	@Test
	@DisplayName("Проверка группы")
	void getGroup() {
		assertEquals("SomeGroup", test2.getGroup());
		assertNotEquals("AnotherGroup", test3.getGroup());
	}

	@Test
	@DisplayName("Проверка идентификационного номера студента")
	void getStudentId() {
		assertEquals("123456", test1.getStudentId());
		assertNotEquals(test1.getStudentId(), test3.getStudentId());
	}

	@Test
	@DisplayName("Проверка сравнения")
	void testEquals() {
		assertEquals(test1, test2);
		assertNotEquals(test2, test3);
	}
}