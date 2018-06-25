package ua.ictloud.lessons;

//import ua.ictloud.lessons.oop.Car;
import ua.ictloud.lessons.oop.Car;
import ua.ictloud.lessons.oop.SportCar;

/**
 * Created by student on 11-Apr-18.
 */
public class Main {
    public static void main(String[] args) {


       SportCar sc = new SportCar(34.5,"red",true);
//        sc.setMaxSpeed(223.5);
//        sc.setSpolier(true);
//
//        System.out.println("Max speed: " + sc.getMaxSpeed());
//        System.out.println("Tuning SPOLIER: " + sc.isSpolier());



    }

}


//    List<String> strings = Arrays.asList("bqwEq", "aw2", "DddQda", "LaaLa");
//
//
//    List<String> result = new ArrayList<>();
//        for (String string : strings) {
//                if (string.length()>4) {
//                result.add(string.toLowerCase());
//                }
//                }
//                Collections.sort(result, new Comparator<String>() {
//@Override
//public int compare(String o1, String o2) {
//        return o2.compareTo(o1);
//        }
//        });
//        System.out.println(result);
//
//// withs Streams
//        List<String> streamResult = strings.stream()
//        .filter(s -> s.length()>4)
//        .map(String::toLowerCase)
//        .sorted(Comparator.reverseOrder())
//        .collect(Collectors.toList());
//        System.out.println(streamResult);
//        }