package gr.aueb.cf.ch14Singleton_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Demonstrates the use of Reflection with the Student class.
 */
public class Main {

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("gr.aueb.cf.ch14Singleton_Reflection.Student");

            Constructor<?> defaultCtr = clazz.getConstructor();
            defaultCtr.setAccessible(true);
            Student student1 = (Student) defaultCtr.newInstance();

            Constructor<?> longCtr = clazz.getConstructor(Long.class);
            Student student2 = (Student) longCtr.newInstance(10L);

            Constructor<?> stringCtr = clazz.getConstructor(String.class);
            Student student3 = (Student) stringCtr.newInstance("John");

            Constructor<?> stringCtr2 = clazz.getConstructor(String.class);
            Student student4 = (Student) stringCtr2.newInstance("W.");

            Method sayHello = clazz.getMethod("sayHello");
            sayHello.invoke(student1, student2, student3);

            System.out.println();

            Constructor<?>[] ctrList = clazz.getDeclaredConstructors();
            System.out.println(Arrays.toString(ctrList));

            System.out.println();

            Method[] mList = clazz.getDeclaredMethods();
            for (Method m : mList) {
                System.out.println("Method name" + m.getName());
                int mod = m.getModifiers();
                System.out.println(Modifier.toString(mod));
            }

            System.out.println();

            Field[] flist = clazz.getDeclaredFields();
            for (Field f : flist) {
                System.out.println("Field name: " + f.getName());
                int mod = f.getModifiers();
                System.out.println(Modifier.toString(mod));
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
