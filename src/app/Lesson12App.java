public class Lesson12App {

    public static void main(String[] args){

        Employee employee1 = new Employee("Родіон Плахотнюк Вікторович", 22, "Фахівець ВМТП", "raidertwk@gmail.com", +380961493875L);
        System.out.println(employee1);


        Car car1 = new Car();
        car1.start();
        System.out.println("Автомобіль перевірено, та запущено!");
    }
}


