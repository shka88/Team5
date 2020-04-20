
/**
 * 교통신호에 따라 RobotWalk 속도가 변경되는 프로그램 Unit Test
 * 
 * @author (2018315030 이가영,2018315059 이와사키 메구미) 
 * @version (2020.04.18)
 */
public class Robot2
{
    private String color;
    private double speed;
    
    public String getColor(){
        return this.color;
    }
    
    public double getSpeed(){
        if((color.equals("green"))){
        }
        else
        {
            if(color.equals("yellow")){
                speed = speed*1.2;
            }
            else
            {
                speed = 0;
            }
        }
        return this.speed;
    }
}
