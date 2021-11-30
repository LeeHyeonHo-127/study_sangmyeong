import java.util.*;

public class Homework8 {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("myld", "myPass");
        map.put("myld2", "myPass2");
        map.put("myld3", "myPass3");

        Scanner scan=new Scanner(System.in);

        while(true){
            System.out.println("id와 password를 입력해주세요");
            System.out.println("id: ");
            String id=scan.nextLine().trim();


            if(!map.containsKey(id)){
                System.out.println("입력하신 id:"+id+"는 없다. "+"다시 입력해주세요");
                continue;
            }

            System.out.print("password: ");
            String password=scan.nextLine().trim();
            System.out.println();


            if(!(map.get(id)).equals(password)){
                System.out.println(id+"의 비밀번호 틀림. 다시 입력");
            }
            else{
                System.out.println(id+"와 비번"+password+"이 일치합니다.");
                break;
            }

        }
    }
}