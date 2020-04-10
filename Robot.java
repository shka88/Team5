
/**
 * 교통신호에 따라 RobotWalk 속도가 변경되는 프로그램
 * 
 * @author (2018315030 이가영,2018315059 이와사키 메구미) 
 * @version (2020.04.10)
 */
public class Robot
{ 
    public static double RobotWalk(String color, double speed){
        if(color.equals("green")){
            return speed;
        }
        else if(color.equals("yellow")){
            return speed*1.2 ;
        }
        else{
            return speed;
        }
    }
}