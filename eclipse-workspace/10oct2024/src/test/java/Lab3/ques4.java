package Lab3;

import java.util.Arrays; 

public class ques4 {

    public static void main(String[] args) {
     
        String[] details = new String[5];
        details[0] = "samsung";
        details[1] = "vivo";
        details[2] = "realme";
        details[3] = "nokia";
        details[4] = "lava";
        
        Arrays.sort(details);

        System.out.println(Arrays.toString(details));
    }
}
