package experience4;

public class Graduate implements Student, Teacher{
	    private String name;
	    private String sex;
	    private int age;
	    private double xuefei;
	    private double salary;
	    public void setName(String a) {
	        name = a;
	    }
	    public void setSex(String a) {
	        sex = a;
	    }
	    public void setAge(int a) {
	        age = a;
	    }
	    public void setmoney(double a, double b) {
	        xuefei = a;
	        salary = b;
	    }
	    public double setxuefei(){
	        return 0;
	    }
	    public double getxuefei(){//返回每学年的费用
	        return xuefei * 2;
	    }
	    public double setsalary(){
	        return 0;
	    }
	    public double getsalary(){//返回年收入
	        return salary * 12;
	    }

	}


