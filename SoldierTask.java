import java.util.*;
public class SoldierTask {

    public static void main(String[] args) {

//        2. A group of soldiers sitting in circle and have only one sword with them. Instead of getting caught by
//        enemies they decide to die. So the plan is every soldier kills person sitting right to him
//        and passes sword. But one soldier intends to get caught, problem is where should he sit in circle
//        so that we wont get killed.
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, input the number of Soldiers");
        int SolNum = sc.nextInt();
        Soldiers(SolNum);

    }

    private static void Soldiers(int SolNum) {            
        
       List<Integer> Sol = new ArrayList<Integer>();
       int count=0;
        
        for (int x = 1; x <= SolNum; x++) {
            Sol.add(x);
        }
        while(Sol.size()!=1){
            if(count >Sol.size()-1){
                count =0;
            }
            else{
                if(count+1 == Sol.size()){                    
                    Sol.remove(0);
                }else{                    
                    Sol.remove(count+1);
                }
                count ++;
            }
        }
        System.out.println("Soldier "+Sol.get(0)+" survive");
        
    }

}

