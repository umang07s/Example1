package car;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        CarCompany maruti = new CarCompany(1,"MARUTI-SUZUKI");
        CarCompany mahindra = new CarCompany(2,"MAHINDRA");
        CarCompany tata = new CarCompany(3,"TATA");
        CarCompany nissan = new CarCompany(4,"NISSAN");
        CarCompany renault = new CarCompany(5,"RENAULT");

        List<CarDetailsNew> carDetailsNew = new ArrayList<>();
        carDetailsNew.add(new CarDetailsNew(1111177,maruti,"Alto 800","STD(O)",
                340000,796,5,"Petrol,Cng"));
        carDetailsNew.add(new CarDetailsNew(1111178,renault,"Kwid","RZL 0.8",
                470000,799,5,"Petrol"));
        carDetailsNew.add(new CarDetailsNew(1111179,renault,"Triber","RXE",
                598000,799,7,"Petrol"));
        carDetailsNew.add(new CarDetailsNew(1111180,renault,"Kiger","RXE MT",
                600000,999,5,"Petrol"));
        carDetailsNew.add(new CarDetailsNew(1111181,nissan,"Magnite","XE",
                597000,999,5,"Petrol"));
         carDetailsNew.add(new CarDetailsNew(1111182,tata,"Punch","PURE MT",
                600000,1199,5,"Petrol"));
         carDetailsNew.add(new CarDetailsNew(1111185,tata,"Tigor","XE",
                    609000,1199,5,"Petrol"));
         carDetailsNew.add(new CarDetailsNew(1111187,mahindra,"Thar","AX (O) HARD TOP DIESEL MT RWD",
                    1139000,1497,4,"Diesel"));
        carDetailsNew.add(new CarDetailsNew(1111189,mahindra,"Thar","AX (O) HARD TOP PETROL MT RWD",
                1139000,1497,4,"Petrol"));


            List<CarDetailsOld> carDetailsOld = new ArrayList<>();
            carDetailsOld.add(new CarDetailsOld(maruti,"Wagone-R","Sep-2011",
                    2,250000,77050,"Cng"));
            carDetailsOld.add(new CarDetailsOld(maruti,"Swift-Desire","Sep-2011",
                    3,240000,188500,"Diesel"));
        carDetailsOld.add(new CarDetailsOld(maruti,"Baleno-","June-2018",
                1   ,571000,92168,"Petrol"));
        carDetailsOld.add(new CarDetailsOld(nissan,"Sunny","June-2013",
                1,351000,62300,"Diesel"));

//        List<CarDetailsNew> collect = carDetailsNew.stream().filter(carDetailsNew1 -> carDetailsNew1.getCarPrice() < 450000).collect(Collectors.toList());
//        System.out.println(collect);
//        List<CarDetailsOld> collect1 = carDetailsOld.stream().filter(c -> c.getCarPrice() >= 350000).collect  (Collectors.toList());
//        System.out.println(collect1);

//        Map<List<Integer>, List<User>> collect = userList.stream()
//                .filter(user -> SURAT.equalsIgnoreCase(user.getAddress().getCity())).collect(Collectors.groupingBy(user -> Arrays.asList(user.getAddress().getArea().getA(), user.getAddress().getArea().getB()),Collectors.toList()));
        System.out.println("-----------------------------------------------------");
        Map<List<CarDetailsNew>,List<CarDetailsOld>> map = new HashMap<>(  );
        map.put(carDetailsNew.stream().filter(carDetailsNew1 -> carDetailsNew1.getCarPrice()<500000).collect(Collectors.toList()), carDetailsOld.stream().filter(carDetailsOld1 -> carDetailsOld1.getCarPrice()< 500000).collect(Collectors.toList()));
        System.out.println(map);

        System.out.println("--------------------------------------------------------------------");
        List<List<?>> lists = Arrays.asList(carDetailsNew, carDetailsOld);
        System.out.println(lists);

        System.out.println("-------------------------------------------------------------------");
        for (int i = 0;i< carDetailsNew.size();i++){
            if (carDetailsNew.get(i).getSeatingCapacity()>5){
                System.out.println(carDetailsNew.get(i).getCarName());
            }
        }



        int[] arr = {1,2,3};
        System.out.println(arr.hashCode() + ", Address "+ arr.toString());
        Ex ex = new Ex(arr);
        arr[0] = 15;
        ex.showData();

        // Try with reference
        // Shallow vs Deep
        // Functional Interface, Lambda expression, Default method in interface
        // LocalDateTime, SimpleDateFormat
        // Optimistic vs Pessimistic
        // <T> Generic Type
        // Atomic, Synchronized, Volatile
        // Deadlock
        //
    }
}
