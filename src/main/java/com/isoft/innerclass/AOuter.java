package com.isoft.innerclass;
/**
*@author john
*@createTime 2019年8月16日 上午11:17:39
*@describe 去掉内部类之后发现程序更加难以理解
*/
class AOuter{
    private String outStr ="AOuter中的字符串";
    public String getOutStr()
    {
        return outStr;
    }
    public void fun(){  //2
        //this表示当前对象
        AInner in = new AInner(this); //3
        in.print();                 //5
    }
    
    public static void main(String[] args)
    {
        AOuter out = new AOuter();  //1.
        out.fun(); //2.
    }
    
}
class AInner{
    private String inStr= "Inner中的字符串";
    private AOuter out;
    //构造注入
    public AInner(AOuter out)  //3
    {
        this.out=out;       //4.为Inner中的out变量初始化
    }
    public void print(){    //6
        System.out.println(out.getOutStr()); //7
    }
} 
