

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<UsualPeople> arrayList = new ArrayList<>();
        int n = scanner.nextInt();
        for(int i = 0; i < n;i++){
            if (i%3 == 0) arrayList.add(new UsualPeople()));
            if (i%3 == 1) arrayList.add(new Professionals()));
            if (i%3 == 2) arrayList.add(new ForeignProfesionals()));
        }
        for (UsualPeople u : arrayList){
            u.talk();
        }
    }
}
