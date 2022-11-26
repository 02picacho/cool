import java.util.ArrayList;
import java.util.Scanner;

public interface ISignUP {
    public void print();

    // 检查是否有 stuType对应的班级名额
    // 如果没有剩余名额，请返回 false ，否则学生将报名进入该班级并返回 true
    public boolean addStudent(int stuType);


    // 解析命令行输入的参数（格式），如文档描述
    public static IParams parse() throws Exception {
        String[] strings;

        Scanner sc=new Scanner(System.in);

        System.out.println("输入:");
       SchoolSystem.str=sc.nextLine();

        strings=SchoolSystem.str.split(" ");
        System.out.println(SchoolSystem.str);
       // System.out.println("ababa"+strings[0]+strings[1]+strings[2]);

        SchoolSystem.setBig(Integer.valueOf(strings[0]));
        //System.out.println(SchoolSystem.big+"bbb"+strings[0]);

        SchoolSystem.setMedium(Integer.valueOf(strings[1]));
        //System.out.println(SchoolSystem.medium+"mmm"+strings[1]);

        SchoolSystem.setSmall(Integer.valueOf(strings[2]));
       // System.out.println(SchoolSystem.small+"sss"+strings[2]);

        IParams iParams=new IParams() {
            @Override
            public int getBig() {
                if (SchoolSystem.big!=null){
                return SchoolSystem.big;}
                else return 0;
            }

            @Override
            public int getMedium() {
                if (SchoolSystem.medium!=null)
                return SchoolSystem.medium;
                return 0;
            }

            @Override
            public int getSmall() {
                if(SchoolSystem.small!=null)
                return SchoolSystem.small;
                return 0;
            }

            @Override
            public ArrayList<Integer> getPlanSignUp() {

                ArrayList<Integer> input = new ArrayList();

                for(int i=3;i< strings.length;i++){
                    input.add(Integer.valueOf(strings[i]));
                }
                return input;
            }

        };
        return iParams;
    }
}