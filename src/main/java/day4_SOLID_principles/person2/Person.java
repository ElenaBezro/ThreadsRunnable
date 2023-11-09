package day4_SOLID_principles.person2;

public class Person {
    public void study() {
        System.out.println("study");
    }

    public void work() {
        System.out.println("work");
    }
    //Imagine an interface Person with methods study(), work(), and play().
    // Break it down so that Student and Worker classes can implement only the methods relevant to them.
}
