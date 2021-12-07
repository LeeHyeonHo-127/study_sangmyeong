import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Homework9 {
    public static void main(String[] args){

        BufferedReader f = new BufferedReader(new FileReader("db.txt"));
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("myld", "myPass");
        map.put("myld2", "myPass2");
        map.put("myld3", "myPass3");


        while(true){
            System.out.println("id와 password를 입력해주세요");
            System.out.println("id: ");
            int id = f.read();
            while (id != -1)
            {
                System.out.print((char) id);
                id = f.read();
            }


            if(!map.containsKey(id)){
                System.out.println("입력하신 id:"+id+"는 없다. "+"다시 입력해주세요");
                continue;
            }

            System.out.print("password: ");
            int pw = f.read();
            while (pw != -1)
            {
                System.out.print((char) pw);
                pw = f.read();
            }
            System.out.println();


            if(!(map.get(id)).equals(pw)){
                System.out.println(id+"의 비밀번호 틀림. 다시 입력");
            }
            else{
                System.out.println(id+"와 비번"+pw+"이 일치합니다.");
                break;
            }

        }
    }
}