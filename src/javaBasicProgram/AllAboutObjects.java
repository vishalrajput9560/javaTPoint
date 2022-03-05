package javaBasicProgram;

public class AllAboutObjects {
    // Objects are the basic building blocks in any Oops language..

    /* there are five ways to create objects in java...

    1. By using new Keyword
       eg. ClassName object=new ClassName();

    2. By using Clone method..
       ClassName obj1=new Classname();
       ClassName obj2=(ClassName)obj1.clone();

    3. By using newInstance() method of the class..
    4. By using newInstance() method of the constructor class.
    5. By using Deserialization



    // How to compare 2 objects in java..
    1. By using equals() method..

    Double x=new Double(123.4555);
    Long y=new Long(12345);

    sout(x.equals(y));   //return false;
    sout(x.equals(123.4555));   //return true;


    == compares that two reference are identical or not
    .equals compares that the two objects are identical or not

    eg: obj1==obj2 test the identity, not equality. whereas obj1.equlas(obj2)) test the
        equality of the objects

    2. By using hashCode..
       Java hash code is a 32bit signed integer value provided by JVM to every created object.
       The Hash code is managed by hash-Based data Structure.. e.g: hash table, hash set

       eg: Employee em1=new Employee(101,"Vishal");
           Employee em2=new Employee(101,"Vishal");
           int a= em1.hashCode();
           int b= em2.hashCode();
          // both a and B hashcode is different

          if i use em1.equals(em2)); // will return false as a output

     */
}
