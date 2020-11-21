

//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
class Employee {
	String fullName;
	String position;
	String email;
	String tel;
	double salary;
	int age;

	//2. Конструктор класса должен заполнять эти поля при создании объекта.
	Employee(String _fullName, String _position, String _email, String _tel, double _salary, int _age) {
		this.fullName = _fullName;
		this.position = _position;
		this.email = _email;
		this.tel = _tel;
		this.salary = _salary;
		this.age = _age;
	}

	int getAge() {
		return age;
	}

	//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
	void employeeFullInfo() {
		System.out.println("Имя сотрудника: " + fullName
				+ " Должность: " + position
				+ " Почта: " + email
				+ " Телефон: " + tel
				+ " Зарплата: " + salary
				+ " Возраст: " + age);
	}

}

public class Main {
	public static void main(String[] args) {
		//4. Создать массив из 5 сотрудников.
		Employee[] person = new Employee[5];
		person[0] = new Employee("Иванов Иван Иванович", "Engeneer", "ivan@ivan.com", "+7(999)123-45-67", 10.1, 10);
		person[1] = new Employee("Петров Пётр Петрович", "Astronaut", "petr@petr.com", "+7(998)123-45-67", 20.2, 20);
		person[2] = new Employee("Мавроди Сергей Пантелеевич", "Chair", "mmm@mmm.com", "+7(997)123-45-67", 30.3, 30);
		person[3] = new Employee("Индульгендский Инокентий Потапович", "Slacker", "papaFrom@papaFrom.com", "+7(996)123-45-67", 40.4, 41);
		person[4] = new Employee("Заберинова Тудоя Отсюдовна", "Deserter", "cantToucThis@cantToucThis.com", "+7(995)123-45-67", 50.5, 50);

		//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

		for (Employee item : person) {
			if (item.getAge() > 40) {
				item.employeeFullInfo();
			}

		}
	}
}



