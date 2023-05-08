package student;

import java.util.*;
import java.util.stream.Collectors;

public class User {
    public static final String SURAT = "SURAT";
    int userId;
    String name;
    String email;
    Address address;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User(int userId, String name, String email, Address address) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\''+
                '}';
    }

    public static void main(String[] args) {
      /*  Co_Ordinates utran = new Co_Ordinates(6,20);
        Co_Ordinates motaVarachha = new Co_Ordinates(7,14);
        Co_Ordinates punaGam = new Co_Ordinates(7,17);

        Co_Ordinates naroda = new  Co_Ordinates(5,10);
        Co_Ordinates nikol = new Co_Ordinates(8,15);

        Address address1 = new Address(1,"Surat","Gujarat",utran);
        Address address2 = new Address(2,"Surat","Gujarat",motaVarachha);
        Address address3 = new Address(3,"Ahmedabad","Gujarat",naroda);
        Address address4 = new Address(4,"Ahmedabad","Gujarat",nikol);
        Address address5 = new Address(5,"Surat","Gujarat",punaGam);*/

        //        userList.add(new User(4,"Hardik","Hardik@Gmail.com",address2));
//        userList.add(new User(5,"Abcd","Hardik@Gmail.com",address2));
//        userList.add(new User(6,"Mahesh","Mahesh@Gmail.com",address5));
//        userList.add(new User(7,"Jatin","Jatin@Gmail.com",address5));
//
//        userList.add(new User(1,"Kevin","Kevin@Gmail.com",address3));
//        userList.add(new User(2,"Harjeet","Harjeet@Gmail.com",address4));


        List<User> userList = new ArrayList<>();
        userList.add(new User(
                3,"Ketan","Ketan@Gmail.com",
                new Address(1,"Surat","Gujarat",new Co_Ordinates(6,20))
        ));
        userList.add(new User(
                        4,"Hardik","Hardik@Gmail.com",
                                new Address(2,"Surat","Gujarat",
                                        new Co_Ordinates(7,14))
        ));
        userList.add(new User(4,"Sumit","Sumit@Gmail.com",
                new Address(2,"Surat","Gujarat",
                        new Co_Ordinates(7,14))
                ));
        userList.add(new User(6,"Mahesh","Mahesh@Gmail.com",
                new Address(5,"Surat","Gujarat",
                        new Co_Ordinates(7,17))
                ));
        userList.add(new User(7,"Jatin","Jatin@Gmail.com",
                new Address(5,"Surat","Gujarat",
                        new Co_Ordinates(7,17))
                ));
        userList.add(new User(2,"Parit","P@gmail.com",new Address(
                5,"Ahmedabad","Gujarat",new Co_Ordinates(5,15)
        )));
        userList.add(new User(1,"Kevin","Kevin@Gmail.com",
                new Address(3,"Ahmedabad","Gujarat",
                        new  Co_Ordinates(5,10))
                ));
        userList.add(new User(2,"Harjeet","Harjeet@Gmail.com",
                        new Address(4,"Ahmedabad","Gujarat",
                                new Co_Ordinates(8,15))
        ));

        System.out.println(userList);
        System.out.println("-----------------------------------");
        Map<List<Integer>, List<User>> collect = userList.stream()
                .filter(user -> SURAT.equalsIgnoreCase(user.getAddress().getCity())).collect(Collectors.groupingBy(user -> Arrays.asList(user.getAddress().getArea().getA(), user.getAddress().getArea().getB()),Collectors.toList()));

        System.out.println(collect);

        for (int i = 0;i< userList.size();i++){
            if (userList.get(i).getAddress().equals(SURAT)) {
                System.out.println(userList.get(i));
            }
        }

//        Map<List<Integer>, List<User>> collect = userList.stream().filter(user -> SURAT.equalsIgnoreCase(user.getAddress().getCity()))
//                .collect(Collectors.groupingBy(user -> Arrays.asList(user.getAddress().getArea().getA(),
//                        user.getAddress().getArea().getB()), Collectors.toList()));
//        System.out.println(collect);

        //        userList.add(new User(6,"Hardik","hardik@gmail.com",address2,pg));

      /*  List<List<User>> lists = Arrays.asList(userList);
        System.out.println(lists);

        System.out.println("-------------------------------------------");
//        List<Co_Ordinates> collect = userList.stream().map(User::getCoOrdinates).collect(Collectors.toList());

        for (int i = 0;i< userList.size();i++){
            if (userList.get(i).coOrdinates.equals(utran)) {
                System.out.println(userList.get(i));
            }
        }
        for (int i = 0;i< userList.size();i++){
            if (userList.get(i).address.equals(address5.getCity().equals("Surat"))) {
                System.out.println(userList.get(i));
            }
        }
        System.out.println("-----------------------gfgjd------------");

        List<User> surat = userList.stream().filter(user -> user.getAddress().getCity().equals("Surat")).collect(Collectors.toList());
        System.out.println(surat);
        System.out.println("----------------------------------");

        List<User> collect = userList.stream().filter(user -> user.getCoOrdinates().equals(utran)).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("-------------------------------------------------------------------");*/

//        List<User> SURAT = userList.stream().filter(user -> user.getAddress().getCity().equalsIgnoreCase(sUrat)).collect(Collectors.toList());
//        System.out.println(SURAT);
//        Set<Co_Ordinates> Co = new HashSet<>();
//        for (int i = 0; i < userList.size(); i++) {
//            if (userList.get(i).getAddress().getCity().equalsIgnoreCase(SURAT)){
//                Co.add(userList.get(i).getCoOrdinates());
//            }
//        }
//        System.out.println(Co);
//        for (Co_Ordinates s: Co) {
//            for (int j = 0; j < userList.size(); j++) {
//                if(s.equals(userList.get(j).coOrdinates)){
//                    System.out.println(userList.get(j));
//                }
//            }
//        }

//        List<String> collect1 = userList.stream().map(user -> user.getCoOrdinates().toString()).collect(Collectors.toList());
//        System.out.println(collect1);

        String [] arr = {"Xes","Axit","yash","Denish","Rupen","harsil","Meet"};

        String temp = "";

        for (int i = 0;i< arr.length;i++){
          arr[i] =  arr[i].toUpperCase();
//            char ch = arr[i].charAt(i);
           for (int j = i+1;j< arr.length;j++){
               arr[j] =  arr[j].toUpperCase();
               if (arr[i].charAt(0)>arr[j].charAt(0)){
                    temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
        }
        System.out.println(Arrays.toString(arr));

    }
}


