import java.util.Scanner;

class counting{
    void tofind(String s,String word){
        String temp[]=s.split(" ");
        int i,count =0;
        for(i=0;i<temp.length;i++) {
          if(word.equals(temp[i]))
            count++;
        }
        System.out.println("The word ' "+ word +" ' occurs "+count + " times in the above text");
    }
}

public class count{
      public static void main(String[] args) {
        String s,word;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the text: ");
        s = sc.nextLine();
        System.out.print("Enter the word to be counted: ");
        word = sc.nextLine();
        counting obj=new counting();
        obj.tofind(s,word);
                
  }
}