package com.example.demo.bean;

/**
 * @author 周瑶
 * @description TODO
 * @Date: 2018/11/15
 */
public class person {

    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class DemoStringEquals{
    public static void main(String[] args) {
           test2();
    }

    public static void test2(){
        //基本数据类型
        int a=5;
        int b=6;
        int c=5;
        System.out.println("a==b:"+(a==b));
        System.out.println("a==c:"+(a==c));

        //类类型变量
        person p1=new person("a",1);
        person p2=new person("a",1);

        System.out.println("p1==p2:"+(p1==p2));
        System.out.println("p1.equals(p2):"+p1.equals(p2));


        //String 类重写了equals()方法

        //str1和st2是两个不同的类（即共两辆汽车），但是str1和str2的内容相同，都是“a”(即，这两辆汽车一模一样，完全相同)
        String str1= new String("a") ;
        String str2= new String("a");

        String str3= "ab" ;
        String str4= "ab" ;
        String str5= "1" ;
        String str6= "1" ;
        String str7= "22" ;
        String str8= "22" ;
        String str9= "" ;
        String str10= " " ;
        String str11= null ;
        String s=str1;
        //==比较的是对象，.equals()比较的是内容
        System.out.println("str1==str2 : "+(str1==str2));
        System.out.println("str1.equals(str2) : "+(str1.equals(str2)));
        System.out.println("str1==str3 : "+(str1==str3));
        System.out.println("str1.equals(str3) : "+(str1.equals(str3)));
        System.out.println("str1==str10 : "+(str1==str10));
        System.out.println("str1.equals(str10): "+(str1.equals(str10)));
        System.out.println("str1==str11 : "+(str1==str11));
        System.out.println("str1.equals(str11) : "+(str1.equals(str11)));
        System.out.println("str10.equals(str11) : "+(str10.equals(str11)));
        System.out.println("str1==s : "+(str1==s));
        System.out.println("str1==str11 : "+(str1==str11));
        System.out.println("str1.equals(s) : "+(str1.equals(s)));
        System.out.println("str1.equals(a) : "+(str1.equals("a")));
        System.out.println("str1==a : "+(str1=="a"));
        System.out.println("str11==null : "+(str11==null));
        System.out.println("str11!=null : "+(str11!=null));

    }
}
