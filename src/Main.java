public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int age = 17;
        if (age>=18){
            System.out.println("если возраст человека равен " +age +", то он совершеннолетний");
        } else {
            System.out.println("если возраст человека равен " +age +", то он не достиг " +
                    "совершеннолетия, надо подождать");
        }
        System.out.println("_______________________________________________________________________");

        System.out.println("Task 2");
        int temperature = 8;
        System.out.print("На улице " +temperature +" градусов,");
        if(temperature >=5){
            System.out.println(" можно идти без шапки.");
        } else {
            System.out.println(" нужно надеть шапку.");
        }
        System.out.println("_______________________________________________________________________");

        System.out.println("Task 3");
        int speed = 60;
        System.out.print("Если скорость " +speed +", то ");
        if (speed > 60){
            System.out.println("придется заплатить штраф.");
        } else {
            System.out.println("можно ездить спокойно.");
        }
        System.out.println("_______________________________________________________________________");

        System.out.println("Task 4");
        int age4 = 24;
        System.out.print("если возраст человека равен " +age4 +", то ему нужно ходить ");
        if (age4>=2 && age4<=6){
            System.out.println("в детский сад.");
        } if (age4>=7 && age4<=17){
            System.out.println("в школу");
        } if (age4>=18 && age4<=24){
            System.out.println("в университет");
        } if(age4>24){
            System.out.println("на работу");
        }
        System.out.println("_______________________________________________________________________");

        System.out.println("Task 5");
        int age5 = 8;
        System.out.print("если возраст ребенка равен " +age5 +", то ему ");
        if (age5<5){
            System.out.println("нельзя кататься на аттракционе.");
        } if (age5>=5 && age5<14){
            System.out.println("можно кататься на аттракционе в сопровождении взрослого.");
        } if (age5>=14){
            System.out.println("можно кататься на аттракционе без сопровождения взрослого.");
        }
        System.out.println("_______________________________________________________________________");

        System.out.println("Task 6");
        int passengersNumber = 60;

        if (passengersNumber<=60){
            System.out.println("В вагоне есть сидячее место");
        } else if (passengersNumber >60 && passengersNumber <=102){
            System.out.println("В вагоне есть только стоячее место");
        } else {
            System.out.println("В вагоне нет мест.");
        }
        System.out.println("_______________________________________________________________________");

        System.out.println("Task 7");
        int one = 7;
        int two = 9;
        int three = 8;

        if (one > two && one>three) {
            System.out.println("самое большое число " + one);
        } else if (two > one && two >three){
            System.out.println("самое большое число " + two);
        } else if (three > one && three > two){
            System.out.println("самое большое число " + three);
        }
        System.out.println("_______________________________________________________________________");

    }
}