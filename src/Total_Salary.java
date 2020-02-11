import java.util.Scanner;
public class Total_Salary {
        static Scanner s = new Scanner(System.in);
        private static double totalSalary(int basic, char ch){
            int basic_2_= basic;
            double total = 0;
            double hra = (0.2)*basic_2_;
            double da = (0.5)*basic_2_;

            double pf = (0.11)*basic_2_;
            if(ch == 'A'){
                total += (basic + hra + da+1700) - pf;
            }
            else if(ch == 'B'){
                total += basic + hra + da +1500 - pf;
            }
            else if(ch == 'C'){
                total += basic + hra + da + 1300 - pf;
            }
            else{
                total += basic + hra + da + 1300 -pf;
            }
            return total;

        }
        public static void main(String[] args) {
            int basic = s.nextInt();
            String str = s.next();
            char ch = str.charAt(0);
            double result = totalSalary(basic, ch);
            System.out.println(Math.round(result));

        }
    }


