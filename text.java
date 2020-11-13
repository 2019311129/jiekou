package experience4;

public class text {
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
        
        
}