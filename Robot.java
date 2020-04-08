
/**
 * 여기에 Robot 클래스 설명을 작성하십시오.
 * 
 * @author (2018315030 이가영, 2018315059 이와사키 메구미) 
 * @version (2020.04.08)
 */
public class Robot
{
    public static void main(String[] args){
        String color;
        int speed;
        
    
    
    }
    
    public static void RobotWalk(String color, double speed){
        if(color.equals("gleen")){
            System.out.println("속도를 유지하고 보행합니다.");
        }
        else if(color.equals("yellow")){
            System.out.println("보행속도를 " + speed*1.2 + "km/h로 걷습니다.");
        }
        else{
            System.out.println("동작을 멈춥니다.");
        }
    }
}
