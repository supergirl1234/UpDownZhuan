package com;

/**
 * Author:Fanleilei
 * Created:2019/2/12 0012
 */
public class Test4 {


    public static void main(String[] args) {
      //子类对象，向上转型
        Person person=new Student();
        System.out.println(person.getPersonInfo());
        person.print();//子类对象

        //父类对象，向下转型

        /*Student student= (Student) new Person();
        student.getStudentInfo();*/  //编译通过，运行CCE

        Student student= (Student) person;
        System.out.println(student.getStudentInfo());
        student.print();

        //对象  instanceof 类名

        System.out.println(person instanceof Student);
        System.out.println(student instanceof Student);


         Person person1=new Student();
         if (person1 instanceof  Student){
             Student student1 =(Student) person1;
             System.out.println("Person对象能转换成Student对象");
         }else{
             System.out.println("Person对象不能转换成Student对象");
         }


    }
}


class Person{


    //成员方法
    public void print(){
        System.out.print("这是Person的print方法");
    }

    //父类方法
    public void hello(){
        System.out.println("这是Person的hello方法");

    }

    public String getPersonInfo(){
        return "person info";
    }
}

class Student extends Person{


    //复写了父类的print方法
    // public >  protected  > [default] > private
    public void print(){
        System.out.println("这是Student的print方法");
    }

    //子类方法
    public void hello(){

      System.out.println("这是Student的hello方法");
    }

    public String getStudentInfo(){
        return "Student info";
    }
}