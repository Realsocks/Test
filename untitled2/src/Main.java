

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        People val;
        ArrayList<UsualPeople> arrayList = new ArrayList<>();
        int n = scanner.nextInt();
        for(int i = 0; i < n;i++){
            if (i%3 == 0) val = new UsualPeople()));
            if (i%3 == 1) val = new Professionals()));
            if (i%3 == 2) val = new ForeignProfesionals()));
            arrayList.add(val);
        }
        for (UsualPeople u : arrayList){
            u.talk();
        }
    }
}
