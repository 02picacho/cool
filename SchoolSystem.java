import java.util.ArrayList;

public class SchoolSystem implements ISignUP {
    public static void main(String[] args) throws Exception {
        IParams params = ISignUP.parse();//SchoolSystem.parse();
        SchoolSystem sc = new SchoolSystem(params.getBig(), params.getMedium(), params.getSmall());

        ArrayList<Integer> plan = params.getPlanSignUp();

        for (int i = 0; i < plan.size(); i++) {
            //sc.addStudent(plan.get(i));
            //System.out.println("is" + plan.get(i));
           // System.out.println("da " + sc.big+sc.medium+sc.small);
            strings += " " + sc.addStudent(plan.get(i));
        }
        sc.print();
    }
//注释abababa
    static String[] strs;
    static String strings = "null";

    static String str;
    static Integer big;
    static Integer medium;
    static Integer small;


    SchoolSystem(Integer big, Integer medium, Integer small) {
        setBig(big);
        setMedium(medium);
        setSmall(small);
    }

    SchoolSystem() {
    }


    public ArrayList<Integer> getPlanSignUp() {
        ArrayList arrayList = new ArrayList();

        return arrayList;
    }

    public String[] parse(String input) {
        return strs = new String[]{input};
    }


    static void setBig(Integer _big) {
        big = _big;
    }

    public Integer getBig() {
        return big;
    }

    static void setMedium(Integer _medium) {
        medium = _medium;
    }

    public Integer getMedium() {
        return medium;
    }

    static void setSmall(Integer _small) {
        small = _small;
    }

    public Integer getSmall() {
        return small;
    }

    @Override
    public void print() {
System.out.print("输出：");
        System.out.println(strings);
    }

    @Override
    public boolean addStudent(int stuType) {

        if (stuType == 1 && 0 < big&&big!=null) {
            big--;
            return true;
        } else {
            if (stuType == 2 && 0 < medium&&medium!=null) {
                medium--;
                return true;

            } else {
                if (stuType == 3 && 0 < small&&small!=null) {
                    small--;
                    return true;
                } else {
                    return false;
                }
            }


        }

    }
}//xiugai

//修改
//第二分支
