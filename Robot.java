import java.util.Scanner;
/**
 * 여기에 Robot 클래스 설명을 작성하십시오.
 * 
 * @author (2018315030 이가영, 2018315059 이와사키 메구미) 
 * @version (2020.04.08)
 */
public class Robot
{
    public static void main(String[] args){
        int speed = 5;
        
        System.out.println("교통신호의 상태는?");
        Scanner scanner = new Scanner(System.in);
        String color = scanner.next();
        
        RobotWalk(color,speed);
    
    }
    
    public static void RobotWalk(String color, double speed){
        if(color.equals("green")){
            System.out.println("보행속도를" + speed + "km/h를 유지하며 걷습니다.");
        }
        else if(color.equals("yellow")){
            System.out.println("보행속도를 " + speed*1.2 + "km/h로 걷습니다.");
        }
        else{
            System.out.println("동작을 멈춥니다.");
        }
    }
}
