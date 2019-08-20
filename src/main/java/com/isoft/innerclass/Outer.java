package com.isoft.innerclass;
/**
*@author john
*@createTime 2019年8月16日 上午10:52:05
*@describe  https://blog.csdn.net/zhao_miao/article/details/83245816
*内部类： 所谓内部类就是在一个类内部进行其他类结构的嵌套操作。
*/
class Outer{
    private String str ="外部类中的字符串";
    //************************** 
    //定义一个内部类，可以加访问控制修饰符 public  private 等
    class Inner{
        private String inStr= "内部类中的字符串";
        //定义一个普通方法
        public void print(){
            //调用外部类的str属性
            System.out.println(str);
        }
    }
    //************************** 
    //在外部类中定义一个方法，该方法负责产生内部类对象并调用print()方法
    public void fun(){
        //内部类对象
        Inner in = new Inner();
        //内部类对象提供的print
        in.print();
    }
    
    
    public static void main(String[] args)
    {
        //创建外部类对象
        Outer out = new Outer();
        //外部类方法
        out.fun();
    }
    
}

