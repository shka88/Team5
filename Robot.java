                               
/**
 * 교통신호에 따라 RobotWalk 속도가 변경되는 프로그램
 * 
 * @author (2018315030 이가영,2018315059 이와사키 메구미) 
 * @version (2020.04.10)
 */
public class Robot
{
    public static void  RobotWalk(String color, double speed){
        if(color.equals("green")){
            System.out.println(speed + "km/h로 보행을 계속합니다.");
        }
        else if(color.equals("yellow")){
            System.out.println(speed*1.2 + "km/h로 걷습니다.");
        }
        else{
            System.out.println("보행속도를 0km/h로 합니다.");
        }
    }
}