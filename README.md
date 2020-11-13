# Java实验
## 一、实验目的<br></br>
  - 掌握Java中抽象类和抽象方法的定义； 
  + 掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
  * 了解异常的使用方法，并在程序中根据输入情况做异常处理

## 实验要求
  - 在博士研究生类中实现各个接口定义的抽象方法;
  + 对年学费和年收入进行统计，用收入减去学费，求得纳税额；
  * 国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。
  - 实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
  + 根据输入情况，要在程序中做异常处理。

  
### 实验过程
- （1）某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
+ （2）设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
- （3）设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。 
+ （4）编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。

### 实验步骤
- （1）先设置4个类Graduate，Student, Teacher，text。并声明缴纳学费，查询学费（学生管理接口），支付薪水，查询薪水，教师管理接口。
+ （2）利用set与get方法来实现以上两个接口，同时添加姓名，性别，年龄，每学期学费，每月薪水属性。 对博士研究生类进行复写（toString），以便在Test类中输出。
- （3）自定义异常类Aexception，以便在Test类中能使用户输入正确的姓名。
+ （4）定义两个接口teacher student 并声明方法 2.在Graduate类中写出研究生应有的属性及学费和工资的算法并实现两个接口中的方法 3.在test中写出纳税额的算法输入月工资和学费，经过计算输出结果
### 核心代码
    public static void main(String[] args) {
        Graduate graduate = new Graduate();
        graduate.setName("shw");//设置姓名
        graduate.setmoney(8000, 2000);//设置每学期的费用,月工资
        System.out.println("shw学费为："+graduate.getxuefei());
        System.out.println("shw年收入为："+graduate.getsalary()); 
        System.out.println("shw纳税额："+((graduate.getsalary()*0.25)-1005));
        graduate.setmoney(4000, 2000);//设置每学期的费用,月工资
        System.out.println("hw学费为："+graduate.getxuefei());
        System.out.println("hw年收入为："+graduate.getsalary()); 
        System.out.println("hw纳税额："+((graduate.getsalary()*0.25)-1005)); 
        }
## 实验图片


## 实验感想
这次实验主要体现了抽象类，接口与异常处理的使用，Java中接口的定义， 当程序完成后，学会了对程序细节的优化，抽象类与接口的使用。接口的重要性:在Java编程,abstract class 和interface是支持抽象类定义的两种机制。正是由于这两种机制的存在,才使得Java成为面向对象的编程语言。 异常处理方法将要处理的代码放入try块中，然后创bai建相应的catch块的列表。如果du生成都异常与catch中提到的zhi相匹配，那么catch条件中的块语句就被执行。try块后可能有许多catch块，每个都处理不同的异常。每个catch中的参数都是Exception的子类。异常处理目的在于便于调试代码，更改代码 。
