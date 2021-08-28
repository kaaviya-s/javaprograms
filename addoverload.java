class addition{
    
    void sum(int a,int b,int c,int d){
        int add_i=a+b+c+d;
        System.out.println("Addition of four numbers (in integer):"+add_i);
    }
     
    void sum(double a,double b,double c,double d){
        double add_d=a+b+c+d;
        System.out.println("Addition of four numbers(in double):"+add_d);
    }
    
    void sum(float a,float b,float c,float d){
        float add_f=a+b+c+d;
        System.out.println("Addition of four numbers (in float):"+add_f);
    }
   
}

public class addoverload {
   public static void main(String args[]){
       addition obj=new addition();
       obj.sum(1,2,5,4);
       obj.sum(1.15d,2.25d,3.75d,4.35d);
       obj.sum(1.5f,4.5f,9.5f,1.5f);
   } 
}
