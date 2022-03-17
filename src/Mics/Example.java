import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Member {
    int id;
    double loan;
    int age;
    String gender;

    public Member(int id, double loan, int age, String gender) {
        this.id = id;
        this.loan = loan;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Member [age=" + age + ", gender=" + gender + ", id=" + id + ", loan=" + loan + "]";
    }

}

public class Example {

    public static void main(String[] args) {
        List<Member> list = new ArrayList<Member>();
        list.add(new Member(1, 1000, 23, "M"));
        list.add(new Member(2, 2000, 24, "F"));
        list.add(new Member(3, 3000, 25, "M"));
        list.add(new Member(4, 4000, 26, "F"));
        System.out.println(getLoan(3, list));
        System.out.println(getLoan2(2, list));
        List<Member> genderList = getLoan3(1, list);
        genderList.stream().map(Member::getGender).collect(Collectors.toList()).forEach(System.out::println);
    }

    // with using the :: operator
    // using findFirst() method to get Optional<Double>
    // using .get() to get Double if not present will throw NoSuchElementException
    public static double getLoan(int id, List<Member> list) {
        return list.stream().filter(x -> x.id == id).map(x -> x.loan).findFirst().get();
    }

    // with using the :: operator
    // using findFirst() method to get Optional<Double>
    // using .get() to get Double if not present will throw NoSuchElementException
    public static double getLoan2(int id, List<Member> list) {
        return list.stream().filter(x -> x.id == id).map(Member::getLoan).findFirst().get();

    }

    // if we want to return a collection of results use collect() method
    public static List<Member> getLoan3(int id, List<Member> list) {
        return list.stream().filter(x -> x.id > id).collect(Collectors.toList());
    }

}
