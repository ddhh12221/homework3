package B04;
import java.io.*;

public class B04{
        void input(){
                Scanner s = new Scanner(System.in);
                System.out.println("연봉을 원단위로 입력하세요.");
                Double bong = s.nextDouble();
                
                
                Double tax =0.0;
                
                if (bong<10000000)
                {
                	tax = bong* 0.095;
                }
                else if (bong>=10000000 && bong<40000000)
                {
                	tax = bong*0.19;
                }
                else if (bong>=40000000 && bong<80000000)
                {
                	tax =bong *0.28;
                }
                else if (bong>=80000000)
                {
                	tax = bong *0.37;
                }
                System.out.println("연봉 금액에 대한 소득세는 "+ tax+ "입니다.");
                
        }
}
