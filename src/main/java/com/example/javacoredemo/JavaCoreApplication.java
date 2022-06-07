package com.example.javacoredemo;

import com.example.javacoredemo.jdkjrejvm.ClassLoaderDemo;
import com.example.javacoredemo.jdkjrejvm.JITCompilerGraalVM;
import com.example.javacoredemo.oop.abstrct.MountainBike;
import com.example.javacoredemo.oop.abstrct.SportsBike;
import com.example.javacoredemo.oop.encapslation.Person;
import com.example.javacoredemo.oop.intrfc.Rectangle;
import com.example.javacoredemo.oop.intrfc.Square;
import com.example.javacoredemo.oop.plymrphism.Java;
import com.example.javacoredemo.oop.plymrphism.Langauge;
import com.example.javacoredemo.oop.plymrphism.Pattern;
import com.example.javacoredemo.oop.supr.Dog;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaCoreApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;

        int choice;

        while(true){
            System.out.println("++++++++ Java Core menu +++++++++++++++++");
            System.out.println("1. OOP: Class Abstraction \n");
            System.out.println("2. OOP: Super keyword \n");
            System.out.println("3. OOP: Interface \n");
            System.out.println("4. OOP: Polymorphism using method overriding \n");
            System.out.println("5. OOP: Polymorphism using Method Overloading \n");
            System.out.println("6. OOP: Encapsulation \n");
            System.out.println("11. Class Loader \n");
            System.out.println("12. JIT Compiler \n");
            System.out.println("0. Exit \n");
            System.out.println("\nEnter your menu choice number... ");

            choice = input.nextInt();

            switch(choice){
                case 1:
                    System.out.println(" *******  OOP Abstraction example...");
                    MountainBike mountainBike = new MountainBike();
                    mountainBike.brake();
                    SportsBike sportsBike = new SportsBike();
                    sportsBike.brake();
                    System.out.println("\n\n");
                    break;
                case 2:
                    System.out.println(" *******  Super keyword...");
                    Dog dog = new Dog();
                    dog.printType();
                    System.out.println("\n\n");
                    break;
                case 3:
                    System.out.println(" *******  Interface ...");
                    Rectangle rectangle = new Rectangle();
                    rectangle.getArea();
                    rectangle.getSides();
                    Square square = new Square();
                    square.getArea();
                    square.getSides();
                    System.out.println("\n\n");
                    break;
                case 4:
                    System.out.println(" *******  Polymorphism using method overriding ...");
                    // create an object of Java class
                    Java java = new Java();
                    java.displayInfo();

                    // create an object of Language class
                    Langauge langauge = new Langauge();
                    langauge.displayInfo();
                    System.out.println("\n\n");
                    break;
                case 5:
                    System.out.println(" *******  Polymorphism using Method Overloading ...");
                    Pattern pattern = new Pattern();

                    // call method without any argument
                    pattern.display();
                    System.out.println("\n");

                    // call method with a single argument
                    pattern.display('#');
                    System.out.println("\n\n");
                    break;
                case 6:
                    System.out.println(" *******  Encapsulation ...");
                    // create an object of Person
                    Person person = new Person();

                    // change age using setter
                    person.setAge(24);

                    // access age using getter
                    System.out.println("My age is " + person.getAge());
                    System.out.println("\n\n");
                    break;                     case 11:
                    System.out.println(" *******  Class Loader...");
                    ClassLoaderDemo classLoaderDemo = new ClassLoaderDemo();
                    classLoaderDemo.getDemo();
                    System.out.println("\n\n");
                    break;
                case 12:
                    System.out.println(" *******  Java core: JIT compiler ...");
                    JITCompilerGraalVM jitCompilerGraalVM = new JITCompilerGraalVM();
                    String text = "po3mrdvfEfvefvVRETrthbBTYrtbrwtbgWErbfvgtwertBRTWRtbrwytntyhWecweFCTYntYN";
                    jitCompilerGraalVM.countUppercase(text);
                    System.out.println("\n\n");
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("This is not a valid manu option! try again");
                    System.out.println("\n\n");
                    break;
            }


        }
//        class loader example
//        ClassLoaderDemo classLoaderDemo = new ClassLoaderDemo();
//        classLoaderDemo.getDemo();

//        JITCompilerGraalVM jitCompilerGraalVM = new JITCompilerGraalVM();
//        String text = "po3mrdvfEfvefvVRETrthbBTYrtbrwtbgWErbfvgtwertBRTWRtbrwytntyhWecweFCTYntYN";
//        jitCompilerGraalVM.countUppercase(text);

//        SpringApplication.run(DemoJavaApplication.class, args);
    }

}
